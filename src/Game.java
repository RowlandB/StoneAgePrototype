import java.util.ArrayList;
import java.util.Collection;

public class Game
{

	public Game()
	{
		GameNotOver = true;
		thePlayers = new ArrayList<Player>();
		board = new Tableau();
	}
	
	
	public static void main(String[] args)
	{		
		Game game = new Game();
		Integer numPlayers = game.GetNumberOfPlayers();
		game.AddPlayer(new HumanPlayer());
		
		for(int x=0; x<numPlayers-1; x++)
		{
			Player newPlayer = new AIPlayer();
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
				board.refill();
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

