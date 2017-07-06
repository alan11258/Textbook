package tw.alan.myproject.textbook;
import java.util.Scanner;
public class app5_2 {

	private static Scanner scn;

	public static void main(String[] args) {
		scn = new Scanner(System.in);
		int a = 8, b = 3, max;
		System.out.println("Please Inpute a & b Value.");
		a = scn.nextInt(); b =scn.nextInt();
		
		max = (a > b)?a:b;    // a>b時,max=a,否則max=b
		System.out.println("a=" + a + ", b=" + b);
		System.out.println("Between " + a + " & " + b + ", Value " + max + " Is The Largest One.");

	}

}
