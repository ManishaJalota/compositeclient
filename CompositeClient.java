import java.util.ArrayList;
import java.util.Collections;

public class CompositeClient {

	public static void main(String args[]) {
	ArrayList<String> newlist= new ArrayList<String>();
	ArrayList<String> newlist2= new ArrayList<String>();
	ArrayList<String> newlist3= new ArrayList<String>();
	newlist.add("Wake Up at 6AM");
	newlist.add("Have a really good breakfast");
	newlist.add("Go to shower and look good");
	newlist2.add("Cafe latte");
	newlist2.add("cafe filter");
	CompositeInterface ob= new Composite("Morning Routine", newlist);
     CompositeInterface	ob4=new Composite("Drink a new coffee daily", newlist2);
	System.out.println(ob.getToDo());
	System.out.println(ob.multiToDo());
	System.out.println(ob4.getToDo());
	System.out.println(ob4.multiToDo());
	CompositeInterface ob2= new Leaf("Code hard");
	
	System.out.println(ob2.getToDo());
	ob2.toString();
	}
}
