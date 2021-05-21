package _14numCnt;

public class MainClass {
	public static void main(String[] args) {
		
		int num = 421314218;
		
		
		int arr[]=new int[10];	//0~9입력된 수를 cnt 위한 용도
		// int arr[0] = 0;		
		//
		//int arr[1]= 3;		
		//		
		//int arr[4]= 2;
		int z=0;
		while(num> 0) {
			arr[num%10]++;
			num/=10;
			
		}
		for(int i = 0 ; i<10; i++) {
			System.out.println(i+"의 개수는: " +arr[i]);
			
		}
	}
}
