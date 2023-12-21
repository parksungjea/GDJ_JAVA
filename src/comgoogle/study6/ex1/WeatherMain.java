package comgoogle.study6.ex1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class WeatherMain {

	public static void main(String[] args) {
//		try {
//			new WeatherController().start();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		WeatherDAO weatherDAO = new WeatherDAO();
		try {
			weatherDAO.save();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}