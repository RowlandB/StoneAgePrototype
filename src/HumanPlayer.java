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
		//display cards
		IO.Output_String("Played Cards:");
		stuffPlayerHas.display();
		
		//display number of buys
		IO.Output_String("Buys:");
		IO.Output_String(numberOfBuys.toString());
		
		//display board
		entireBoard.display();

		//TODO
		String x = IO.Input_String();
		

		return null;
	}

	
	private IO_Object IO;
}
