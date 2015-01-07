package a;

import java.util.Scanner;

public class WhiteboardMain {
	
	private static int noOfWhiteboard = 0;
	private double cost;
	private double totalCost;
	
	public WhiteboardMain(){
		noOfWhiteboard++;
		cost = 0;	
	}
	public void setCost (double price){
		cost = price;
	}
	public void addItem (int number){
		noOfWhiteboard = number ;
		totalCost = cost * noOfWhiteboard;
	}
	public int getNoOfWhiteboard(){
		return noOfWhiteboard;
	}
	public double getTotalCost(){
		return totalCost;
	}

	public static void main(String[] args) {
		WhiteboardMain wb = new WhiteboardMain();
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the cost:");
		double mainCost = sc.nextDouble();
		wb.setCost(mainCost);
		System.out.println("Enter the number of Whiteboard you want to buy: ");
		int mainNumber = sc.nextInt();
		wb.addItem(mainNumber);
		System.out.println("The number of whiteboard you want: " +wb.getNoOfWhiteboard());
		System.out.println("Please pay :" +wb.getTotalCost());
	}

}
