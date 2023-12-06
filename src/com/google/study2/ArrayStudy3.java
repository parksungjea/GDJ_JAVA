package com.google.study2;

public class ArrayStudy3 {
public static void main(String[] args) {
	int [] ar = {2,5,4,1,3};
//	int [] ar1 = {2,5,4,1,3};

	
	
	for(int i=0; i<ar.length;i++) {
		
		for(int j=i+1; j<ar.length;j++) {
			if(ar[i]>ar[j]) {
				
				int t = ar[j];
				ar[j] = ar[i];
				ar[i] = t;

			}
		}
		System.out.println(ar[i]);
	}
	
}
}
