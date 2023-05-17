
public class Line
{
	private Point first, second;
	
	public Line()
	{		
		 Point first = new Point(), second = new Point();
		 this.first = first;
		 this.second = second;
	}

	public Line(Point first, Point second)
	{
		this.first = first;
		this.second = second;
	}

	public void Input() 
	{
		System.out.print("\nCoordinates of the first point: \n");
		first.Input();
		System.out.print("Coordinates of the second point: \n");
		second.Input();
	}

	public void Display()
	{
		System.out.print("Coordinates of the first point: ");
		first.Display();
		System.out.print("\nCoordinates of the second point: ");
		second.Display();
	}

	public boolean Point_on_line(Point point)
	{
		float x = (point.getX() - first.getX()) / (first.getX() - second.getX());
		float y = (point.getY() - first.getY()) / (first.getY() - second.getY());
		float z = (point.getZ() - first.getZ()) / (first.getZ() - second.getZ());
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
}
