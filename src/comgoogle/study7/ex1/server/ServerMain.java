package comgoogle.study7.ex1.server;

public class ServerMain {
public static void main(String[] args) {
	ServerController svc = new ServerController();
	try {
		svc.start();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
//	ServerDAO sd = new ServerDAO();
//	try {
//		sd.getWeathers();
//	} catch (Exception e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
}
}
