
class Array <T extends Line>
{
	private T[] ob;
	private int size;
	public Array(T[]o)
	{
		ob=o;
	}
	T sum()
	{
		int i;
		T a;
		a=ob[0];

		for(i=1;i<ob.length;i++)
		{
			a = (T) a.Add(a, ob[i]); 
		}
		return a;
	}	
}
