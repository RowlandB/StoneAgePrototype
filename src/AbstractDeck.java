import java.util.Collections;
import java.util.List;

abstract public class AbstractDeck
{
	
	public Card drawCard()
	{
		Card drawnCard = theCards.get(0);
		theCards.remove(0);
		return drawnCard;
	}
	
	public void shuffleDeck()
	{
		Collections.shuffle(theCards);
	}
	
	protected List<Card> theCards;
}

