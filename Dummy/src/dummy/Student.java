package dummy;

public class Student {
	int age;
	int roll_no;
	public void disp1()
	{
		System.out.println("Welcome to All of you");
	}
	public void disp2()
	{
		System.out.println("Welcome to Selenium Automation");
	}
	public static void main(String[] args) {
			
		Student su =new Student();
		su.age=10;
		su.roll_no=222;
		
		su.disp1();
		su.disp2();
		
		System.out.println("My age is "+ su.age);
		System.out.println("My RollNo is "+ su.roll_no);
		

	}

}
