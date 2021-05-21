package _25sumCycle;

public class MainClass {
	public static void main(String[] args) {
		
		int num = 26;
		int re= num;
		
		int tmp=0;
		int count= 0;
		do {
			tmp= re/ 10 + re %10;
			re=tmp%10+re%10*10;
			count++;
			
			System.out.println(re);
		}while(re!=num);
		System.out.println(count);
	}
}
