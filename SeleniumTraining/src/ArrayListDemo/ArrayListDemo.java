package ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList obj =new ArrayList();
		obj.add(24);
		obj.add("March");
		obj.add(1989);
		obj.add("Pusad");
		obj.add(29.7);
		obj.add(100.09);
		
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
		System.out.println(obj); //Print all list
		//System.out.println(obj.size());//Shows count
		//System.out.println(obj.get(3));// print single value
        for(Object x: obj) 
        {
           System.out.println(x); //Print all list
        }
	}
	
}
