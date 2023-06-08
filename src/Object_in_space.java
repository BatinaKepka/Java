
abstract class Object_in_space
{
	protected String Name;	
			
	public Object_in_space()
	{
		Name = "";
	}
	
	public Object_in_space(String name)
	{
		Name = name;
	}
			
	public abstract  void Input();
	
	public String getName()
	{
		return Name;
	}		
}
