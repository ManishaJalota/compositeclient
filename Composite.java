import java.util.ArrayList;
import java.util.List;

public class Composite implements CompositeInterface {

	String onetodo;
	ArrayList<String> multitodo=  new ArrayList<String>();
	public Composite(String newtodo)
	{
		this.onetodo= newtodo;
		this.multitodo=new ArrayList<Composite>;
	}
	public String getToDo()
	{
		return onetodo;

	}
	public ArrayList<String> multiToDo() {
		
		return multitodo;
	}
	
	
}
