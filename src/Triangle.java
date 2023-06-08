
public class Triangle extends Object_in_space
implements Input
{
	private Point first, second, third;
	
	public Triangle()
	{
		 super();
		 Point first = new Point(), second = new Point(), third = new Point();
		 this.first = first;
		 this.second = second;
		 this.third = third;
	}

	public Triangle(Point first, Point second, Point third, String name)
	{
		super(name);
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
		Name = first.getName() + "-" + second.getName() + "-" + third.getName();
	}
	
	 public String toString() 
	 {
	     return "Name of triangle: "+ Name +"\nFirst point: " + first.toString() + "\nSecond point: " + second.toString() + "\nThird point: " + third.toString();
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
