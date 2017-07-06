package tw.alan.myproject.textbook;

public class app3_5 {

	public static void main(String[] args) {
		int i = Integer.MAX_VALUE;  //將i設為整數的最大值
		
		System.out.println("i= " + i);
		System.out.println("i+1= " + (i+1));  //會發生溢位
		System.out.println("i+2= " + (i+2L));
		System.out.println("i+3= " + ((long)i+3));
		
	}

}
