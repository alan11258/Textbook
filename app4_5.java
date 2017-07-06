package tw.alan.myproject.textbook;
import java.util.Scanner;
public class app4_5 {

	private static Scanner scn;

	public static void main(String[] args) {
		System.out.println("Please Inpute Score.");
		scn = new Scanner(System.in);
		int score;
		score = scn.nextInt();
		
		if ((score < 0) || (score > 100)){
			System.out.println("Inpute Error!!");
		}
		if ((score < 50) && (score >= 0)){
			System.out.println("Flunk The Test!!");
		}
		if ((score < 60) && (score > 49)){
			System.out.println("Make Up Exam!!");
		}
		if ((score < 70) && (score > 59)){
			System.out.println("You Shoud Carry On!!");
		}
		if ((score < 80) && (score > 69)){
			System.out.println("Not Bad!!");
		}
		if ((score < 90) && (score > 79)){
			System.out.println("Good Job!!");
		}
		if ((score < 100) && (score > 89)){
			System.out.println("Excellent!!");
		}
		if (score == 100){
			System.out.println("Perfect, Yor're Genius!!");
		}
		System.out.println("Finished.");

	}

}
