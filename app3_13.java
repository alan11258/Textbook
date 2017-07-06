package tw.alan.myproject.textbook;
import java.util.Scanner;        //載入Scanner類別;
public class app3_13 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);  //宣告Scanner類別的物件
		String name;
		int age;
		
		System.out.print("What's your name? ");
		name = scn.nextLine();                     //輸入字串
		System.out.print("How old are you? ");
		age = scn.nextInt();                       //輸入整數
		
		System.out.print("Hi, " + name + ", you're ");
		System.out.println(age + " years old.");
	}

}
