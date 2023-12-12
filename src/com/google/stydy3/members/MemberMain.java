package com.google.stydy3.members;

public class MemberMain {
public static void main(String[] args) {
	Member member = new Member();
//	 		member.name = "winter";
//			member.muge=65.3;
//	 		member.age=20;
	//이름
	member.setName("winter");
	System.out.println(member.getName());
	//몸무게
	member.setMuge(68.5);
	System.out.println(member.getMuge());
	 	
}
}
