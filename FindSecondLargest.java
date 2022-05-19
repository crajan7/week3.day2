package week3.day2;

import java.util.Arrays;
import java.util.List;


public class FindSecondLargest {

	public static void main(String[] args) {

Integer[] num = new Integer[] { 3, 2, 11, 4, 6, 7 };

List<Integer> asList = Arrays.asList(num);
System.out.println("Before Sort " +asList);
asList.sort(null);
System.out.println("After Sort " +asList);

//priint second no 
int size = asList.size();
Integer integer = asList.get(size-2);
System.out.println("Second value from last "+integer);


	}

}
