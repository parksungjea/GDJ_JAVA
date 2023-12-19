package comgoogle.study6.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class WeatherDAO {
	//DAO: Data Access Object
	
	//getWeathers
	//file에서 내용을 읽어오는 역할	
	
	int a=0;
	int b=1;
	int c=2;
	int d=3;
	public void getWeathers() throws Exception {
		File file = new File("C:\\Study\\weather.txt");
		FileReader fi = new FileReader(file);
		BufferedReader br = new BufferedReader(fi);
		ArrayList<String> ar = new ArrayList<>();
		br.readLine();
		WeatherDTO dt = new WeatherDTO();
		WeatherDTO [] newdt = new WeatherDTO[4];
		//dt.getNmae ok
		//newdt.getName xxx 
		for(int i=0; i<4;i++) {
			String [] str ; //??
			String sr = br.readLine();
			str = sr.split("-"); //
			ar.add(str[0]);
			ar.add(str[1]);
			ar.add(str[2]);
			ar.add(str[3]);		
		}
		for(int i=0; i<4;i++) {
			newdt[i] =new WeatherDTO();
//			System.out.println(ar.get(a));
//			System.out.println(ar.get(b));
//			System.out.println(ar.get(c));
//			System.out.println(ar.get(d));
			newdt[i].setName(ar.get(a));
			newdt[i].setOndo(ar.get(b));
			newdt[i].setGion(ar.get(c));
			newdt[i].setSudo(ar.get(d));
			a+=4;
			b+=4;
			c+=4;
			d+=4;
		}
		for(int i=0; i<4;i++) {
			System.out.println(newdt[i].getName());
			System.out.println(newdt[i].getOndo());
			System.out.println(newdt[i].getGion());
			System.out.println(newdt[i].getSudo());
		}
	
	//1.파일의 내용을 한줄씩 읽어오기
	//2.한줄의 내용을 파싱
	//3. 파싱한 토큰을  DTO를 생성하고 멤버변수에 대입
	//4. DTO를 List에 추가하는 작업
	//5. List를 return
}
}
