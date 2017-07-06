package tw.alan.myproject.textbook;

public class Practice001 {
	
	public void triangle1(){
		
		for(int m = 1; m <= 10; m++){
			for(int i = 1; i <= 11-m; i++)
				System.out.print(" ");
			for(int j = 1; j <= m; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void triangle2(){
		
		for(int m = 1; m <= 10; m++){
			for(int i = 1; i <= m; i++)
				System.out.print(" ");
			for(int j = 1; j <= 11-m; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void triangle3(){
		
		for(int i = 1; i <= 10; i++){            //金字塔有10列
			
			for(int m = 1; m <= 11-i; m++){      //空白隨著列數遞減
				System.out.print(" ");
			}
			
			for(int n = 1; n <= i; n++){         //*隨著列數遞增,和空白組合成左半邊金字塔
				System.out.print("*");
			}
			
			for(int n = 1; n <= i-1; n++){     //*隨著列數遞增,和空白組合成右半邊金字塔
				System.out.print("*");         //和左半邊排列順利相反而已,值不變
			}                                  //最後加上i-1,讓右半邊少(矮)一列,使左邊多一個*當頂端
			
			for(int m = 1; m <= 11-i; m++){      //空白隨著列數遞減,因為在金字塔右邊,要反白才看得到
				System.out.print(" ");
			}		
			System.out.println();   //要換行,否則會都同一列變=>     *    **   ***  **** *****
		}
	}

	public static void main(String[] args) {
//		九九乘法表
		int i =1;                  //i列數也是左邊要乘的數        
		while(i <= 9){
		
			int j = 1;             //j是右邊要乘的數,也是橫向要印幾組的數量
			while(j <= 9){
				if(i*j < 10){      //最後才做,為了讓個位數的結果可以十位數部分空一格,美觀
					System.out.print(i + "x" + j + "= " + (i*j) + "\t");
				}else{
				System.out.print(i + "x" + j + "=" + (i*j) + "\t");
				}                  //先印左右相乘等餘的值,因為不換行用print
				j++;               //完成橫向的9組
			}
			System.out.println();  //列數要換行用println
			i++;
		}
		System.out.println("-------------------");	
		
		Practice001 test1 = new Practice001();
		test1.triangle1();
		System.out.println("-------------------");
		test1.triangle2();
		System.out.println("-------------------");
		test1.triangle3();
	
		
		
		
	}

}
