public class Line extends Object_in_space
implements Input
{
	protected Point first, second;
	private static int Count;
	
	public Line()
	{		
		 super();
		 Point first = new Point(), second = new Point();
		 this.first = first;
		 this.second = second;
		 Count++;
	}

	public Line(Point first, Point second, String name)
	{
		super(name);
		this.first = first;
		this.second = second;		
		Count++;
	}

	public void Input() 
	{
		System.out.print("\nCoordinates of the first point: \n");
		first.Input();
		System.out.print("Coordinates of the second point: \n");
		second.Input();
		Name = first.getName() + "-" + second.getName();
	}
	
	public Line Add(Line A, Line B)
    {
		Line C = new Line();
		C.first = C.first.Add(A.first, B.first);
		C.second = C.second.Add(A.second, B.second);    	
    	C.Name = A.Name + B.Name;
    	return C;
    			
    	
    }
	
	 public String toString() 
	 {
	     return "Name of line: "+ Name + "\nFirst point: " + first.toString() + "\nSecond point: " + second.toString();
	 }	

	public boolean Point_on_line(Point point)
	{
		float x,y,z;
		try 
		{
			if (this.first.getX() == this.second.getX())
			     throw new MyEx(1);  
			x = (point.getX() - this.first.getX()) / (this.first.getX() - this.second.getX());	
		}
		catch (MyEx e) 
		{			
		     System.out.printf("\nException: " + e); 
		     x = 0;
		}
		try 
		{
			if (this.first.getY() == this.second.getY())
			     throw new MyEx(2);  
			y = (point.getY() - this.first.getY()) / (this.first.getY() - this.second.getY());	
		}
		catch (MyEx e) 
		{			
		     System.out.printf("\nException: " + e); 
		     y = 0;
		}
		try 
		{
			if (this.first.getZ() == this.second.getZ())
			     throw new MyEx(3);  
			z = (point.getZ() - this.first.getZ()) / (this.first.getZ() - this.second.getZ());	
		}
		catch (MyEx e) 
		{			
		     System.out.printf("\nException: " + e); 
		     z = 0;
		}

		if ((x == y) && (y == z))
		{
			System.out.print("\nPoint is on line!\n");
			return true;
		}
		else
		{
			System.out.print("\nPoint is not on line!\n");
			return false;
		}
	}

	public Point Get_first_point() 
	{
		return first;
	}

	public Point Get_second_point()
	{
		return second;
	}
	public static int getCount()
	{
		return Count;
	}
	public void finalize()
	{
		Count--;
		System.out.print("Line deleted!\n");
	}
}




