public class Task2{
	public static void main(String[] args){
		
		int number = 0;
		for(int i = 2;i <= 100;i++) {
			if(i%2==0) {
				number +=i;
				//System.out.println(i);
			}
		}
		System.out.println(number);
	}
}
	