import java.util.Collection;


public class HumanPlayer extends Player
{
	public HumanPlayer()
	{
		IO = new System_IO_Object();
	}
	
	@Override
	public Card chooseCardToBuy(Tableau entireBoard)
	{
		//display board
		entireBoard.display();
		
		//display cards
		stuffPlayerHas.display();
		
		//display number of buys
		IO.Output_String(numberOfBuys.toString());
		
		//TODO
		return null;
	}

	
	private IO_Object IO;
}
