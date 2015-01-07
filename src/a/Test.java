package a;

public class Test {
	public static void main(String[] args) {
		  int[][] marks = { {75,80,85}, {60, 68, 74}, {81, 63, 77},
		    {55, 76, 67}, {62, 45, 68}, {52, 47, 51} };
		  String[] names = { "Jane", "John", "Jerome", "Jason", "Jessica", "Joanne" };
		  String[] subjects = { "English", "Maths", "Science" };
		  int[] studentTotal = new int[marks.length];
		  int[] subjectTotal = new int[marks[0].length];
		  
		  for (int i=0; i < marks.length; i++){
			  for (int j=0; j < marks[0].length; j++){
				  studentTotal[i] += marks[i][j];
				  subjectTotal[j] += marks[i][j];
			  }
		  }
		  
		  for (int i=0; i < marks.length; i++){
			  System.out.println("Average marks of "+ names[i] +" = "+ (double) studentTotal[i] / 3);
		  }
		  
	}
}