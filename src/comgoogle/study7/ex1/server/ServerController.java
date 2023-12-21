package comgoogle.study7.ex1.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerController {

	
	
	public void start() throws Exception{
		Scanner sc = new Scanner(System.in);
		ServerSocket ss = new ServerSocket(8282);
		System.out.println("클라이언트를 기다리는중");
		Socket sk = ss.accept();
		
		System.out.println("연결성공");
		OutputStream os = sk.getOutputStream(); 
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		
		InputStream is = sk.getInputStream();
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		ServerDAO sd = new ServerDAO();
		String menu = br.readLine();
		String str;
		
		if(menu.equals("1")) {
				str = sd.getWeathers();
				bw.write(str+"\n\r");
				bw.flush();
		}else if(menu.equals("2")) {
			System.out.println("2");
		}else if(menu.equals("3")) {
			System.out.println("3");
			
		}


	

		
		
		
		

		
		
		
		//1.날씨정보출력
		//2.날씨정보검색
		//3.프로그램종료
		//client와 연결 준비
	}
	
	
	
}
