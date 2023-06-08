import java.util.Scanner;

public class Line_segment extends Line
{
	private	float length;
	
	public Line_segment()
	{
		super();
	}

	public Line_segment(Point first, Point second)
	{
		super(first, second);
		length = first.Distance_to_Point(second);
	}	

	public void Input()
	{
		super.Input();
		length = first.Distance_to_Point(second);			
	}
	
	 public String toString() 
	 {
	     return "Coordinates of the first point: " + first.toString() + "\nCoordinates of the second point: " + second.toString() + "\nLength: " + length ;
	     
	 }

	public float Get_length()
	{
		return length;
	}	
}
