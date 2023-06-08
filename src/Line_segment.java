import java.util.Scanner;

public class Line_segment extends Line
implements Input
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
	
	 public String toString() 
	 {
	     return "Name of line segment: "+ Name +"\nFirst point: " + first.toString() + "\nSecond point: " + second.toString() + "\nLength: " + length ;
	     
	 }

	public float Get_length()
	{
		return length;
	}	
}
