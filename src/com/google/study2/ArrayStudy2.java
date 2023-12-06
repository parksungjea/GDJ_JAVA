package com.google.study2;

public class ArrayStudy2 {
public static void main(String[] args) {
	int [] ar = {2,4,5,};
	int [] ar3 = {2,4};
	ar = ar3;
	
//			int [] ar2 = ar;
//			ar[0]=100;
//			System.out.println(ar2[0]);
			
			for(int i=0;i<ar.length;i++) {
				System.out.println(ar[i]);
			}
}
}
