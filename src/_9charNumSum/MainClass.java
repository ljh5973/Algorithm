package _9charNumSum;

public class MainClass {

	
	public static void main(String[] args) {
		
		
		//각 자리수의 합
		int num =1242;

		int sum=0;
		while(num>0) {
			sum+=num%10;
			num=num/10;
		
			}
		
		
		System.out.println(sum);
	}
}
