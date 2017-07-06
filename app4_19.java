package tw.alan.myproject.textbook;
import java.util.Scanner;
public class app4_19 {

	private static Scanner scn;

	public static void main(String[] args) {
		scn = new Scanner(System.in);
		int days, sumdays, weeks;
		System.out.println("Please Inpute Days Value.");
		sumdays = scn.nextInt();
		days = (sumdays%7);
		weeks = (sumdays/7);
		System.out.println(sumdays + "days = " + weeks + " weeks & " + days + " days.");
		System.out.println("Finished.");
	}

}
