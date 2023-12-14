package comgoogle.study4.lang;

import java.util.Scanner;

public class StringStudy {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String name = "winter";
	String name2 = "winter";
	char ch = name.charAt(1);
	System.out.println(name == name2);
	System.out.println("이름 입력");
	String name3=sc.next();
	System.out.println(name.equals(name3));
	
	String n = "abc";
	String n2 = "123";
	n = n+n2;
}

}