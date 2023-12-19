package comgoogle.study4.lang.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class StudySimpleFormat {
public static void main(String[] args) {
	Calendar calendar = Calendar.getInstance();
	//2023년 12월 30일
	SimpleDateFormat sd = new SimpleDateFormat("yyyy년  MM월 dd일 E");
	String str = sd.format(calendar.getTime()); 
	System.out.println(str);
	
	
	String d = "2020-12-24";
	sd.applyLocalizedPattern("yyyy-NN-dd");
	Date date = sd.parse(d);
 System.out.println(calendar.getTime());
	
}
}
