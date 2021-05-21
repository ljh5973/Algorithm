package _8factorial;

public class Mainclass {
	
	public static void main(String[] args) {
		
		int num = 3;
		int accNum= 1;
		
		for(int i= 1; i<=num; i++) {
			accNum*=i;
		}
		System.out.println(accNum);
	
		
		//5!= 5 * 4 * 3 * 2 * 1
		//7!= 7 *6 * 5 * 4 * 3 * 2 * 1
	}

}
