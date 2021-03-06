
public class Cost
{
	Cost(Integer FoodCost, Integer WorkCost, Integer SmartCost, Integer CultureCost, Integer HolyCost)
	{
		IO = new System_IO_Object();
		
		Food = FoodCost;
		Work = WorkCost;
		Smartness = SmartCost;
		Culture = CultureCost;
		Holiness = HolyCost;		
	}
	
	@Override
	public String toString()
	{
		return "Food: " + Food.toString() 
				+ ", Work: " + Work.toString() 
				+ ", Smartness: " + Smartness.toString()
				+ ", Culture: " + Culture.toString()
				+ ", Holiness: " + Holiness.toString();
	}
	
	public boolean LessThan(Cost other)
	{
		if(other.Food < this.Food)
		{
			return false;
		}
		else if(other.Work < this.Work)
		{
			return false;
		}
		else if(other.Smartness < this.Smartness)
		{
			return false;
		}
		else if(other.Culture < this.Culture)
		{
			return false;
		}
		else if(other.Holiness < this.Holiness)
		{
			return false;
		}
		
		return true;
	}
	
	public void addResources(Cost cost)
	{
		// TODO Auto-generated method stub
		this.Food = this.Food + cost.Food;
		this.Work = this.Work + cost.Work;
		this.Smartness = this.Smartness + cost.Smartness;
		this.Culture = this.Culture + cost.Culture;
		this.Holiness = this.Holiness + cost.Holiness;		
	}

	public void display()
	{
		IO.Output_String(this.toString());
	}
	
	private Integer Food;
	private Integer Work;
	private Integer Smartness;
	private Integer Culture;
	private Integer Holiness;
	private IO_Object IO;
}
