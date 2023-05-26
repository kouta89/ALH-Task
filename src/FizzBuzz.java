public class FizzBuzz{
	
	//１から順番に数を表示する
			//その数が３で割り切れる数なら"Fizz"、
			//５で割り切れる数なら"Buzz"、
			//両方であるなら"FizzBuzz"と表示する
	public static void main(String[] args) {
		
		//変数宣言
		
		//ループカウンタ
		int i = 0;
		//繰り返し最大数
		int loopCount = 100;
		//3の倍数
		int numFizz = 3;
		//5の倍数
		int numBuzz = 5;
		//Fizz文字列
		String strFizz = "Fizz";
		//Buzz文字列
		String strBuzz = "Buzz";
		
		//問1
		for(i=1;i<=loopCount;i++) {
			//問2
			if(i%(numFizz*numBuzz)==0) {
				System.out.println(strFizz+strBuzz);
			}//問3
			else if(i%numFizz==0) {
				System.out.println(strFizz);
			}//問4
			else if(i%numBuzz==0) {
				System.out.println(strBuzz);
			}else {
				System.out.println(i);
			}
		}
		
		//回答
		//問1 : for
		//問2 : if
		//問3 : else if
		//問4 : i%numBuzz==0
		
		
		
	}
}