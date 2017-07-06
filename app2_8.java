package tw.alan.myproject.textbook;

public class app2_8 {  //定義public 類別app2_8

	public static void main(String[] args) //主程式開始
	
	{
		int n;  //宣告為整數
		n = 8;  //宣告n為整數8
		
		System.out.println(n + "+" + n + "=" + (n+n));//印出字串
		System.out.println(n + "*5=" +(n*5));//印出字串

		System.out.println(n + "+" + n + "=" + n + n);//印出字串
		System.out.println(n+"*5=" + n*5);//印出字串
		
		System.out.println("Never too old to learn.");//印出字串內容
		
		System.out.print("It's hunting time.");//印出字串內容，不換行
		System.out.println(" Mutation complete.");//印出字串內容，並換行
		
		int i; i=5;
		System.out.println("i= " + i);
		i = i + 3;
		System.out.println("i= " + i);
		
	}

}
