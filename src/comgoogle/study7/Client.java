package comgoogle.study7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
public void send() throws Exception{
	Scanner sc = new Scanner(System.in);
	Socket socket = new Socket("localhost", 8282);
	System.out.println("서버와 접속 성공");
	boolean bl = true;
	
	
	
	OutputStream os = null;
	OutputStreamWriter ow = null;
	BufferedWriter bw = null;
	
	InputStream is = null;
	InputStreamReader ir = null;
	BufferedReader br = null;
	while(true) {
		os=socket.getOutputStream();
		ow = new OutputStreamWriter(os);
		bw = new  BufferedWriter(ow);
		System.out.println("서버로 보낼 메세지를 입력하세요");
		String m = sc.next();
		bw.write(m+"\n\r");
		bw.flush();
	
		if(m.equals("exit")) {
			bl = false;
			
		}
		//보냈음
		System.out.println("111212");
		is = socket.getInputStream();
		ir = new InputStreamReader(is);
		br = new BufferedReader(ir);
		System.out.println(br.readLine());
	//받아야댐
	//받았음
	if(m.equals("exit")) {
		bl = false;
		
	}
	}
//	bw.close();
//	ow.close();
//	os.close();
//	socket.close();
//	sc.close();
	
	
	
	
	
	
}
}
