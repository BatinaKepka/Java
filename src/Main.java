import java.util.Scanner;

public class Main
{
	
	
	public static void main(String[] args)
	{
		/*Line line1 = new Line();
		Line line2 = new Line();	
		line1.Input();
		line2.Input();
		System.out.printf("Now there are %d objects of class Line\n", Line.getCount());
		Line line3 = new Line();
		line3.Input();
		System.out.printf("Now there are %d objects of class Line\n", Line.getCount());
		line1.finalize();
		line2.finalize();
		System.out.printf("Now there are %d objects of class Line\n", Line.getCount());
		line3.finalize();
		System.out.printf("Now there are %d objects of class Line\n", Line.getCount());
		
		int size;
		System.out.print("Enter size of array: ");
		Scanner scanner = new Scanner(System.in);      	
		size = scanner.nextInt();
		Point array_points[] = new Point[size];
		System.out.print("Enter array of points:\n ");
		for(int i = 0; i <size; i++)
		{
			array_points[i] = new Point();
			array_points[i].Input();
		}
		System.out.print("Array of points: ");
		for(int i = 0; i <size; i++)
		{
			array_points[i].Display();
		}
		
		Point x1 = new Point();
	    x1.Input();
	    Point x2 = new Point();
	    x2.Input();
	    if (x1.More_distant(x2))
	    	System.out.printf("\nFirst point is located further from center!\n", Line.getCount());	        
	    else
	    	System.out.printf("\nSecond point is located further from center!\n", Line.getCount());	      
		*/
		Triangle triangle = new Triangle();
		triangle.Input();
		Result result = new Result();
		triangle.Perimeter(result);
		System.out.printf("\nPerimeter of triangle: %f", result.value);	 
    }
}