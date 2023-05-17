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
		
		
		
    }
}