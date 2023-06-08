import java.util.Scanner;

public class Main
{
	
	
	public static void main(String[] args)
	{
		/*
		System.out.printf("POINT\n");
		Point point = new Point();
	    point.Input();
	    System.out.printf("%s",point.toString());
	    
	    System.out.printf("\nLINE");
	    Line line = new Line();
	    line.Input();
	    System.out.printf("%s",line.toString());
	    
	    System.out.printf("\nLINE SEGMENT");
	    Line_segment line_segment = new Line_segment();
	    line_segment.Input();
	    System.out.printf("%s",line_segment.toString());
	    
	    System.out.printf("\nTRIANGLE");
	    Triangle triangle = new Triangle();
	    triangle.Input();
	    System.out.printf("%s",triangle.toString());
	    
	    System.out.printf("\nPLANE");
	    Plane plane = new Plane();
	    plane.Input();
	    System.out.printf("%s",plane.toString());
	    
	    System.out.printf("\nSPHERE");
	    Sphere sphere = new Sphere();
	    sphere.Input();
	    System.out.printf("%s",sphere.toString());
	    */
		Line_segment A = new Line_segment();
		Line_segment B = new Line_segment();
		A.Input();
		B.Input();		
		System.out.printf("\n%s",A.toString());
		System.out.printf("\n%s",B.toString());
		A = (Line_segment)B.clone();
		System.out.printf("\n%s",A.toString());
		System.out.printf("\n%s",B.toString());
		B.setX(10);
		B.setName("C");
		System.out.printf("\n%s",A.toString());
		System.out.printf("\n%s",B.toString());
    }
}