import java.util.Collection;

public class Game
{

	public Game()
	{
		
	}
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Game game = new Game();
		Integer numPlayers = game.GetNumberOfPlayers();
		
		for(int x=0; x<numPlayers; x++)
		{
			Player newPlayer = new Player();
			game.AddPlayer(newPlayer);
		}
		
	}
	
	public void AddPlayer(Player newPlayer)
	{
		thePlayers.add(newPlayer);
	}
	
	public Integer GetNumberOfPlayers()
	{
		return 4;
	}
	
	class Tableau
	{
		
	}
	
	class AgeDeck extends AbstractDeck
	{
		
	}
	
	private Collection<Player> thePlayers;
	private AgeDeck FirstAge;
	private AgeDeck SecondAge;
	private AgeDeck ThirdAge;
	private AgeDeck FourthAge;
	private AgeDeck FifthAge;
}
