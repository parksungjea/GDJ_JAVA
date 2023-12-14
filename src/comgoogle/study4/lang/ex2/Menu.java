package comgoogle.study4.lang.ex2;

import java.util.Scanner;

public class Menu {
Scanner sc = new Scanner(System.in);

	public void Menu() {
		System.out.println("주민번호를 입력하세여");
		String num = sc.next();
		
		System.out.println("1 : 성별");
		System.out.println("2 : 나이");
		System.out.println("3 : 태어난 계절");
		System.out.println("4 : 맞는 주민번호인지");
	}
}
