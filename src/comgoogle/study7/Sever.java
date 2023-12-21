package comgoogle.study7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import org.xml.sax.InputSource;

public class Sever {
public void s() throws Exception{
	Scanner msg = new Scanner(System.in);
	
	System.out.println("클라이언트가 접속하기를 기다리는중");
	ServerSocket ss = new ServerSocket(8282);
//	Socket sk = new Socket("localhost", 8282);
	Socket sc = ss.accept();
	System.out.println("Client 연결 성공");
	
	boolean bl = true;
	
	
	InputStream is = null;
	InputStreamReader ir = null;
	BufferedReader br = null;
	
	OutputStream os = null;
	OutputStreamWriter ow = null;
	BufferedWriter bw = null;
	while(true) {
		is=sc.getInputStream();
		ir = new InputStreamReader(is);
		br = new BufferedReader(ir);
	System.out.println(br.readLine());

	//받앗음
	os=sc.getOutputStream();
	ow = new OutputStreamWriter(os);
	bw = new BufferedWriter(ow);
	System.out.println("클라이언트에게 할 메세지");
	String m = msg.next();
	bw.write(m+"\r\n");
	bw.flush();
	System.out.println("111");
	//보냈음
	if(m.equals("exit")) {
		bl = false;
	}
	}
	
//	br.close();
//	ir.close();
//	is.close();
//	ss.close();
	
	
//	System.out.println("프로그램 종료");
//	
	
}
}
