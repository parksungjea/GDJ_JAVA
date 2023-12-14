package com.google.study3.ex;

import java.util.Scanner;

public class Plus  {
	Scanner sc = new Scanner(System.in);
	

public Ex [] start(Ex [] exs) {			
	  Ex ex = new Ex();
	  System.out.println("명함의 번호를 입력하세요");
	  ex.setNum(sc.nextInt());
	  
	  System.out.println("이름을 입력하세요");
	  ex.setName(sc.next());
	  
	  System.out.println("회사명을 입력하세요");
	  ex.setCompany(sc.next());
	  
	  System.out.println("전화번호를 입력하세요");
	  ex.setPhorn(sc.nextInt());
	  
	  System.out.println("이메일을 입력하세요");
	  ex.setEmail(sc.next());
	  
	  System.out.println("주소를 입력하세요");
	  ex.setAddr(sc.next());
	  
	  System.out.println("직책을 입력하세요");
	  ex.setJikbook(sc.next());
	  
	  
	  if(exs == null) {
		  Ex [] newexs = new Ex[1];
		  newexs[0] = ex;
		  return newexs;
	  }else {
	  
		  Ex [] newexs = new Ex[exs.length+1];
		  for(int i=0; i<newexs.length-1;i++) {
			  newexs[i] = exs[i];
		  }
		  
		  newexs[exs.length]=ex;
		  
		  return newexs;
	   
	  }
	}
	


	



}
