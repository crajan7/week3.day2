package week3.day2;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Compare {
	
	public static void main(String[] args) 
	{
		List <String> list1 = new ArrayList<String>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("D");
		list1.add("E");
		list1.add("A");
		list1.add("G");
		list1.add("F");
		list1.add("C");
		System.out.println(list1);
		int size = list1.size();
		int count =0; 
		for(int i=0;i<size;i++) 
		{
		String string = list1.get(i);
		if(string=="A")
			{
			count=count+1;
		
			}
			
		}
		System.out.print(" No of A is occurred in array " +count);
	}
}


