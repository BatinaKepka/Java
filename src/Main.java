import java.util.Scanner;

public class Main
{
	
	
	public static void main(String[] args)
	{
		
		Point point = new Point();
	    point.Input();
	    System.out.printf("%s",point.toString());
	    
	    Line line = new Line();
	    line.Input();
	    System.out.printf("%s",line.toString());
	    
	    Line_segment line_segment = new Line_segment();
	    line_segment.Input();
	    System.out.printf("%s",line_segment.toString());
	    
	    Triangle triangle = new Triangle();
	    triangle.Input();
	    System.out.printf("%s",triangle.toString());
	    
	    Plane plane = new Plane();
	    plane.Input();
	    System.out.printf("%s",plane.toString());
	    
	    Sphere sphere = new Sphere();
	    sphere.Input();
	    System.out.printf("%s",sphere.toString());
	    
    }
}