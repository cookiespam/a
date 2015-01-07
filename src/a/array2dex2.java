package a;

import java.util.Scanner;

public class array2dex2 {
	public static void main(String[] args) {
		  int[][] marks = { 
			{75, 80, 85}, 
		    {60, 68, 74}, 
		    {81, 63, 77},
		    {55, 76, 67}, 
		    {62, 45, 68}, 
		    {52, 47, 51} };
		  String[] names = { "Jane", "John", "Jerome", "Jason", "Jessica", "Joanne" };
		  String[] subjects = { "English", "Maths", "Science" };
		  String name;
		  int pos = -1;
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter student name: ");
		  name = sc.nextLine();
		  
		  for (int i=0; i < marks.length; i++){
			  if (name.equals(names[i])){
				  pos = i;
				  break;
			  }
		  }
		  if (pos != -1){
			  System.out.println("Results of " + name);
			  System.out.println("==========================");
			  for (int j=0; j < marks[j].length; j++){
				  System.out.println("Results for " + subjects[j] + " = " + marks[pos][j]);
			  }
		  } else {
			  System.out.println("Student not found");
		  }
	}
}
