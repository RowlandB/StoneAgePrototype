
public abstract class Card
{
	public Card(Cost requires, Cost gives, String text, String name)
	{
		IO = new System_IO_Object();
		CardText = text;
		CardName = name;
	}
	
	abstract void gainCard(Player gainer);
	abstract void playCard(Player player);
	abstract void upkeepInPlay();
	
	public boolean purchasable(Player buyer)
	{
		return cost.LessThan(buyer.getResources());
	}
	
	public void display()
	{
		IO.Output_String(cost.toString());
		IO.Output_String(CardText);
	}
	
	private Cost cost;
	private String CardText;
	private IO_Object IO;
	private String CardName;
}

class WorkerCard extends Card
{

	public WorkerCard(Cost requires, Cost gives, String text, String name)
	{
		super(requires, gives, text, name);
	}

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

	@Override
	void upkeepInPlay()
	{
		//do nothing because this shouldn't ever be in play
	}
	
}

class BuildingCard extends Card
{

	public BuildingCard(Cost requires, Cost gives, String text, String name)
	{
		super(requires, gives, text, name);
	}

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

	@Override
	void upkeepInPlay()
	{
		// TODO Auto-generated method stub
		
	}
	
}

class TechnologyCard extends Card
{

	public TechnologyCard(Cost requires, Cost gives, String text, String name)
	{
		super(requires, gives, text, name);
	}

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

	@Override
	void upkeepInPlay()
	{
		// TODO Auto-generated method stub
		
	}
	
}

class InterventionCard extends Card
{

	public InterventionCard(Cost requires, Cost gives, String text, String name)
	{
		super(requires, gives, text, name);
	}

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

	@Override
	void upkeepInPlay()
	{
		//do nothing because this shouldn't ever be in play
	}
	
}


