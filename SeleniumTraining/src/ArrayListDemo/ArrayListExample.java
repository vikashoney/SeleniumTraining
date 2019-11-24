package ArrayListDemo;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> obj =new ArrayList<String>();
		obj.add("V");
		obj.add("I");
		obj.add("K");
		obj.add("A");
		obj.add("S");
	/*	for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}*/
		//System.out.println(obj); //Print all list
		//System.out.println(obj.size());//Shows count
		//System.out.println(obj.get(3));// print single value
        for(Object x: obj) 
        {
           System.out.println(x); //Print all list
        }
        ArrayList<WebElement> obj1=new ArrayList<WebElement>();
        
	}

}
