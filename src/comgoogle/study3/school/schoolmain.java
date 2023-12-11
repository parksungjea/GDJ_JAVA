package comgoogle.study3.school;

import java.util.Scanner;

public class schoolmain {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//객체 생성
	//클래스명 변수명 = new 클래스명();
	//학생의 수를 입력받아서
	//학생의 정보를 입력받기
	

	//학생의 번호;
	int int1 = 0;
	//학생의이름
	//메뉴;
	
	int menu = 0;
	System.out.println("학생이 몇명인가요?");
	int num1 = sc.nextInt();
	int [] q = new int[num1];
	Student [] student1 = new Student[num1];
	for(int i=0; i<2; i++) {
		System.out.println("1: 학생정보입력\n 2: 학생정보보기\n 3: 학생정보검색 \n 4: 프로그램 종료");
		menu = sc.nextInt();
		if(menu==1) {
			Student stu = new Student();
			System.out.println("몇번학생?");
			int1 = sc.nextInt();
			System.out.println("학생의 이름을 입력하세요");
			stu.name = sc.next();
			System.out.println("학생의 번호를 입력하세요");
			stu.num = sc.nextInt();
			System.out.println("학생의 학점을 입력하세요");
			stu.jumsu = sc.nextDouble();
			student1[int1] = stu;
			q[int1]=1;
		i=0;
		}
		if(menu==2) {
			for(int j=0; j<student1.length;j++) {
				if(q[j] == 1) {
			System.out.println(student1[j].name);
			System.out.println(student1[j].num);
			System.out.println(student1[j].jumsu);
				}
		i=0;
			}
		}
		if(menu==3) {
			System.out.println("몇번학생의 정보를 보고싶나요~~?");
			int1 =sc.nextInt();
			
			System.out.println("이름 : "+student1[int1].name+", 번호 :"+student1[int1].num+", 학점 :"+student1[int1].jumsu);
			i=0;
		}
		if(menu==4) {
			System.out.println("프로그램을 종료합니다");
			i=100;
		}
		
	}
}
}
