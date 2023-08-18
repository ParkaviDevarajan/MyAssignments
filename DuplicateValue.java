package week2.day1;

import java.util.Arrays;

public class DuplicateValue {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
     int[] num = {14,12,13,11,15,14,18,16,17,19,18,17,20};
     Arrays.sort(num);
   System.out.println("Duplicate Number in the Array Followed by:");
     for(int i = 0; i < num.length; i++) 
     {  
         for(int j = i + 1; j < num.length; j++) 
         {  
             if(num[i] == num[j]) 
            	 
                 System.out.println(num[j]);
         }
	}
	}
	}

