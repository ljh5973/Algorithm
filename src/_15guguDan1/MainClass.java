package _15guguDan1;

public class MainClass {

	public static void main(String[] args) {
		
		int n = 2;
		int m = 5;
		
		for(int i=1; i<=9; i++) {
			for(int j=n; j<=m; j++ ) {
				System.out.printf("%2d X %2d =%3d",j,i,j*i);
			}
			System.out.println();
		}
	}
}
