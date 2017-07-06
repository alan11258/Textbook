package tw.alan.myproject.textbook;

public class app3_6 {

	public static void main(String[] args) {
		char ch1 = 71;             //設定字元變數ch1等於編碼為71的字元
		char ch2 = 'G';            //設定字元變數ch2等於'G'
		char ch3 = '\u0047';       //以16進位值設定字元變數ch3
		System.out.println("ch1= " + ch1);
		System.out.println("ch2= " + ch2);
		System.out.println("ch3= " + ch3);
		
		char ch4 = '\"';          //將ch4設值為\"
		char ch5 = '\74';         //以八進位值設定字元變數ch5,也可以寫成=074;
		char ch6 = '\u003e';      //以16進位值設定字元變數ch6,也可以寫成=0x3e;
		System.out.println(ch4 + "Time Files." + ch4);
		System.out.println("\"Time is money!\"");
		System.out.println(ch5 + "Tomorrow never comes" + ch6);
		
		double num;              //宣告num為倍精度浮點數變數
		float sum = 2.0f;        //宣告sum為浮點數變數,並設其初始值為2.0
		double num1 = -5.6e64;   //宣告num1為double,其值為-5.6*10^64
		double num2 = -6.32e16;  //e也可以用大寫的E來取代
		float num3 = 2.478f;     //宣告num3為float,並設其初始值為2.478
		float num4 = 2.63e38f;    //錯誤,因為2.63*10^64f已超過float可表示的範圍
		float num5 = 6.3f;        //編譯錯誤,浮點數數值的預設型態是double(float數值後面要寫f)
		double num6 = 6.3;       //編譯成功,正確的宣告方式
		
		float num7 = 5.0f;
		System.out.println(num7 + " * " + num7 + " = " + (num7*num7));
		
		float num8 = Float.MAX_VALUE; float num9 = Float.MIN_VALUE;
		System.out.println("Max Value of Float= " + num8);
		System.out.println("Min Value of Float= " + num9);
		
	}

}
