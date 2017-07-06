package tw.alan.myproject.textbook;
import java.util.Scanner;
public class app4_13 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String KG = "KG", GBP = "GBP"; double kg; double gbp;
		System.out.println("Please inpute KG or GBP.");
		String index = scn.next();
		
		if(index.equalsIgnoreCase(KG)){
			System.out.println("Please Inpute KG Weight.");
			kg = scn.nextDouble();
			System.out.println(kg + " KG = " + (kg/0.454)  + " GBP");
		}
		else if(index.equalsIgnoreCase(GBP)){
			System.out.println("Please Inpute GBP Weight.");
			gbp = scn.nextDouble();
			System.out.println(gbp + " GBP = " + (gbp*0.454)  + " KG");
		}

	}

}
