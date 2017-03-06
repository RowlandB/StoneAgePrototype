import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract public class AbstractDeck
{
	public AbstractDeck()
	{
		IO = new System_IO_Object();
	}
	
	public Card drawCard()
	{
		Card drawnCard = theCards.get(0);
		theCards.remove(0);
		return drawnCard;
	}
	
	public void populateDeck(String FileLocation)
	{
		theCards = new ArrayList<Card>();
		
		//String FILE_LOCATION = "C:\\Users\\brownr\\Documents\\GitHub\\StoneAgePrototype\\StoneAgePrototype\\";
		String FILE_LOCATION = "C:\\Users\\Rowland Brown\\workspace\\StoneAgePrototype\\";
		
		
		String everything = IO.File_Input(FILE_LOCATION + FileLocation);
		String[] booga_booga = everything.split("\n");
		
		for(String whole_card : booga_booga)
		{
			Card blerg;
			
			String[] arg = whole_card.split(",");
			String Card_Type = arg[1];

			Cost actual_cost = new Cost(Integer.parseInt(arg[2]),		//Food
										Integer.parseInt(arg[3]),		//Work
										Integer.parseInt(arg[4]),		//Smart
										Integer.parseInt(arg[5]),		//Culture
										Integer.parseInt(arg[6]));		//Holy
			Cost given_rec = new Cost(Integer.parseInt(arg[7]),			//Food
										Integer.parseInt(arg[8]),		//Work
										Integer.parseInt(arg[9]),		//Smart
										Integer.parseInt(arg[10]),		//Culture
										Integer.parseInt(arg[11]));		//Holy
			
			String card_text = arg[12];
			String name = arg[15];
			Integer VP = Integer.parseInt(arg[13]);//not sure on this one
			
			if(Card_Type.equals("Worker"))
			{
				blerg = new WorkerCard(actual_cost, given_rec, card_text, name, VP);					
			}
			else if(Card_Type.equals("Building"))
			{
				blerg = new BuildingCard(actual_cost, given_rec, card_text, name, VP);
			}
			else if(Card_Type.equals("Technology"))
			{
				blerg = new TechnologyCard(actual_cost, given_rec, card_text, name, VP);
			}
			else 
			{
				blerg = new InterventionCard(actual_cost, given_rec, card_text, name, VP);
			}
			
			for(int x=0; x<Integer.parseInt(arg[0]); x++)
			{
				theCards.add(blerg);
			}
			
		}
		
		
	}
	
	
	public void shuffleDeck()
	{
		Collections.shuffle(theCards);
	}
	
	public boolean deckIsEmpty()
	{
		return(theCards.size()==0);
	}
	
	private IO_Object IO;
	protected List<Card> theCards;
}

