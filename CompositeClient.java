import java.util.ArrayList;
import java.util.Collections;
import java. util.*;
public class CompositeClient {

	public static <E> void main(String args[]) 
	{
	
		ArrayList<String> List= new ArrayList<String>();
		CompositeInterface leaf1= new Leaf("Morning wakeup");
		CompositeInterface leaf2= new Leaf("Look good");
		CompositeInterface Composite1= new Composite("Making Good breakfast");
		Composite1.addTask();
		leaf1.addTask();
		
	}
}
