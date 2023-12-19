package comgoogle.study4.lang.util;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class StudyCalendar {
public static void main(String[] args) {
	//Calendar calendar = new GregorianCalendar();
	Calendar calendar = Calendar.getInstance();
	int year = calendar.get(Calendar.YEAR);
	int month = calendar.get(Calendar.MONDAY);
	System.out.println(year);
	System.out.println(month+1);
	calendar.set(Calendar.YEAR, 2200);
	calendar.set(Calendar.MONDAY, 0);
	System.out.println(calendar.getTime());
}
}
