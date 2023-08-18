package week2.day1;

import java.util.Arrays;

public class FindSecondLargest {
	
	public static void main(String[] args)
	{
		int[] data= {1,7,11,4,9};
		System.out.println("Length of the given Array");
		System.out.println(data.length);
		
		System.out.println("List of values in the array");
		
		for(int i=0;i<data.length;i++)
		{
			System.out.println(data[i]);
			
		}
		
		//Arrange my array in ascending order
		
		Arrays.sort(data);
		System.out.println("Ascending Order");
		
		for(int i=0;i<data.length;i++)
		{
			System.out.println(data[i]);
		}
		
		//Arrange my array in decending order
		
		System.out.println("Descending or Reverse Order");
		
		for(int i=data.length-1;i>=0;i--)
		{
			System.out.println(data[i]);
		}
		//printing the firstvalue of the array
		System.out.println("First value in the Array:" + data[0]);
		System.out.println("Last value in the Array:" + data[data.length-1]);
		System.out.println("second largest value in the Array:" + data[data.length-2]);
		}
	

}
