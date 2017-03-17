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

		String x = IO.Input_String();
		Card theCard = entireBoard.purchaseCardByLocation(Integer.parseInt(x));

		return theCard;
	}

	
	private IO_Object IO;
}
