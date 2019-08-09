package dummy;

public class Class3 {
	
	public Class3()
	{
		this(1,1,1,1);
		System.out.println("Default constructor");
	}

	public Class3(int a)
	{
		this();
		System.out.println("1 - Parameter constructor");
	}
	
	public Class3(int a, int b)
	{
		this(1,1,1);
		System.out.println("2 - Parameter constructor");
	}
	
	public Class3(int a, int b, int c)
	{
		this(1);
		System.out.println("3 - Parameter constructor");
	}
	public Class3(int a, int b, int c, int d)
	{
		System.out.println("4 - Parameter constructor");
	}
	
	public static void main(String[] args) {
		
		
		new Class3(1,2);
	}
}
