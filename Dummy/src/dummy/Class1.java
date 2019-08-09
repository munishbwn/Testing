package dummy;

public class Class1 {
	
	int age;
	int rollnum;
	
	public void disp()
		
	{
	
		System.out.println("Welcome to all of you");
	}
	public void disp1()
	{
		System.out.println("disp1 method");
	}
	
	public static void main (String[]args){
		Class1 c1 =new Class1();
		
		c1.age=18;
		c1.rollnum =222;
		
		System.out.println(c1.age);
		System.out.println(c1.rollnum);
		
		c1.disp();
		c1.disp1();
		
		
	}

}
