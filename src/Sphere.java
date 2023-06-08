import java.util.Scanner;

public class Sphere extends Object_in_space
implements Input
{
	
	private Point centre;
	private float radius;
	
	public Sphere()
	{
		super();
		Point centre = new Point();
		this.centre = centre;		
		radius = 0;
	}

	public Sphere(Point centre, float radius, String name)
	{
		super(name);
		this.centre = centre;
		this.radius = radius;		
	}

	public void Input()
	{	
		System.out.print("\nCoordinates of centre: \n");
		centre.Input();
		Scanner scanner = new Scanner(System.in);   
		System.out.print("radius = ");
		radius = scanner.nextFloat();	
		Name =centre.getName();
	}
	
	 public String toString() 
	 {
	     return "Name of sphere: "+ Name +"\nCentre: " + centre.toString() + "\nradius = " + radius;
	 }	
	 
	public boolean Point_on_Sphere(Point point)
	{
		if ((Math.pow((point.getX() - centre.getX()), 2) + Math.pow((point.getY() - centre.getY()), 2) + Math.pow((point.getZ() - centre.getZ()), 2)) == (Math.pow(radius, 2)))
		{
			System.out.print("\nPoint is on sphere!\n");
			return true;
		}
		else
		{
			System.out.print("\nPoint is not on sphere!\n");
			return false;
		}
	}

	public Point GetCentre()
	{
		return centre;
	}
	public float GetRadius()
	{
		return radius;
	}
}
