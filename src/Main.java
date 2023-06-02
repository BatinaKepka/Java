import java.util.Scanner;

public class Main
{
	
	
	public static void main(String[] args)
	{
		/*
		Line line = new Line();
	    line.Input();   
	    Point point = new Point();
	    point.Input();
	    System.out.print("Point: ");
	    point.Display();
	    System.out.print("\nLine: \n");
	    line.Display();    
	    line.Point_on_line(point);
	    */
		
		Point[] array_Point1 = new Point[4];		
	    for (int i = 0; i < 4; i++)
	    {
	    	array_Point1[i] = new Point();
	    	System.out.printf("Enter the coordinates of %d point: \n", i +1);	        
	        array_Point1[i].Input();
	    }        
	    System.out.printf("One-dimensional array:");
	    for (int i = 0; i < 4; i++)
	    {
	        array_Point1[i].Display();
	    }   
	    System.out.printf("\n");
	    Point[][] array_Point2 = new Point[2][2];	    
	    for (int i = 0; i < 2; i++)
	    {
	        for (int j = 0; j < 2; j++)
	        {
	        	array_Point2[i][j] = new Point();
	        	System.out.printf("Enter the coordinates of %d %d point: \n", i +1, j +1);
	            array_Point2[i][j].Input();
	        }
	    }     
	    System.out.printf("Two-dimensional array:\n");
	    for (int i = 0; i < 2; i++)
	    {
	        for (int j = 0; j < 2; j++)
	        {
	        	System.out.printf("\nCoordinates of %d %d point:", i +1, j +1);
	            array_Point2[i][j].Display();
	        }	      
	        System.out.print("\n");
	    }
	    
    }
}