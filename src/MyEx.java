class MyEx extends Exception    
{
	private int Type;       
	MyEx(int a)                   
	  {
	    Type = a;
	   }

	public String toString() 
	{
	   if(Type==1)
	     return "X coordinates of points of line are equal, there was division by zero"; 
	   else if(Type==2)
		 return "Y coordinates of points of line are equal, there was division by zero"; 
	   else if(Type==3)
		 return "Z coordinates of points of line are equal, there was division by zero";
	   return null; 	
	  }

}
