// Conor Gorman
// CT417
// Assignment Part A

package ct417.assignment;

import static org.junit.Assert.*;
import org.junit.Test;
import org.joda.time.DateTime;

public class CT417test {
	    
	    private Student s;
	    private DateTime d;
	            
	    public CT417test() {
	        d = new DateTime();
	        s = new Student("conor", 24, d);
	    }
	   
	     @Test
	     public void hello() {
	         String username = s.getUser();
	         assertEquals(username, "conor24");
	     }
	}
