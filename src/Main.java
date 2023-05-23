public class Main
{
	
	
	public static void main(String[] args)
	{
		Line line1 = new Line();
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
    }
}