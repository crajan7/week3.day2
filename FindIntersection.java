package week3.day2;


public class FindIntersection {
	
	public static void main(String[] args) 
	{
		int[] one = { 3, 2, 11, 4, 6, 7 };
	  int[] two = { 1, 2, 8, 4, 9, 7 };
	int size = one.length;
	int size1=two.length;
	int count=0;
	System.out.println("length of first ARRAY " +size);
	System.out.println("length of second ARRAY " +size1);

	for (int i = 0; i <= size - 1; i++) {
		

		for (int j = 0; j <= size1 - 1; j++) {
			

			if (one[i] == two[j]) {
				count=count+1;
	
				System.out.println(one[i]);
						}
		}
	}
	System.out.println("Common in both arrays " +count);	
}
}
