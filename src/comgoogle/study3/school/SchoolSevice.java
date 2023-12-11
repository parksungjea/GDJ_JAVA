package comgoogle.study3.school;

import java.util.Scanner;

public class SchoolSevice {
	Scanner sc = new Scanner(System.in);
	//메서드 makeStudents
	//학생수를 입력받아서 학생수만큼 학생정보 입력
	public Student[] makeStudents() {
		System.out.println("학생 수를 입력하세요");
		int a = sc.nextInt();
		Student [] student1 = new Student[a];
		for(int i=0;i<student1.length;i++) {
			Student student = new Student();
			System.out.println("학생의이름");
			String b = sc.next();
			student.name = b;
			System.out.println("학생의번호");
			int c = sc.nextInt();
			student.num = c;
			System.out.println("학생의 학점");
			double d = sc.nextDouble();
			student.jumsu = d;
			student1[i] = student;
		}
		return student1;
	}
	
	
	
	
}
