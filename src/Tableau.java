import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Tableau
{
	Tableau()
	{
		CardsOnTheBoard = new ArrayList<Card>();
		
		BoardSize = 20;
		
		ONE_ROW_SIZE = 5;
				
		FirstAge = new AgeDeck("Age1.csv");//TODO
//		SecondAge = new AgeDeck("");//TODO
//		ThirdAge = new AgeDeck("");//TODO
//		FourthAge = new AgeDeck("");//TODO
//		FifthAge = new AgeDeck("");//TODO
				
		
		PopulateBoard(1);
	}
	
	public Collection<Card> GetCards()
	{
		return CardsOnTheBoard;
	}
	
	public void PopulateBoard(Integer Age)
	{
		if(Age.equals(1))
		{
			while(CardsOnTheBoard.size() < BoardSize)
			{
				CardsOnTheBoard.add(FirstAge.drawCard());
			}
		}
		else if(Age.equals(2))
		{
			List<Card> TempCards = new ArrayList<Card>(CardsOnTheBoard);
			TempCards.subList(0, BoardSize-ONE_ROW_SIZE-1).clear();
			
			for(int x=0; x<BoardSize-ONE_ROW_SIZE; x++)
			{
				TempCards.add(SecondAge.drawCard());
			}
		}
		else if(Age.equals(3))
		{
			List<Card> TempCards = new ArrayList<Card>(CardsOnTheBoard);
			TempCards.subList(0, BoardSize-ONE_ROW_SIZE-1).clear();
			
			for(int x=0; x<BoardSize-ONE_ROW_SIZE; x++)
			{
				TempCards.add(ThirdAge.drawCard());
			}
		}
		else if(Age.equals(4))
		{
			List<Card> TempCards = new ArrayList<Card>(CardsOnTheBoard);
			TempCards.subList(0, BoardSize-ONE_ROW_SIZE-1).clear();
			
			for(int x=0; x<BoardSize-ONE_ROW_SIZE; x++)
			{
				TempCards.add(FourthAge.drawCard());
			}
		}
		else
		{
			List<Card> TempCards = new ArrayList<Card>(CardsOnTheBoard);
			TempCards.subList(0, BoardSize-ONE_ROW_SIZE-1).clear();
			
			for(int x=0; x<BoardSize-ONE_ROW_SIZE; x++)
			{
				TempCards.add(FifthAge.drawCard());
			}
		}
	}
	
	public void display()
	{
		for(Card theCard : CardsOnTheBoard)
		{
			theCard.display();
		}
	}
	class AgeDeck extends AbstractDeck
	{
		public AgeDeck(String FileLocation)
		{
			populateDeck(FileLocation);
		}
		
	}
	
	
	private Collection<Card> CardsOnTheBoard;
	private Integer BoardSize;
	private AgeDeck FirstAge;
	private AgeDeck SecondAge;
	private AgeDeck ThirdAge;
	private AgeDeck FourthAge;
	private AgeDeck FifthAge;
	private Integer ONE_ROW_SIZE;

	
}
