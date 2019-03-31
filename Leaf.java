import java.util.ArrayList;

public class Leaf implements CompositeInterface {

	String todotask2;
	public Leaf(String taskname) {
		this.todotask2=taskname;
	}
	
	public String getToDo() {
		
		return todotask2;
		
	}

	
	
	@Override
	public void addTask(CompositeInterface task) {
		// TODO Auto-generated method stub
		//getToDo();
	}
		

	@Override
	public void printfun() {
		// TODO Auto-generated method stub
		System.out.println(getToDo());
	}
	}
	

