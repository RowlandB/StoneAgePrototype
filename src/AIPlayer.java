import java.util.Collection;


public class AIPlayer extends Player
{

	public AIPlayer()
	{
		IO = new System_IO_Object();
	}
	
	@Override
	public Card chooseCardToBuy(Tableau entireBoard)
	{
		Collection<Card> potentials = entireBoard.GetCards();
		
		for(Card AllCards: potentials)
		{
			AllCards.display();
		}
		
		IO.Output_Batch();
		
		
		return null;
	}
	
	
	private IO_Object IO;
}
