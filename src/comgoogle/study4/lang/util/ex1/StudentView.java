package comgoogle.study4.lang.util.ex1;

import java.util.ArrayList;

public class StudentView {
	//메시지를 출력하는 메소드
	
	public void view(String message) {
		
	}
	
	// 학생 한명의 모든 정보를 출력
	public void view(StudentDTO studentDTO) {
		
	}
	
	//학생들의 모든 정보를 출력
	public void view(ArrayList<StudentDTO> ar) {
		 for(int i=0;i<ar.size();i++) {
			 //향상된 for문
			 //for(모은데이터타입명 변수명: collection변수명) {}			 
			 for(StudentDTO st :ar) {
				 System.out.println(st.getName());
				 System.out.println(st.getKor());
				 System.out.println(st.getEng());
				 System.out.println(st.getSu());
			 }
//			 System.out.println("학생의 이름 :"+ar.get(i).getName());
//			 System.out.println("학생의 국어점수 :"+ar.get(i).getEng());
//			 System.out.println("학생의 영어점수 :"+ar.get(i).getEng());
			 
		 }
	}
}
