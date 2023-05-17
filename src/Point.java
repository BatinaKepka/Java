import java.util.Scanner;

public class Point
{
	private float x, y, z;
	
	public Point()
	{
		x = 0;
		y = 0;
		z = 0;
	}

    public Point(float x, float y, float z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void Input()
    {
    	
    	try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("x = ");
			x = scanner.nextFloat();
			System.out.print("y = ");
			y = scanner.nextFloat();
			System.out.print("z = ");
			z = scanner.nextFloat();
		}       	
    }

    public void Display()
    {
    	System.out.printf("\nx = %f y = %f z = %f", x, y ,z);    	
    }

    public float Distance_to_Point(Point end)
    {
    	return (float) Math.sqrt(Math.pow((end.x - this.x), 2) + Math.pow((end.y - this.y), 2) + Math.pow((end.z - this.z), 2));
    }

    public float getX()
    {
    	return x;
    }

    public float getY()
    {
    	return y;
    }

    public float getZ()
    {
    	return z;
    }

}
