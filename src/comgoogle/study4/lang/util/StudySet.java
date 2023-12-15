package comgoogle.study4.lang.util;

import java.util.HashSet;

public class StudySet {
public static void main(String[] args) {
	HashSet<String> hs = new HashSet<>();
	hs.add("test");
	hs.add("second");
	hs.add("third");
	hs.add("test");
	System.out.println(hs.size());
	System.out.println(hs);
	
}
}
