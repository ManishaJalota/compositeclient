import java.util.*;

class Composite implements CompositeInterface
{
	
	ArrayList<String> multitodo= new ArrayList<String>();
	String singleTodo;

	Composite(String singleToDo){
		this.singleTodo=singleToDo;
		this.multitodo= new ArrayList<String>();
	
	}

	
	@Override
	
	public String getToDo() {
		// TODO Auto-generated method stub
		return singleTodo;
	}

	
	


	@Override
	public void addTask()
	{
		multitodo.add(singleTodo);
		for(String task:multitodo)
		{
			System.out.println(task);
		}
	}
	
	
}
