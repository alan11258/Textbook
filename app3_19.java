package tw.alan.myproject.textbook;
import java.util.Scanner;
public class app3_19 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please Input Two Number To Mutiply.");
		int a, b; a = scn.nextInt(); b = scn.nextInt();
		
		System.out.println("Calculation Results Is " + (a*b) + ".");
		
		System.out.println("Please Input Integer num.");
		int num;
		num = scn.nextInt();
		System.out.println("Calculation Results Of num Is " + (num*3) + ".");
		
		System.out.println("Please Input Two Number To Add.");
		int c, d; c = scn.nextInt(); d = scn.nextInt();
		System.out.println("Calculation Results Is " + (c+d) + ".");

	}

}
