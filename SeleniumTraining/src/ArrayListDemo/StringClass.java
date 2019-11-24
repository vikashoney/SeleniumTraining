package ArrayListDemo;

//import java.util.ArrayList;

public class StringClass {

	public static void main(String[] args) {
		
		String str1=" Vikas ";
		String str2="Dhanorkar";
		String date="24/03/2018";
		
		System.out.println(str1.startsWith("I"));
		System.out.println(str2.endsWith("r"));
		System.out.println(str1.charAt(3));
		System.out.println(str2.equals(str1));
		System.out.println(str2.equalsIgnoreCase(str1));
		System.out.println(str1.concat(str2));
		System.out.println(str1.trim());
		System.out.println(str2.substring(1, 5));
		//str1.indexOf("a");
		String Str = new String("This is really not immutable!!");
	      boolean retVal;

	      retVal = Str.endsWith( "immutable!!" );
	      System.out.println("Returned Value = " + retVal );
	
	      String str = "MyJava";
	      
	      char[] strArray = str.toCharArray();
	       
	      for (int i = strArray.length - 1; i >= 0; i--)
	      {
	          System.out.print(strArray[i]);     //Output : avaJyM
	      }
		
		String spl[]=date.split("/");
		System.out.println(spl[0]);
		System.out.println(spl[1]);
		System.out.println(spl[2]);
	}

}
