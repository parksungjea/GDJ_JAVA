package comgoogle.study6.lol;

import java.util.ArrayList;
import java.util.Scanner;

public class LolDAO {

	
	LolDTO lolDTO = new LolDTO();
	public ArrayList<LolDTO> PlusDAO() {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		ArrayList<LolDTO> ar = new ArrayList<>();
		System.out.println("캐릭터의 이름을 입력하세요");
		lolDTO.setName(sc.next());;
		System.out.println("캐릭터의 q스킬 이름을 입력하세요");
		lolDTO.setQ(sc.next());
		System.out.println("캐릭터의 w스1킬 이름을 입력하세요");
		lolDTO.setW(sc.next());
		System.out.println("캐릭터의 e스킬 이름을 입력하세요");
		lolDTO.setE(sc.next());
		System.out.println("캐릭터의 r스킬 이름을 입력하세요");
		lolDTO.setR(sc.next());
		ar.add(lolDTO);
		return ar;
	}
	
	public void JoDAO(ArrayList<LolDTO> ar) {
//		ar.get();
	}
	
}
