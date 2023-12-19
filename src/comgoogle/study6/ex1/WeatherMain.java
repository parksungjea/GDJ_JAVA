package comgoogle.study6.ex1;

public class WeatherMain {
public static void main(String[] args) {
	WeatherDAO wr = new WeatherDAO();
	try {
		wr.getWeathers();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
