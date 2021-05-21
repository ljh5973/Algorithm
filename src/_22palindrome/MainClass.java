package _22palindrome;

public class MainClass {
	public static void main(String[] args) {
		String n="123454321";
		
		boolean flag=true;
		for(int i=0; i<n.length()/2; i++) {
			if(n.charAt(i) !=n.charAt(n.length()-i-1)) {
				flag=false;
			}
		}
		
		System.out.println(flag);
	}
	
}
