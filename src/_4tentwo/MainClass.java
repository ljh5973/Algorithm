package _4tentwo;


public class MainClass {
	public static void main(String[] args) {
		
		
		int inputNum = 25;
		int bin[]= new int[100];
		
		int index = 0;
		
		while(inputNum>0) {
			
			bin[index]=inputNum%2;
			inputNum=inputNum/2;
			index++;
			
			
		
		}
		
		
		index--;
		for(;index>=0;index--) {
			
			System.out.print(bin[index]);
		}
			
		
	}

}
