package comgoogle.study4.lang.ex2;

import java.util.Scanner;

public class Ex2Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("주민번호 입력");//
	String jumsu = sc.next();
//	System.out.println(jumsu.charAt(7)); 
	//1.남자여자구별
	if(jumsu.charAt(7)%2 == 1 ) {
		System.out.println("성별 : 남자");
	}else {
		System.out.println("성별 : 여자");
	}
	//2.대략 나이?
String str = jumsu.substring(0, 2);
//	System.out.println(str);
	int a;
	a = Integer.parseInt(str);
//	System.out.println(a);
	a = a+1900;
//	System.out.println(a);
	a = 2023-a;
	System.out.println("나이 : "+a);
	//3.태어난 계절
	String str1 = jumsu.substring(2, 4);
	
	System.out.println(str1);
	
		
		if(str1.equals("03") || str1.equals("04") || str1.equals("05")) {
			System.out.println("태어난 계절은 봄입니다");
		
		}else if(str1.equals("06") || str.equals("07") || str1.equals("08")) {
			System.out.println("태어난 계절은 여름 입니다");
		}else if(str1.equals("09")|| str1.equals("10")|| str1.equals("11")) {
			System.out.println("태어난 계절은 가을 입니다");
		}else if(str1.equals("12") || str1.equals("1") || str1.equals("2")) {
			System.out.println("태어난 계절을 겨울 입니다");
		}else if(str1.equals("12") || str1.equals("1") || str1.equals("2")) {
			System.out.println("태어난 계절을 겨울 입니다");
		}

		
		
		
		//4.주민번호가 타당한지 검사
		System.out.println(jumsu);
		String [] newstr = jumsu.split("-");
		String int1;
		int1 = String.valueOf(newstr[0]);
		String int2;
		int2 = String.valueOf(newstr[1]);

		String sum = int1+int2;
		long num;
		num = Long.parseLong(sum);
		char chr;
		long log;
		String stg;
		int j = 2;
		long h=0;
System.out.println(sum+"    6");
		for(int i=0; i<sum.length()-1; i++) {
			System.out.println(j);
			if(j != 10) {
			chr = sum.charAt(i);
//			System.out.println(chr);
			stg = String.valueOf(chr);
//			System.out.println(stg);
			log = Integer.parseInt(stg);
//			System.out.println(log);
			log = log*j;
//			System.out.println(log);
			h +=log;
//			System.out.println(h);
//			System.out.println("i : "+i+","+"h : "+h+", "+ "j : "+j);
			j++;
			}else {
				j=2;
				i--;
			}
		}
		System.out.println(h);
		h = h%11;
		h = 11-h;
	
		if(h > 9) {
			h = h%10;
		}
		System.out.println(h);
		System.out.println(h==3);
		
		
		

		
		// 9 9 1 2 2 5 - 1 2 3 4 5 6 7
		// *2 *3 *4 *5 *6 *7  *8 *9 *2 *3 *4 *5
		//		for(int i=0; i<)
		//ex) 122 (총합)을 11로 나눈 나머지를 구함
		// 11에서 나머지를 뺀 결과를 체크용 번혼와 비교
		// 만약에 결과가 2자리라면
		//그 나머지르 ㄹ10으로 나눈 나머지를 구함
		//그 나머지를 체크번호와 일치하는지 확인
		
		//이름, 주민
		}


	

	
	
	
	
	
	
}

