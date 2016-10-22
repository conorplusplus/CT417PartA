// Conor Gorman
// CT417
// Assignment Part A

package ct417.assignment;

import org.joda.time.DateTime;

public class Student {
	
    //variables
    public String Name;
    public int Age;
    public DateTime DOB;
    public int studentID = 16543210;
    public String Username;
    
    //constructor
    public Student(String name, int age, DateTime d)
    {
        this.Name = name;
        this.Age = age;
        this.DOB = d;      
        this.setUserName();
    }
  //Getters		
    public String getName()
    {
        return this.Name;
    }
    
    public int getAge()
    {
        return this.Age;
    }
    
    public DateTime getDob()
    {
        return this.DOB;
    }
    
    public String getUser()
    {
        return this.Username;
    }
    
    public int getID()
    {
        return ++(this.studentID);
    }
    
    
    //Setters
    public void setName(String name)
    {
        this.Name = name;  
    }
    public void setAge(int age)
    {
        this.Age = age;
    }
    public void setDob(DateTime dob)
    {
        this.DOB = dob;
    }
    public void setUserName()
    {
        this.Username = this.Name + this.Age; 
    }
    
    public void setID(int id )
    {
        this.studentID = id;
    }
    
    
    //toString method
    @Override
    public String toString()
    {
        String str = " Student Name: " +  this.Name + "\n Student ID: " + this.studentID + "\n Username: " + this.Username + " \n Age: " + this.Age + "\n Date of birth: " + this.DOB + "\n";
        return str;
    }
}


