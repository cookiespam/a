package a;

import java.util.Scanner;

public class ComputeAveScore2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[3];
		double sum = 0;
		double average = 0;
		int count=0;
		int input;
		Scanner sc = new Scanner(System.in);
	   
		for (int i = 0; i < arr.length; i++)
	    {
	        System.out.print("Please enter 3 numbers: ");
	        input = sc.nextInt();	
	        
	        	if (input < 0){
	        		break;
	        	} else {
	        		arr[i]= input;
	        		count++;
	        	}
	    }
		
		
	    for (int i = 0; i < arr.length; ++i)
	    {
	        sum += arr[i];	       
	    }
	       
	    average = sum/count;
	    
	    System.out.println("The sum is " + sum);
	    System.out.println("The average score is " + average);

	}
	
} 	
