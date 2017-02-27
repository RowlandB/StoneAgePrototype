
public abstract class Card
{
	abstract void gainCard(Player gainer);
	abstract void playCard(Player player);
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

