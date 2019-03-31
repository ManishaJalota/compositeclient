import java.util.ArrayList;

public class Leaf implements CompositeInterface {

	String todotask2;
	public Leaf(String taskname) {
		this.todotask2=taskname;
	}
	
	public String getToDo() {
		
		return todotask2;
	}

	
	public ArrayList<String> multiToDo() {
		
		return null;
	}

}
