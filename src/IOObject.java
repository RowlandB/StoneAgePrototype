import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
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
	
	public String File_Input(String file)
	{
		String everything = "";
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(file));
			    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();

		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
		    everything = sb.toString();
		    br.close();
		   
		}
		catch (IOException e)
		{
	        e.printStackTrace();
		}
		 return everything;
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