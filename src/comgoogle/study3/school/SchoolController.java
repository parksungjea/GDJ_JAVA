package comgoogle.study3.school;

import java.util.Scanner;

public class SchoolController {

	
	public void start() {
		Scanner sc = new Scanner(System.in);
		Student [] students = null;
		SchoolView schoolview = new SchoolView();
		int a;
		boolean check=true;
		while(check) {
		System.out.println("1. 학생정보입력");
		System.out.println("2. 학생정보출력");
		System.out.println("3. 학생정보검색");
		System.out.println("4. 학생정보추가");
		System.out.println("5. 프로그램종료");
		a = sc.nextInt();
		if(a==1) {
			SchoolSevice schoolsevice = new SchoolSevice();
			students=schoolsevice.makeStudents(); 
		}
		if(a==2) {
			
			schoolview.View(students);
			
			
		}
		if(a==3) {
			SchoolSevice schoolsevic = new SchoolSevice();
			schoolsevic.findByNum(students);
		}
		if(a==4) {
			
		}
		if(a==5) {
			System.out.println("프로그램을 종료합니다");
			check=false;
			break;
		}
		}
		
	}
	
	
	
}
