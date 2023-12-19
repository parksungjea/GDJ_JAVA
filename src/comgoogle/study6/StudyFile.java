package comgoogle.study6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudyFile {

	
	public void f4() throws Exception {
		File file = new File("c:\\Study\\test2.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		while(true) {
		String s = br.readLine();
		if(s == null) {
			break;
		}else if(s.equals("")){
			
		}else {
		System.out.println(s);
		}
		}
		
		br.close();
		fr.close();
	}
	
	
	public void f3() throws IOException {
		Scanner sc = new Scanner(System.in);
		File file = new File("c:\\Study\\test2.txt");
		FileWriter fw = new FileWriter(file, true);
		boolean bl = true;
		while(bl){
		String message = sc.next();
		if(message.toUpperCase().equals("EXIT")) {			
		bl = false;
		}else {
			fw.write(message+"\r");
			fw.flush();
		}
		}
		fw.close();
		sc.close();
	}
	
	
	
	public void f2() throws Exception{
		File file = new File("c:\\study"); 
			String [] ar = file.list();
			for(String s : ar) {
				System.out.println(s.length());
				File f = new File(file, s);
				System.out.println(f.length());
			}
		
	}
	
		public void f1() {
			File file = new File("c:\\Study\\Test.java");
			file = new File("C:\\study", "test");
					
			System.out.println(file.exists());
			System.out.println(file.isDirectory());
		
		
		
		}
}
