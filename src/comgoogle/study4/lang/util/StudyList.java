package comgoogle.study4.lang.util;

import java.util.ArrayList;

public class StudyList {
public static void main(String[] args) {
	ArrayList ar = new ArrayList();
	//추가 list에 끝에 add
	ar.add("first");//디형성
	ar.add("second");
	ar.add("second");
	ar.add(3);
	ar.add('a');
	System.out.println(ar.size());
	//삽입의개념
	ar.add(1, 4);
	ar.set(0, '1');
	
	ar.remove("second");
	ar.clear();
	
	
	//
	ar.remove(1);
	for(int i=0; i<ar.size(); i++) {
		//get
		System.out.println(ar.get(i));
	}
}
}
