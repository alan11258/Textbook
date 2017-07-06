package tw.alan.myproject.textbook;
import java.util.Scanner;
public class app4_18 {

	private static Scanner scn;

	public static void main(String[] args) {
		double r, area, pi = 3.14159;
		scn = new Scanner(System.in);
		
		System.out.println("Please Inpute Radius Value.");
		r = scn.nextDouble();
		area = 4/3.0*r*r*r*pi;
		System.out.println("The Volume Of Round Sphere Is " + area + ".");

	}

}
