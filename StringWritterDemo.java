package String;

import java.io.StringWriter;

public class StringWritterDemo {
	void write(String ap, int off,int len) {
		
	}

	public static void main(String[] args) {
		String sk="this is our String Writter class";
		try {
			StringWriter ap=new StringWriter();
			ap.write(sk);
			System.out.println(ap);
			ap.write(":after write");
			System.out.println(ap);
			ap.close();
			System.out.println(ap);
		}
		catch(Exception e) {
			e.getStackTrace();
			
		}

	}

}
