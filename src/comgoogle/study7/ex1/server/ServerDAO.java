package comgoogle.study7.ex1.server;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class ServerDAO {

	//getWeathers
	public String getWeathers() throws Exception{
		File file = new File("C:\\Study\\weather.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		ArrayList<String> ar = new ArrayList<>();
		br.readLine();
			String str = br.readLine()+"-";
			str = str+br.readLine()+"-";
			str = str+br.readLine()+"-";
			str = str+br.readLine();
//			System.out.println(str);
			return str;
	}
	
	
	
	
	
}
