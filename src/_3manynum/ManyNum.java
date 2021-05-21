package _3manynum;

import java.util.Arrays;
import java.util.Scanner;

public class ManyNum {
	
	public static void main(String[] args) {
		
		// 최빈수 구하기
		
		Scanner scan = new Scanner(System.in);
		
		int []inputNum = new int[10];
		for(int i = 0; i<10;i++) {
			
			inputNum[i]=scan.nextInt();
		}
		
		
		//사용자 input
		
		// 1 2 2 3 1 4 2 2 4 3
		
		//1 : 2
		//2 : 4 -- 최빈수
		//3 : 2
		//4 : 2
		
		int [] mode = new int [10];
		
		
		for(int i = 0; i<inputNum.length ; i++) {
			mode[inputNum[i]]++;
			
			}
			
			
		
	int modeNum=0;
	int modeCnt=0;
	
	for(int i=0; i<10; i++) {
		if(modeCnt< mode[i]) {
			modeCnt=mode[i];
			modeNum=i;
		}
	}
	System.out.println("최빈수는"+modeNum);
	System.out.println("카운트된 수는"+modeCnt);
		
		
		
	}

}
