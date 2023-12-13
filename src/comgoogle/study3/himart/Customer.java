package comgoogle.study3.himart;

public class Customer extends Parent{

	private int money;
	private int point;
	
	public Customer() {
		this.money=2000;
		this.point=10;
		
	}
	public void buy(int m) {
		//물건값 계산
	money =	this.money-m;
	this.point = m/50;
	
		//최종 가진돈과 포인트를 출력
	System.out.println("Money :"+this.money);
	System.out.println("Point :"+this.money);

	}
	
	
}
