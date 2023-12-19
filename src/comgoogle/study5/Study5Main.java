package comgoogle.study5;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Study5Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("숫자 입력");
	try {
	int num = sc.nextInt();

	
	//String str=null;
	//System.out.println(str.toString());
	
	Test t = new Test();
	
	
	int [] arr = new int [2];
	
	arr[3]=10;
	}catch(RuntimeException e) {
		System.out.println("Exception 발생");
	}
	
	System.out.println("정상 진행");
	int a = 10;
	a = a/0;
	
	ArrayList<Integer> ar=null;
	t.t1(ar);
	
	System.out.println("종료합니다.");
}
}
