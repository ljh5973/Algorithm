package _6commonfactor;

public class MainClass {
	
	public static void main(String[] args) {
		
		int num1= 12;
		int num2= 18;
		
		int small;
		int big;
		
		if(num1>num2) {
			big=num1;
			small=num2;
		}else {
			big=num2;
			small=num1;
		}
		
		int gcd = 1; // 최대공약수
		for(int i=1; i<=small; i++) {
			if(big%i==0&&small%i==0) {
				gcd=i;
			}
			
		}
		
		System.out.println(gcd);
		
		
	}

}
