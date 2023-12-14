package com.google.study3.ex;

public class List {

	public void ExList(Ex [] exs) {
		
		for(int i=0; i<exs.length;i++) {
			
			System.out.println(exs[i].getNum());
			System.out.println(exs[i].getCompany());
			System.out.println(exs[i].getName());
			System.out.println(exs[i].getJikbook());
			System.out.println(exs[i].getPhorn());
			System.out.println(exs[i].getEmail());
			System.out.println(exs[i].getAddr());
		
		}
		
		
		
		
	}
}
