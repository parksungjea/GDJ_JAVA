package com.google.stydy3.members;

public class Member {
	//비만관리 회원프로그램
	private String name;
	private double muge;
	private double ki;
	private int age;
	
	public Member() {}
	
	public Member(double muge) {
		this.muge = muge;
	}
	
	//데이터 입력 set+변수명
	public void setName(String name) {
		this.name=name;
	}
	public void setMuge(double muge) {
		if(muge>=0 && muge<300) {
		this.muge=muge;
		}else {
			this.muge = 60.0;
		}
	}
	public double getKi() {
		return ki;
	}

	public void setKi(double ki) {
		this.ki = ki;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//데이터 조회 get+변수명
	public String getName() {
		return this.name;
	}
	public double getMuge() {
		return this.muge;
	}
	
	
}
