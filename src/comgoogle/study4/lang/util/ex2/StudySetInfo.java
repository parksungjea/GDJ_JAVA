package comgoogle.study4.lang.util.ex2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class StudySetInfo {
	//로또 번호 생성
	//1-45,6개
	public void ex1() {
	//ArrayList
		ArrayList<Integer> ar = new ArrayList<>();
		ArrayList<Integer> ar1 = new ArrayList<>();
		Random random = new Random();
		int a= 0;
		
		for(int i=0; i<6; i++) {
		a =	random.nextInt(45);
		if(i==0) {
			ar.add(a);
		}
		if(a != ar.get(i)) {
			ar.add(a);
		}else {
			
		}
			

			
		}

	}
	
	public void ex2() {
		//Hashset
		System.out.println("--------------------------------");
		HashSet<Integer> hs = new HashSet<>();
		Random rd = new Random();
		ArrayList<Integer> ar = new ArrayList<>();
		for(int i=0; i<6; i++) {
			hs.add(rd.nextInt(45));
			if(hs.size()==5)
				hs.add(rd.nextInt(45));
			System.out.println(hs);
			i--;
		}
	}
}
