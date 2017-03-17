import java.util.ArrayList;
import java.util.Collection;

abstract public class Player
{
	Player()
	{
		playerBoard = new Board();
		playerDeck = new PlayerDeck();
		playerHand = new HandOfCards();
		numberOfBuys = 2;
		stuffPlayerHas = new Cost(0, 0, 0, 0, 0);
		
		playerHand.drawHand();
	}
	
	public void takeTurn(Tableau entireBoard)
	{
		playerBoard.upkeep();
		
		playerHand.playAllCards();
		Card choice = null;
		
		choice = chooseCardToBuy(entireBoard);
		while(choice != null)
		{
			choice.gainCard(this);
			choice = chooseCardToBuy(entireBoard);
		}
		
	}
	
	abstract public Card chooseCardToBuy(Tableau entireBoard);	
	
	private void drawCard()
	{
		Card drawnCard = playerDeck.drawCard();
		playerHand.addCard(drawnCard);
	}
	
	public void addCardToDiscard(Card theCard)
	{
		playerDeck.addCardToDiscard(theCard);
	}
	
	public void addCardToBoard(Card theCard)
	{
		playerBoard.addCardToBoard(theCard);
	}
	
	public Cost getResources()
	{
		return stuffPlayerHas;
	}
	
	public void gainResources(Cost cost) 
	{
		stuffPlayerHas.addResources(cost);
	}
	
	class Board
	{
		public Board()
		{
			theBoard = new ArrayList<Card>();
		}
		
		public void addCardToBoard(Card theCard)
		{
			theBoard.add(theCard);
		}
		
		
		public void upkeep()
		{
			// TODO Auto-generated method stub
			
		}


		private Collection<Card> theBoard;
	}
	
	class HandOfCards
	{
		public HandOfCards()
		{
			handSize = 5;
			theHand = new ArrayList<Card>();
		}
		
		public void addCard(Card drawnCard)
		{
			theHand.add(drawnCard);
		}

		private void drawHand()
		{
			for(int x=0; x<handSize; x++)
			{
				Player.this.drawCard();
			}
		}
		
		public void playAllCards()
		{
			for(Card EachCard : theHand)
			{
				EachCard.playCard(Player.this);
			}
		}
		
		private Collection<Card> theHand;
		private Integer handSize;
	}
	
	class PlayerDeck extends AbstractDeck
	{
		public PlayerDeck()
		{
			populateDeck("PlayerDeck.csv");
			discard = new DiscardPile();
		}
		
		@Override
		public Card drawCard()
		{
			if(deckIsEmpty())
			{
				resetDeck();
			}
			
			return super.drawCard();
		};
		
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
	protected Integer numberOfBuys;
	
	protected Cost stuffPlayerHas;
	
}
