package comgoogle.study3.rpg;

public class Magiction {

	
	String name;
	int hp;
	int mp;
	
	public void info() {
//		String name="abc";
		//멤버메서드내에서 멤버변수를 접근해서 사용 가능
		//name="iu";
		System.out.println("Name :" + name);
		System.out.println(this);
	}
	public void t1() {
		System.out.println("Test 메서드 입니다");
	}
}
