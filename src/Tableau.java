import java.util.Collection;

public class Tableau
{
	Tableau()
	{
		FirstAge = new AgeDeck("");//TODO
		SecondAge = new AgeDeck("");//TODO
		ThirdAge = new AgeDeck("");//TODO
		FourthAge = new AgeDeck("");//TODO
		FifthAge = new AgeDeck("");//TODO
	}
	
	public Collection<Card> GetCards()
	{
		return CardsOnTheBoard;
	}
	
	public void PopulateBoard(Integer Age)
	{
		if(Age.equals("1"))
		{
			while(CardsOnTheBoard.size() < BoardSize)
			{
				CardsOnTheBoard.add(FirstAge.drawCard());
			}
		}
		else if(Age.equals("2"))
		{
			
		}
		else if(Age.equals("3"))
		{
			
		}
		else if(Age.equals("4"))
		{
			
		}
		else
		{
			
		}
	}
	
	class AgeDeck extends AbstractDeck
	{
		public AgeDeck(String FileLocation)
		{
			// TODO Auto-generated constructor stub
		}
		
	}
	
	
	private Collection<Card> CardsOnTheBoard;
	private Integer BoardSize;
	private AgeDeck FirstAge;
	private AgeDeck SecondAge;
	private AgeDeck ThirdAge;
	private AgeDeck FourthAge;
	private AgeDeck FifthAge;

}
