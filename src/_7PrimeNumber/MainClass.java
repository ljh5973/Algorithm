package _7PrimeNumber;

public class MainClass {
	
	public static void main(String[] args) {
		
		
		
//		소수 1, 자기자신만 나누어짐
//		내 풀이
//		
//		int num = 9;
//		
//		int count=0;
//		
//		for(int i = 1; i<=num; i++) {
//			if(num%i==0) {
//				count++;
//			}
//		}
//		if(count==2) {
//			System.out.println(num+"은 소수입니다.");
//		}else {
//			System.out.println(num+"은 소수가아닙니다.");
//		}
//		
		
		// 유튜브 풀이
		
		int num=13;
		
		boolean isPrimeNumber=true;
		
		for(int i= 2; i<=num/2; i++) {
			if(num%i==0) {
				//primeNumber X
				isPrimeNumber=false;
				
			}
		}
		if(isPrimeNumber) {
			System.out.println(num+"은 소수입니다.");
		}else {
			System.out.println(num+"은 소수가아닙니다.");
		}
		
	}

}
