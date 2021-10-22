package driver;

import java.util.ArrayList;
import java.util.Scanner;

import operations.Implement_Operations;

public class Test_MovieReviews {

	public static void main(String[] args) {
		Implement_Operations io = new Implement_Operations();
		Scanner sc = new Scanner(System.in);
		ArrayList<Test_MovieReviews> tmr = new ArrayList<Test_MovieReviews>();
		boolean whilecond = true;
		while(whilecond) {
		System.out.println("Press\n1 for Add Movie and Review\n2 for Display\n3 Show Higest Ratted Movie\n4 for Exit");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			io.addMovieReview();
			break;
			
		case 2:
			io.displayMovieAndReview();
			break;
			
		case 3:
			io.showHigestReatingMovie();
			break;
		case 4:
			whilecond = false;
			System.out.println("You are Successfully logout .....\nclose the program....!");
			break;
			
		default:
			System.out.println("Please Choose Proper input");
			break;
		}
		}
	}

}
