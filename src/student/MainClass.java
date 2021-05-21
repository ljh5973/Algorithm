package student;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		
		Student st1 = new Student("손오공" , "1682");
		Student st2 = new Student("저팔계" , "1223");
		Student st3 = new Student("사오정" , "1532");
		
		ArrayList<Student> list = new ArrayList<>();
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
		for(Student s:list) {
			System.out.println(s.getName()+" "+s.getNo());
		}
		
		Scanner scan = new Scanner(System.in);
		

		while(true){
			System.out.println("계속 검색을 하고싶으시면 y, 종료하시려면 n");
			String input = scan.next();
				
			boolean flag = false;
			
			if(input.equals("y")) {
				System.out.println("검색을 시작합니다.");
				System.out.println("이름을 입력해주세요.");
				String name = scan.next();
				
				for(Student s : list) {
					if(s.getName().equals(name)) {
						System.out.println(s.getName()+s.getNo());
						flag = true;
					}
					
				}
				if(!flag) {
					System.out.println(name + " 이름이 없습니다.");
				}
				
				
				
			}else if(input.equals("n")) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
		}	
		
		
	}

}
