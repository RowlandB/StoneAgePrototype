import java.util.Scanner;

//////////////////////////////
//Exactly what it says on the tin: handles input and output
abstract class IO_Object
{
	public String Input_String(){
		return "balls. This shouldn't have been called";
	}
	
	public void Output_Batch(){}
	
	public void Output_String(String output){}
	
	public void Partial_List_Output_String(int which, String Output)
	{
		Output_String(Integer.toString(which) + ") " + Output);
	}

	public void Partial_List_Output_String(int which, String Output, boolean b)
	{
		Output_String(Integer.toString(which) + ") " + Output);
	}
}

//uses System IO
class System_IO_Object extends IO_Object
{
	System_IO_Object(){}
	
	public String Input_String()
	{
		Scanner keyboard = new Scanner(System.in);
		String the_input = keyboard.nextLine();
		keyboard.close();
		return the_input;
	}
	
	public void Output_String(String output)
	{
		System.out.println(output);
	}
}