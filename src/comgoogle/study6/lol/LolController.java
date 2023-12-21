package comgoogle.study6.lol;

import java.util.ArrayList;
import java.util.Scanner;

public class LolController {

	LolDAO lolDAO = new LolDAO();
	LolDTO lolDTO = new LolDTO();
	ArrayList<LolDTO> ar = new ArrayList<>();
	public void Controller() {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("1. 챔피언 추가");
		System.out.println("2. 챔피언 조회");
		System.out.println("3. 챔피언	검색(이름으로)");
		System.out.println("4. 챔피언 삭제");
		System.out.println("5. 챔피언 저장");
		System.out.println("6. 프로그램 종료");
		a = sc.nextInt();
		if(a==1) {
			ar =lolDAO.PlusDAO();
			System.out.println(ar.get(0));
		}else if(a==2) {
			
		}
		
		
		//1. 챔피언 추가
		//2. 챔피언 조회
		//3. 챔피언 검색(이름으로)
		//4. 챔피언 삭제
		//5. 챔피언 저장
		//6. 프로그램 종료
		
	}

}
