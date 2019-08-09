package dummy;

public class Class2 {
	
	public int sum(int a,int b){
		int c;
		
		c=a+b;
		return c;
	}
	
	public int sub (int a, int b)
	{
		int c;
		
		c=a-b;
		return c;
	}
	public int mul (int a, int b)
	{
		int c;
		
		c=a*b;
		return c;
	}
	public void div (int a,int b)
	{
		int c;
		
		c=a/b;
		
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		Class2 c2 = new Class2();
		
		int sum =c2.sum(10, 2);
		System.out.println(sum);
		sum =c2.sum(sum, 2);
		System.out.println(sum);
		int sub =c2.sub(sum, 2);
		System.out.println(sub);
		int mul =c2.mul(sub, 2);
		System.out.println(mul);
		c2.div(mul, 2);
		
		
		
		
	}

}
