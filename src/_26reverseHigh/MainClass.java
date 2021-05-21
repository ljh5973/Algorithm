package _26reverseHigh;

public class MainClass {
	public static void main(String[] args) {
		
	int a = 299;
	int b = 308;
	
	int [] arrA= new int[3];
	int [] arrB= new int[3];
		
	int index=0;
	do {
		arrA[index]=a%10;
		a/=10;
		index++;
	}while(a>0);
	
	int tranA= 0;
	int mux=1;
	for(int i =arrA.length-1; i>=0; i--) {
		tranA+=arrA[i]*mux;
		mux*=10;
	}
	int index2=0;
	while(b>0) {
		arrB[index2]=b%10;
		b/=10;
		index2++;
	}
	int tranB=0;
	int mux2=1;
	for(int i =arrB.length-1; i>=0; i--) {
		tranB+=arrB[i]*mux2;
		mux2*=10;
	}
	
	if(tranA>tranB) {
		System.out.println(tranA);
	}else {
		System.out.println(tranB);
	}
	
	}
}
