// Conor Gorman
// CT417
// Assignment Part A

package ct417.assignment;

import java.util.*;
import org.joda.time.DateTime;

public class Programme {
	
	//Variables
	public String courseName;
	public ArrayList<Module> modules = new ArrayList<Module>();
	public DateTime Start;
	public DateTime End;
	
	//constructor
	public Programme(String name, DateTime start, DateTime end)
	{
		this.courseName = name;
		this.Start = start;
		this.End = end.plusYears(4); //based on a four year Course from todays date.
	}
	
	//add Modules
	public void addMods(Module m)
	{
		modules.add(m);
	} 
		
	//setters
	public void setModules(ArrayList<Module> modules)
	{
		this.modules = modules;
	}   
	    
	public void setCourse(String name)
	{
		this.courseName = name;
	}
	
	public void setStart(DateTime Start)
	{
		this.Start = Start;
	}
	
	public void setEnd(DateTime end)
	{
		this.End = end;
	}  
	    
	//getters
	public String getCourse()
	{
		return courseName;
	}
	public DateTime getend()
	{
		return End;
	}
	public DateTime getStart()
	{
		return Start;
	}
	public ArrayList<Module> getMod()
	{
		return modules;
	}
	
	
	// Override toString method
	@Override
	public String toString()
	{
		String str = " Course Name: " + this.courseName + "\n Start date: " + this.Start + "\n End Date: " + this.End + "\n";
		for (Module m : modules)
		{
			str += " \n" + m + "\n";
		}
		return str;
	}
}
