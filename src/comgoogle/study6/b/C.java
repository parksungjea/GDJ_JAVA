package comgoogle.study6.b;

public class C {

	
	public  int c(String [] a) {
		int [] d= new int[a.length];
		 int  c=0;
		for(int i=0; i<a.length;i++) {
		
			d[i] = Integer.parseInt(a[i]);
			c = c+d[i];
		}
		return c;
	}
	
}
