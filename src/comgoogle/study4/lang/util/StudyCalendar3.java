package comgoogle.study4.lang.util;

import java.util.Calendar;

public class StudyCalendar3 {
public static void main(String[] args) {
	Calendar calendar = Calendar.getInstance();
	calendar.set(2023, 11, 31);
	System.out.println(calendar.getTime());
	int d = calendar.get(Calendar.DATE);
	
	d=d+3;
	calendar.set(Calendar.DATE, d);
	System.out.println(d);
}
}
