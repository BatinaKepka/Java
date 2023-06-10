import java.util.Scanner;

public class Line_segment extends Line
implements Input,Cloneable 
{
	private	float length;
	
	public Line_segment()
	{
		super();
	}

	public Line_segment(Point first, Point second, String name)
	{
		super(first, second, name);
		length = first.Distance_to_Point(second);
	}	

	public void Input()
	{
		super.Input();
		length = first.Distance_to_Point(second);			
	}
	
	public Object clone()
    {
    	try
        {
    		Line_segment clone=(Line_segment)super.clone();
    		clone.first = (Point)first.clone();
    		clone.second = (Point)second.clone();
	        return clone;
        }
	    catch(CloneNotSupportedException e)
	    {      
	    	
	    }
     return this;  
    }
	
	 public String toString() 
	 {
	     return "Name of line segment: "+ Name +"\nFirst point: " + first.toString() + "\nSecond point: " + second.toString() + "\nLength: " + length + "\n" ;
	     
	 }

	public float Get_length()
	{
		return length;
	}	
	public void setX(float x)
    {
    	this.first.setX(x);
    }
    public void setName(String name)
    {
    	Name = name;
    }

}
