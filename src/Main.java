import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;


public class Main
{
	
	
	public static void main(String[] args)
	{
		/*ArrayList AL = new ArrayList();
		Line L1=new Line();
		Line L2=new Line();
		Line_segment LS1 =new Line_segment();
		Line_segment LS2 =new Line_segment();
		L1.Input();
		AL.add(L1);
		LS1.Input();
		AL.add(LS1);		
		L2.Input();
		AL.add(L2);
		LS2.Input();
		AL.add(LS2);
		
		int k=0;  
		String gc;
		Iterator ik = AL.iterator();
		while(ik.hasNext())    
        {
			
			Object el = ik.next();
			
			System.out.printf("%s", el.toString());
			gc=el.getClass().getSimpleName();
			
			if(gc.equals("Line_segment"))
				k++;
         }
	     System.out.printf("Count of Line_segment: % d" , k); 
		*/
		
	      ArrayList AL1 = new ArrayList<Point>();
	      AL1.add(new Point(1,1,1,"A"));
	      AL1.add(new Point(100,100,100,"D"));
	      AL1.add(new Point(10,10,10,"B"));
	      AL1.add(new Point(50,50,50,"C"));
	      
	   
	      
	      Collections.sort(AL1);   
	      
	    
	      Point f=new Point();

	      for (int i = 0; i < AL1.size(); i++) 
	     {
		      f=(Point)AL1.get(i);	      
		      System.out.println(f.toString());
	     }
	      int index = Collections.binarySearch(AL1, new Point(10,10,10,"B"));
	      System.out.println(index+1); 
	}
}