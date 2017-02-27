
public abstract class Card
{
	public Card()
	{
		IO = new System_IO_Object();
	}
	
	abstract void gainCard(Player gainer);
	abstract void playCard(Player player);
	
	public void display()
	{
		IO.Output_String(CardText);
	}
	
	private String CardText;
	private IO_Object IO;
}

class WorkerCard extends Card
{

	@Override
	void gainCard(Player gainer)
	{
		gainer.addCardToDiscard(this);		
	}

	@Override
	void playCard(Player player)
	{
		// TODO Auto-generated method stub
	}
	
}

class BuildingCard extends Card
{

	@Override
	void gainCard(Player gainer)
	{
		gainer.addCardToDiscard(this);
	}

	@Override
	void playCard(Player player)
	{
		// TODO Auto-generated method stub
		
	}
	
}

class TechnologyCard extends Card
{

	@Override
	void gainCard(Player gainer)
	{
		gainer.addCardToBoard(this);
	}

	@Override
	void playCard(Player player)
	{
		// TODO Auto-generated method stub
		
	}
	
}

class InterventionCard extends Card
{

	@Override
	void gainCard(Player gainer)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	void playCard(Player player)
	{
		// TODO Auto-generated method stub
		
	}
	
}

