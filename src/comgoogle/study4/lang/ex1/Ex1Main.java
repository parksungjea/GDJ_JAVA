package comgoogle.study4.lang.ex1;

public class Ex1Main {
public static void main(String[] args) {
	WeatherService weatherService = new WeatherService();
		weatherService.init();
	Plus plus = new Plus();
	System.out.println(plus.getCity());
	}
}
