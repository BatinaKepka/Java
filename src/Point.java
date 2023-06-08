import java.util.Scanner;

public class Point extends Object_in_space
implements Input,Cloneable 
{
	private float x, y, z;
	
	public Point()
	{
		super();
		x = 0;
		y = 0;
		z = 0;
	}

    public Point(float x, float y, float z, String name)
    {
    	super(name);
        this.x = x;
        this.y = y;
        this.z = z;
    }    

    public void Input()
    {
    	
    	Scanner scanner = new Scanner(System.in);   
    	System.out.print("Enter name of point: ");
    	Name = scanner.nextLine();
    	System.out.print("x = ");
    	x = scanner.nextFloat();
    	System.out.print("y = ");
    	y = scanner.nextFloat();
    	System.out.print("z = ");
    	z = scanner.nextFloat();       	
    }
    public Object clone()  
	 {
	     try
	     {
	     return (Point)super.clone();
	     }
	     catch(CloneNotSupportedException e)
	     {
	         
	     }
	     return this;
	 }
    
    public String toString() 
    {
        return "Name of point: "+ Name + ", coordinates: x = " + x + " y = " + y + " z = " + z;
    }

    public float Distance_to_Point(Point end)
    {
    	return (float) Math.sqrt(Math.pow((end.x - this.x), 2) + Math.pow((end.y - this.y), 2) + Math.pow((end.z - this.z), 2));
    }
    public boolean More_distant(Point second)
    {
    	Point zero = new Point(0, 0, 0, "");
    	if (this.Distance_to_Point(zero) > second.Distance_to_Point(zero))    	
    		return true;    	
    	else    	
    		return false;
    }   	
    public Point Add(Point A, Point B)
    {
    	Point C = new Point();
    	C.x = A.x + B.x;
    	C.y = A.y + B.y;
    	C.z = A.z + B.z;
    	C.Name = A.Name + B.Name;
    	return C;
    			
    	
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
    public void setX(float x)
    {
    	this.x = x;
    }
    public void setName(String name)
    {
    	Name = name;
    }

}
