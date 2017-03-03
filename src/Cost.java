
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
	
	public void display()
	{
		
	}
	
	private Integer Food;
	private Integer Work;
	private Integer Smartness;
	private Integer Culture;
	private Integer Holiness;
	private IO_Object IO;
}
