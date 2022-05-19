package week3.day2;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Listvalidation {
	
	public static void main(String[] args) 
	{
		List <Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(1);
		list1.add(4);
		list1.add(5);
		list1.add(1);
		list1.add(6);
		System.out.println(list1);
		int size = list1.size();
		int count =0; 
		for(int i=0;i<size;i++) 
		{
			Integer comp = list1.get(i);
			if(comp == 1)
			{
				count=count+1;
			}
			
		}
		System.out.print(" No of 1 is occurred in array " +count);
	}
}


