package comgoogle.study6.lol;

public class LolDTO {

	private String name;
	private String q;
	private String w;
	private String e;
	private String r;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQ() {
		return q;
	}
	public void setQ(String q) {
		this.q = q;
	}
	public String getW() {
		return w;
	}
	public void setW(String w) {
		this.w = w;
	}
	public String getE() {
		return e;
	}
	public void setE(String e) {
		this.e = e;
	}
	public String getR() {
		return r;
	}
	public void setR(String r) {
		this.r = r;
	}
	@Override
	public String toString() {
		return "LolDTO [name=" + name + ", q=" + q + ", w=" + w + ", e=" + e + ", r=" + r + "]";
	}
	
	
}
