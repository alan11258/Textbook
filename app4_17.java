package tw.alan.myproject.textbook;
import java.util.Scanner;
public class app4_17 {

	private static Scanner scn;

	public static void main(String[] args) {
		scn = new Scanner(System.in);
		System.out.println("Please Inpute Length And Width.");
		int lenght, width;
		lenght = scn.nextInt(); width = scn.nextInt();
		
		System.out.println("The Area Of The Rectangle Is " + (lenght*width) + ".");
				

	}

}
