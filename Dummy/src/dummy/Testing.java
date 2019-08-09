package dummy;

import java.util.Scanner;


public class Testing {
	
	
	public static void main(String[] args) {
		System.out.println("Please enter the marks");
		Scanner sc =new Scanner(System.in);
		
		int marks = sc.nextInt();
		
		if (marks>0) {
		
			if (marks%2==0){
			System.out.println("even");
		}else 
		{
			System.out.println("odd");
		}
	}else {
		System.out.println("please provide correct number");
	}
	
	}
}
		
	
	 
   	
		
	
