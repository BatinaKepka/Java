public class Main
{
	public static void main(String[] args)
	{
		Point A = new Point(1,2,3);
		Point B = new Point();
		System.out.printf("Enter coordinates of second point: \n");  
		B.Input();
		A.Display();
		B.Display();
		System.out.printf("\nDistance between points: %f", A.Distance_to_Point(B));     
		
		Line line = new Line();
		System.out.printf("\nEnter coordinates two points of line:"); 
		line.Input();
		line.Display();
		line.Point_on_line(A);
		
		Triangle triangle = new Triangle();
		System.out.printf("\nEnter coordinates three points of triangle:"); 
		triangle.Input();
		triangle.Display();
		System.out.printf("\nArea of triangle: %f" ,triangle.Area() ); 
		System.out.printf("\nPerimeter of triangle: %f" ,triangle.Perimeter() ); 
		
		Plane plane = new Plane();
		System.out.printf("\nEnter coordinates three points of plane:"); 
		plane.Input();
		plane.Display();
		plane.Point_on_plane(A);
		
		Sphere sphere = new Sphere();
		System.out.printf("\nEnter coordinates centre of sphere:\n"); 
		sphere.Input();
		sphere.Display();
		sphere.Point_on_Sphere(A);
		
		
		
    }
}