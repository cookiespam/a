package a;

public class ComputeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-60,55,91,80,75,64};
		int sum=0;
		int max = arr[0];
		int min = arr[0];
		for(int i=0; i<arr.length; i++){ 
			if (arr[i]>max)
			{
				max = arr[i];
			}
		}
		
		for(int i=0; i<arr.length; i++){ 
			if (arr[i]>max)
			{
				min = arr[i];
			}
		}
		
		for(int i=0; i<arr.length; i++){ 
			sum += arr[i];
		}
		
		double average = (double) sum/arr.length;
		System.out.println("Largest Number is "+ max);
		System.out.println("Smallest Number is "+ min);
		System.out.println("Average Number is "+ average);
	}
	
	
}
