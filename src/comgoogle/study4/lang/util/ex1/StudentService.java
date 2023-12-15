package comgoogle.study4.lang.util.ex1;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class StudentService {

	private String info;
	private String [] str;
	public void StudentService() {
		ArrayList<String> ar = new ArrayList<>();
		this.info="winter-1-50-60-80";
		this.info=this.info+"-iu-2-85-94-74";
		this.info = this.info+"-karina-3-78-78-98";
		System.out.println(this.info);
		
		
		System.out.println();
		
	}
	public void init() {
		StringTokenizer st = new StringTokenizer(this.info,"-");
		while (st.hasMoreTokens()) {
			
		}
		//info 파싱해서 이름-번호-국-영-수-(총점-평균)
		
		//학생정보검색 findBuName 이름으로 검색
		
		//학생정보추가 studentAdd
		
		//학생정보삭제 studentDelet 이름으로 검색해서 삭제
	}
}
