
public class Triangle
{
	private Point first, second, third;
	
	public Triangle()
	{
		Point first = new Point(), second = new Point(), third = new Point();
		 this.first = first;
		 this.second = second;
		 this.third = third;
	}

	public Triangle(Point first, Point second, Point third)
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

	public float Perimeter()
	{
		return first.Distance_to_Point(second) + first.Distance_to_Point(third) + second.Distance_to_Point(third);
	}
	public void Perimeter(Result x)
	{
		x.value = first.Distance_to_Point(second) + first.Distance_to_Point(third) + second.Distance_to_Point(third);
		return;
	}

	public float Area()
	{
		float a = first.Distance_to_Point(second);
		float b = first.Distance_to_Point(third);
		float c = second.Distance_to_Point(third);
		float p = (a + b + c) / 2;
		return  (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
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
