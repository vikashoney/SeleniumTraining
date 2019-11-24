/*Question 6: Write a program for string reverse*/

package PracticeDemo;

public class Example_reverseString {

	public static void main(String[] args) 
	{
		//--------------*First Way*---------------
		/*StringBuffer a = new StringBuffer("Software Testing Material");
        System.out.println(a.reverse());*/

		//--------------*Second Way*---------------
		
		String str="Software Testing Material";
		String reverse="";
		int length=str.length();
		for(int i=length-1; i>0; i--)
		{
			reverse=reverse + str.charAt(i);
	    }
		 System.out.println(reverse);
	}

}
