import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Tableau
{
	Tableau()
	{
		IO = new System_IO_Object();
		
		ONE_ROW_SIZE = 5;
				
		AgeDeck FirstAge = new AgeDeck("Age1.csv", ONE_ROW_SIZE);//TODO
		Decks.add(FirstAge);
//		SecondAge = new AgeDeck("");//TODO
//		ThirdAge = new AgeDeck("");//TODO
//		FourthAge = new AgeDeck("");//TODO
//		FifthAge = new AgeDeck("");//TODO
		
		MoveToAge(1);
	}
	
	public Collection<Card> GetCards()
	{
		Collection<Card> Cards = new ArrayList<Card>();
		
		for(AgeDeck Deck : Decks)
		{
			Cards.addAll(Deck.getCards());
		}
		
		return Cards;
	}
	
	public void MoveToAge(Integer Age)
	{
		ArrayList<Integer> blarg = new ArrayList<Integer>();
		if(Age.equals(1))
		{
			blarg.add(5);
			blarg.add(0);
			blarg.add(0);
			blarg.add(0);
			blarg.add(0);
		}
		else if(Age.equals(2))
		{
			blarg.add(1);
			blarg.add(4);
			blarg.add(0);
			blarg.add(0);
			blarg.add(0);			
		}
		else if(Age.equals(3))
		{
			blarg.add(1);
			blarg.add(1);
			blarg.add(3);
			blarg.add(0);
			blarg.add(0);
		}
		else if(Age.equals(4))
		{
			blarg.add(0);
			blarg.add(1);
			blarg.add(1);
			blarg.add(3);
			blarg.add(0);
		}
		else if(Age.equals(5))
		{
			blarg.add(0);
			blarg.add(0);
			blarg.add(1);
			blarg.add(1);
			blarg.add(3);
		}
		
		for(int x=0; x<Decks.size(); x++)
		{
			((ArrayList<AgeDeck>) Decks).get(x).MoveToNextAge(blarg.get(x));
		}
		
	}
	
	public void refill()
	{
		for(AgeDeck Deck : Decks)
		{
			Deck.Refill();
		}
	}
	
	public void display()
	{
		IO.Output_String("Board:");

		Collection<Card> CardsOnTheBoard = GetCards();
		for(Card card : CardsOnTheBoard)
		{
				card.display();				
		}
		
	}
	
	public Card purchaseCardByLocation(int x)
	{
		x = x-1; //deal with human 1 indexing
		
		int which_age = 0;
		while(x >= ONE_ROW_SIZE)
		{
			x = x - ONE_ROW_SIZE;
			which_age++;
		}
		
		
		AgeDeck Age = ((ArrayList<AgeDeck>) Decks).get(which_age);
		Card WhichCard = Age.GetCardAtLocation(x);
		
		Age.remove(WhichCard);
		
		return WhichCard;
	}
	
	class AgeDeck extends AbstractDeck
	{
		public AgeDeck(String FileLocation, Integer ROW_SIZE)
		{
			populateDeck(FileLocation);
			CardsOnBoard = new ArrayList<Card>();
			ONE_ROW_SIZE = ROW_SIZE;
			NumberOfRows = 0;
			
		}
		
		public void MoveToNextAge(Integer number_of_rows)
		{
			if(number_of_rows < NumberOfRows)
			{
				Iterator<Card> iterator = CardsOnBoard.iterator();
				int num_cards_to_remove = (NumberOfRows - number_of_rows)*ONE_ROW_SIZE;
				for(int x=0; x<num_cards_to_remove; x++)
				{
					iterator.remove();
					iterator.hasNext();
				}
			}
			
			NumberOfRows = number_of_rows;
			Refill();
		}
		
		public void Refill()
		{
			while(CardsOnBoard.size() < NumberOfRows*ONE_ROW_SIZE)
			{
				CardsOnBoard.add(drawCard());
			}
		}

		public void remove(Card WhichCard)
		{
			CardsOnBoard.remove(WhichCard);
		}
		
		public Card GetCardAtLocation(int x)
		{
			return ((ArrayList<Card>) CardsOnBoard).get(x);
		}

		public Collection<Card> getCards()
		{
			return CardsOnBoard;
		}

		Collection<Card> CardsOnBoard;
	}
	
	Collection<AgeDeck> Decks;
//	private AgeDeck FirstAge;
//	private AgeDeck SecondAge;
//	private AgeDeck ThirdAge;
//	private AgeDeck FourthAge;
//	private AgeDeck FifthAge;
	private Integer ONE_ROW_SIZE;
	private Integer NumberOfRows;

	private IO_Object IO;

}
