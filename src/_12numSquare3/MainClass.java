package _12numSquare3;

public class MainClass {
	
	public static void main(String[] args) {
		
		int n = 3;
		
		int arr[][]= new int[n][n];
		
		
		for(int i =0; i<n; i++){
			for(int j=0; j<n; j++ ) {
				arr[i][j]=n*j+1+i;
			}
		}
		
		
		for(int i =0 ; i<n; i++) {
			for(int j =0; j<n; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}

}
