package comgoogle.study4.lang.ex1;

public class WeatherService {
private String datas;
int a = 0;
int b = 1;
int c = 2;
int d = 3;

public	WeatherService(){
	this.datas="서울-10-비-80-부산-25-맑음-50,대구-8-눈-12,제주.25,태풍-40";
}
public Plus [] init() {
	
//	this.datas.split(",");
	
	this.datas = this.datas.replace(",", "-");
	System.out.println(this.datas);
	this.datas = this.datas.replace(".", "-");
	System.out.println(this.datas);
	String [] str1 = this.datas.split("-");
	System.out.println(str1[1]);
	
	Plus [] newplus = new Plus[str1.length/4];
	for(int i=0; i<4; i++) {
			Plus plus = new Plus();
			plus.setCity(str1[a]);
			plus.setGion(str1[b]);
			plus.setInfo(str1[c]);
			plus.setHum(str1[d]);
			a+=4;
			b+=4;
			c+=4;
			d+=4;
			newplus[i] = plus;
		
	}
	return newplus;
	
	
 

}

}
