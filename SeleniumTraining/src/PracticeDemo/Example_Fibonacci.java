/*Question 7: Write a program for Fibonacci.*/
package PracticeDemo;

public class Example_Fibonacci {

	public static void main(String[] args) 
	{
		int a=0;
		int b=1;
		int c=30;
		int f;
		System.out.print(a +" ");
		for(int d=2; d<c; d++)
		{
			f=a+b;
			System.out.print(f +" ");
			a=b;
			b=f;
		}
		

	}

}
