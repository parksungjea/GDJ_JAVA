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
		Random rd = new Random();
		boolean bl = true;
		ar.add(rd.nextInt(45)+1);
		while(bl) {
			for(int i=0; i<6;i++) {
				ar1.add(rd.nextInt(45)+1);

				if(ar.get(i) != ar1.get(i)) {
					ar.add(ar1.get(i));
					System.out.println(ar.get(i));
				}else {
					i--;
				}
				if(ar.size() == 6) {
					bl = false;
				}+
				
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
			hs.add(rd.nextInt(45+1));
			if(hs.size()==5) {
				hs.add(rd.nextInt(45+1));
			System.out.println(hs);
		}else {
			i--;
		}
		}
	}
}
