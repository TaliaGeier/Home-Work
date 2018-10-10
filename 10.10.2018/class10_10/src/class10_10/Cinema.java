package class10_10;

import java.util.Scanner;

public class Cinema extends Seats{

	public Cinema(boolean isSeatTaken) {
		super(isSeatTaken);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	
		Seats [][] seats = new Seats [4][3];
		int row=0, col=0;
		
		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++) {
				seats[i][j] = new Seats(false);
				
			}
		}
		System.out.println("How many seats would you like?");
		Scanner scan = new Scanner(System.in);
		int numOfSeats = scan.nextInt();
		for (int i = 1; i < numOfSeats; i++) {
			System.out.println("Enter desired row (between 1 to 4): ");
			if (scan.nextInt()>4) {
				System.out.println("number is invalid try again");
			}else {
				 row = scan.nextInt();
			
			}
			System.out.println("Enter desired column(between 1 to 3): ");
			if(scan.nextInt()>3) {
				System.out.println("number is invalid");
			}else {
				 col = scan.nextInt();
			}
			if (seats[row][col].isIsSeatTaken() == true) {
				System.out.println("The seat is taken");
			}else {
				seats[row][col].setIsSeatTaken(true);
				System.out.println("Seat purchased!");
			}
			
		}
		
		
//		for (int row = 0; row < seats.length; row++) {
//			for (int col = 0; col < seats[row].length; col++) {
		
//	}
//
//
//	}
}
}