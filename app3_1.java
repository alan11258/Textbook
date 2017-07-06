package tw.alan.myproject.textbook;

public class app3_1 {

	public static void main(String[] args) {
		int num = 3;
		char ch = 'C';
		final double PI = 3.1415926;  //大寫命名常數(constant)
		
		System.out.println(num + " is an integer.");
		System.out.println(ch + " is a character.");
		
		long lmax = (java.lang.Long.MAX_VALUE);
		long lmin = (Long.MIN_VALUE);
		int imax = (Integer.MAX_VALUE);
		int imin = (Integer.MIN_VALUE);
		short smax = (Short.MAX_VALUE);
		short smin = (Short.MIN_VALUE);
		byte bmax = (Byte.MAX_VALUE);
		byte bmin = (Byte.MIN_VALUE);
		
		System.out.println("Max Value of Long = " + lmax);
		System.out.println("Min Value of Long = " + lmin);
		System.out.println("Max Value of Int = " + imax);
		System.out.println("Min Value of Int = " + imin);
		System.out.println("Max Value of Short = " + smax);
		System.out.println("Min Value of Short = " + smin);
		System.out.println("Max Value of Byte = " + bmax);
		System.out.println("Min Value of Byte = " + bmin);
		
	}

}
