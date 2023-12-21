package comgoogle.study7.ex1.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class ClientController {

	
	
	
	public void start() throws Exception{
		Scanner sc = new Scanner(System.in);
		//1.서버와 소켓 연결 시도
		Socket sk = new Socket("localhost", 8282);
		OutputStream os = sk.getOutputStream();
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		
		InputStream is = sk.getInputStream();
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
	
		System.out.println("서버와 연결 성공");
		System.out.println("메뉴를 선택하세요");
		System.out.println("1. 날씨정보출력");
		System.out.println("2. 날씨정보검색");
		System.out.println("3. 프로그램종료");
		 String m = sc.next();
		bw.write(m+"\n\r");
		bw.flush();
		String rem;
		rem = br.readLine();
		System.out.println(rem);
		String [] st;
		String [] str = new String[4];
		ArrayList<String> ar = new ArrayList<>();
		st = rem.split("-");
		int a = 0;
		int b = 1;
		int c = 2;
		int d =3;
		System.out.println(st.length);
		for(int i=0; i<4;i++) {
			str[i] = st[a];
			str[i] += st[b];
			str[i] += st[c];
			str[i] += st[d];
			a+=4;
			b+=4;
			c+=4;
			d+=4;
		}
		ar.add(str[0]);
		ar.add(str[1]);
		ar.add(str[2]);
		ar.add(str[3]);
		System.out.println(ar.get(0));
		System.out.println(ar.get(1));
		System.out.println(ar.get(2));
		System.out.println(ar.get(3));
		
		
		
		//1.날씨정보출력
		//2.날씨정보검색
		//3.프로그램종료
	}
	
}
