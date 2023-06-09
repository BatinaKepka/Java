
public class Plane 
{
	private Point first, second, third;
	
	public Plane() 
	{
		Point first = new Point(), second = new Point(), third = new Point();
		this.first = first;
		this.second = second;
		this.third = third;
	}

	public Plane(Point first, Point second, Point third)
	{
		this.first = first;
		this.second = second;
		this.third = third;
	}

	public void Input()
	{
		System.out.print("\nCoordinates of the first point: \n");
		first.Input();
		System.out.print("Coordinates of the second point: \n");
		second.Input();
		System.out.print("Coordinates of the third point: \n");
		third.Input();
	}

	public void Display()
	{
		System.out.print("Coordinates of the first point: ");
		first.Display();
		System.out.print("\nCoordinates of the second point: ");
		second.Display();
		System.out.print("\nCoordinates of the third point: ");
		third.Display();
	}

	public boolean Point_on_plane(Point point)
	{
		float x = (point.getX() - first.getX()) * ((second.getY() - first.getY()) * (third.getZ() - first.getZ()) - (second.getZ() - first.getZ()) * (third.getY() - first.getY()));
		float y = (point.getY() - first.getY()) * ((second.getX() - first.getX()) * (third.getZ() - first.getZ()) - (second.getZ() - first.getZ()) * (third.getX() - first.getX()));
		float z = (point.getZ() - first.getZ()) * ((second.getX() - first.getX()) * (third.getY() - first.getY()) - (second.getY() - first.getY()) * (third.getX() - first.getX()));
		if ((x + y + z) == 0)
		{
			System.out.print("\nPoint is on plane!\n");
			return true;
		}
		else
		{
			System.out.print("\nPoint is not on plane!\n");
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
	public Point Get_third_point()
	{
		return third;
	}
}
