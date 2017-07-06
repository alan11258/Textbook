package tw.alan.myproject.textbook;

import java.util.Scanner;

public class app5_6 {

	public static Scanner scn;

	public static void main(String[] args) {
		scn = new Scanner(System.in);
		int n , i = 1,sum = 0;
		
		do{
			System.out.print("Please Inpute Maximum Sum: ");
			n = scn.nextInt();
		}while(n < 3);
		
		do
			sum+=i++;
		while(i <= n);
		
		System.out.println("1+2+...+" + n + " = " + sum);

	}

}
