package _5letteruppersmall;

public class MainClass {
	public static void main(String[] args) {
		
		
		
		String a = "helloWorlD";
		
		char []arr;
		
		arr= a.toCharArray();
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>='a'&& arr[i]<='z') {
				arr[i]=(char)(arr[i]+ ('A'-'a'));
				
			}
			else if(arr[i]>='A'&&arr[i]<='Z') {
				arr[i]=(char)(arr[i]-('A'-'a'));
				
			}
		}
		System.out.println(arr);
		
	}

}
