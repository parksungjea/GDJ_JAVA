package comgoogle.study3.himart;

public class Tv extends Parent{

	private	String color;

	
	
	Tv(){
		this.color="black";
		this.setSize("100");
		this.setBrand("samsung");
		this.setNum(240);
		this.setPoint(10000);
	}
	
	public String getCololr() {
		return color;
	}

	public void setCololr(String cololr) {
		this.color = color;
	}
	
}
