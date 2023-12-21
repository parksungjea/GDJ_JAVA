package comgoogle.study6.b;

import java.util.Scanner;

public class A {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String [] a;
	int  k;
	String sr = sc.next();
	B b = new B();
	a=b.b(sr);
	C c = new C();
	k=c.c(a);
	System.out.println(k);
}
}




//a   > 문자열인데 숫자만 입력하시고  5-15-20-30     >c
		
//b		> 배열로 변경       >a 

//c		>다 더하는거에요

// a > b >a > c



// Champion
// name, q, w, e ,r

//1. 챔피언 추가
//2. 챔피언 조회
//3. 챔피언 검색(이름으로)
//4. 챔피언 삭제
//5. 챔피언 저장
//6. 불러오기
//7. 프로그램 종료



