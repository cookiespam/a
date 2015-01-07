package a;

import java.util.Scanner;

public class ComputeNewNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[6];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++)
	    {
	        System.out.print("Plase enter 6 numbers: ");
	        arr[i] = sc.nextInt();	       
	    }
		
		getLargest(arr);
		getSmallest(arr);
		getAverage(arr);
	}
	
	public static int getLargest(int[] arr){
		int max = arr[0];
		for(int i=0; i<arr.length; i++){ 
			if (arr[i]>max)
			{
				max = arr[i];
			}
		}
		System.out.println("Largest Number is "+ max);
		return max;	
	}
	
	public static int getSmallest(int[] arr){
		int min = arr[0];
		for(int i=0; i<arr.length; i++){ 
			if (arr[i]<min)
			{
				min = arr[i];
			}
		}
		System.out.println("Largest Number is "+ min);
		return min;	
	}
	public static double getAverage(int[] arr){
		int sum=0;
		for(int i=0; i<arr.length; i++){ 
			sum += arr[i];
		}
		double average = sum/arr.length;
		System.out.println("Average Number is "+ average);
		return average;
	}
}

