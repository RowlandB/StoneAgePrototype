import java.util.Collection;

public class Player
{
	Player()
	{
		playerBoard = new Board();
		playerDeck = new PlayerDeck();
		playerHand = new HandOfCards();
	}
	
	public void takeTurn()
	{
		
	}
	
	public void addCardToDiscard(Card theCard)
	{
		playerDeck.addCardToDiscard(theCard);
	}
	
	public void addCardToBoard(Card theCard)
	{
		playerBoard.addCardToBoard(theCard);
	}
	

	class Board
	{
		public void addCardToBoard(Card theCard)
		{
			theBoard.add(theCard);
		}
		
		
		private Collection<Card> theBoard;
	}
	
	class HandOfCards
	{
		
		private Collection<Card> theHand;
	}
	
	class PlayerDeck extends AbstractDeck
	{
		public PlayerDeck()
		{
			
		}
		
		public void addCardToDiscard(Card theCard)
		{
			discard.addCardToDiscard(theCard);
		}
		
		private void resetDeck()
		{
			theCards.addAll(discard.allCards());
			this.shuffleDeck();
		}
		
		private DiscardPile discard;
	}
	
	class DiscardPile
	{
		public void addCardToDiscard(Card theCard)
		{
			discardPile.add(theCard);
		}
		
		public Collection<Card> allCards()
		{
			return discardPile;
		}
		
		private Collection<Card> discardPile;
	}
	

	private Board playerBoard;
	private PlayerDeck playerDeck;
	private HandOfCards playerHand;

}
