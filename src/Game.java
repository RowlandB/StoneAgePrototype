import java.util.Collection;

public class Game
{

	public Game()
	{
		GameNotOver = true;
		
	}
	
	
	public static void main(String[] args)
	{		
		Game game = new Game();
		Integer numPlayers = game.GetNumberOfPlayers();
		
		for(int x=0; x<numPlayers; x++)
		{
			Player newPlayer = new HumanPlayer();
			game.AddPlayer(newPlayer);
		}
		
		
		
		game.PlayGame();
		
	}
	
	public void PlayGame()
	{
		while(GameNotOver)
		{
			for(Player eachplayer : thePlayers)
			{
				eachplayer.takeTurn(board);
			}
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
	
	
	
	private Collection<Player> thePlayers;
	boolean GameNotOver;
	Tableau board;
}

