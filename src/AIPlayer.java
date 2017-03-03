import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class AIPlayer extends Player
{

	public AIPlayer()
	{
	}
	
	@Override
	public Card chooseCardToBuy(Tableau entireBoard)
	{
		
		Collection<Card> allCards = entireBoard.GetCards();
		
		ArrayList<Card> cardsToBuy = new ArrayList<Card>();
		
		for(Card potentials: allCards)
		{
			if(potentials.purchasable(this))
			{
				cardsToBuy.add(potentials);
			}
		}
		
		cardsToBuy.add(null);
		Collections.shuffle(cardsToBuy);
		
		return cardsToBuy.get(0);
	}
	
}
