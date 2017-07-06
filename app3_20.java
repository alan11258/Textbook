package tw.alan.myproject.textbook;
import java.util.Scanner;
public class app3_20 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		short i = 0; char ch; int numinput, num;
		
		System.out.println("Please Input One English Alphabet");
		ch = scn.next().charAt(0);
		if(ch >= 97 && ch < 122)      //英文小寫十進位097-122
			i = (short)(ch - 97 +1);
		else if(ch >= 65 && ch <=90)  //英文大寫十進位065-090
			i = (short)(ch - 65 +1);
		System.out.println(ch + " Is No." + i + " Letter of Alphabet.");
		System.out.println("--------------------------");
//		Hw3_20
		System.out.println("Please Input An Integer Number.");
		numinput = scn.nextInt();
		num = numinput*3;
		System.out.println(numinput + " x 3 = " + num);
		System.out.println("--------------------------");
//		Hw3_21
		System.out.println("Please Input Two Integer Value.");
		int num1, num2;
		num1 = scn.nextInt();
		num2 = scn.nextInt();		
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
		
	}

}
