package fibonacci;

public class MainClass {

	
	public static void main(String[] args) {
		
		
		//1번째 방법.
		int []arr = new int[100];
		
		
		//An = An-1 An-2;  n>=3
		//a1 = 1, a2 = 1;
		
		arr[1]=1;
		arr[2]=1;
		
		for(int i = 3; i<arr.length; i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		for(int i = 1; i<=10; i++) {
			System.out.print(arr[i]+ " ");
		}
		
		
		//2번쨰 방법. 배열 쓰지 않기.

		//An = An-1 An-2;  n>=3
		//a1 = 1, a2 = 1;
		
		int prevPrevNum = 1;	//An-2
		int prevNum = 1;		//An-1
		System.out.println();
		System.out.print(prevPrevNum+" ");
		System.out.print(prevNum+" ");
		for(int i = 3; i<=10; i++) {
			
			int nNum=prevPrevNum+prevNum;
			System.out.print(nNum+" ");
			prevPrevNum = prevNum;
			prevNum=nNum;
		}
	}
}
