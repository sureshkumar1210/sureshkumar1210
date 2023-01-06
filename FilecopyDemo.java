package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FilecopyDemo {

	public static void main(String[] args) {
		try {
			InputStream input=new FileInputStream("//home//sureshkumar//htmlCssJs//Resume//IMG20221121200811.jpg");
			OutputStream output=new FileOutputStream("//home//sureshkumar//sk//sk.jpg");
			int content=input.read();
			while(content!=-1) {
				output.write(content);
				content=input.read();
			}
			output.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
