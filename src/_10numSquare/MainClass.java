package _10numSquare;

public class MainClass {

	
	public static void main(String[] args) {
		
		
		int num = 4;
		
		int sum = 1;
		
		/*
		 *  1 2 3
		 *  4 5 6 
		 *  7 8 9
		 *  
		 */
		
		for(int i= 0; i<num; i++) {
			
		
			for(int j = 0; j<num; j++) {
				
				System.out.printf("%5d", i*(num)+j+1);
				
			}
			System.out.println();
		}
		
	}
}
