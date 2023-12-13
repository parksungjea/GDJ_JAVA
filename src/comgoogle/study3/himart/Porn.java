package comgoogle.study3.himart;

public class Porn extends Parent{

	private	String model;
	private int pixel;

	
	Porn(){
		this.model="apple";
		this.setSize("100");
		this.setBrand("apple");
		this.setNum(150);
		this.setPoint(5000);
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPixel() {
		return pixel;
	}

	public void setPixel(int pixel) {
		this.pixel = pixel;
	}
}
