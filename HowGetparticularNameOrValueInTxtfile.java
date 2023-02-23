package map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class HowGetparticularNameOrValueInTxtfile {

	public static void main(String[] args) throws IOException {
			Properties p=new Properties();
			FileInputStream fis=new FileInputStream("//home//sureshkumar//eclipse-workspace//Map//src//map//properties.txt");
			p.load(fis);
			String s=p.getProperty("dhosai");
			System.out.println(s);
			p.setProperty("dhosai", "30");
			FileOutputStream fos=new FileOutputStream("//home//sureshkumar//eclipse-workspace//Map//src//map//properties.txt");
			p.store(fos, "upadate price");
	}

}
