package _24AvgOver;

public class MainClass {
	public static void main(String[] args) {
		
		int []n = new int[] {7, 100, 95, 90, 80, 70, 60 ,50};
		
		
		int sum=0;
		int count=0;
		for(int i=1; i<n.length; i++) {
			sum+=n[i];
		}
		
		double avg=(double)sum/n[0];
		
		for(int i = 1; i<n.length; i++) {
			if(n[i]>avg) {
				count++;
			}
		}
		System.out.println((double)count/n[0]*100);
		System.out.println((double)count/7);
		
	}
}
