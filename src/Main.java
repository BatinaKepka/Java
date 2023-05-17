public class Main
{
	public static void main(String[] args)
	{
		Point A = new Point(1,2,3);
		Point B = new Point();
		B.Input();
		A.Display();
		B.Display();
		System.out.printf("\nDistance between points: %f", A.Distance_to_Point(B));        
    }
}