package _23StringFlip;

public class MainClass {
	public static void main(String[] args) {
		
		String a = "ADEFH";	// -> HFEDA
		char [] c=a.toCharArray();
		
		char temp;
		int len=a.length();
		
		
		for(int i = 0 ; i<len/2; i++) {
			temp=c[i];
			c[i]=c[len-i-1];
			c[len-i-1]=temp;
		}
		
		a= new String(c);
		System.out.println(a);
	}
}
