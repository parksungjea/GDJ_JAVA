package com.google.study2;

import java.time.Year;
import java.util.Calendar;

public class ArrayStudy1 {
public static void main(String[] args) {
//	//배열
//	int num=0;
//	int [] ar = new int[3];
//	System.out.println(ar);
//	
//	String [] names = new String[4];
//	
//	for(int i=0; i<names.length;i++) {
//		names[i]= "d";
//		System.out.println(names[i]);
//	}
//	
//	
//	
//	
	Calendar ca = Calendar.getInstance();
	ca.getTime();
	System.out.println(ca.getTime());
	ca.get(Calendar.YEAR);
	int a = ca.get(Calendar.MONDAY);
	System.out.println(ca.get(Calendar.YEAR));
	System.out.println(ca.get(Calendar.MONDAY));
	System.out.println(ca.get(Calendar.DATE));
	System.out.println(a+1);
}
}
