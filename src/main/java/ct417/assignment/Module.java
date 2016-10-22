// Conor Gorman
// CT417
// Assignment Part A

package ct417.assignment;

import java.util.*;

public class Module
{
    //Variables 
    private String moduleName;
    private String moduleID;
    private ArrayList<Student> students = new ArrayList<Student>();
    
    //constructor
    public Module(String name, String id)
    {
        this.moduleName = name;
        this.moduleID = id;
    }
    
    //getters
    public String getModName()
    {
        return moduleName;
    }
    
    public String getModID()
    {
        return moduleID;
    }
    
    public ArrayList<Student> getStudents()
    {
        return students;
    }
    
    
    //setters 
    public void StudentReg(Student s)
    {
        students.add(s);
    }
    
    public void setMod(String name)
    {
        this.moduleName = name;
    }
    
    public void setId(String id)
    {
        this.moduleID = id;
    }
    
    
    // Override toString method
    @Override
    public String toString()
    {
        String str = "Module Name: " + this.moduleName + " Module ID: " + this.moduleID + "\n";
        for (Student s : students)
        {
            str += s + "\n";
        }
        return str;
    }
    
}