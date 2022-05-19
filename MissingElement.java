package week3.day2;
import java.util.Arrays;
import java.util.List;


public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] num1 = new Integer[] { 1, 3, 2, 4, 6, 7 };

		
		List<Integer> list = Arrays.asList(num1);

		
		list.sort(null);
		
		for (int i = 0; i < list.size(); i++) {
			
			if (list.get(i).equals(i + 1)) 
			{
				
				
			}

			else {
				System.out.println("Missing element in given array is: " + (i + 1));
				
			}

		}
	}

	}

