package comgoogle.study7;

public class ClientMain {

	public static void main(String[] args) {
		try {
			new Client().send();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
