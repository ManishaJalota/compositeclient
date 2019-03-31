import java.util.ArrayList;
import java.util.List;

public class Composite implements CompositeInterface {

	String onetodo;
	ArrayList<String> multitodo=  new ArrayList<String>();
	public Composite(String newtodo,  ArrayList<String >newmultitodo)
	{
		this.onetodo= newtodo;
		this.multitodo=newmultitodo;
	}
	public String getToDo()
	{
		return onetodo;

	}
	public ArrayList<String> multiToDo() {
		
		return multitodo;
	}
	
	
}
