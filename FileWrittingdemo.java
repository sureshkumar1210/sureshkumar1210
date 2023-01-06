package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrittingdemo {

	public static void main(String[] args) {
				//file write
//		File file=new File("//home//sureshkumar//sk//demo.txt");
//		try {
//			file.createNewFile();
//			FileWriter writer=new FileWriter(file);
//			writer.write(65);
//			writer.write("hey whats going on");
//			writer.flush();
//			writer.close();
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		
		//file reading
//		
//		File file=new File("//home//sureshkumar//sk//demo.txt");
//		try {
//			FileReader Freader=new FileReader(file);
//			int output=Freader.read();
//			while(output!=-1) {
//				System.out.print((char)output);
//				output=Freader.read();
//			}
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
		
		File file=new File("//home//sureshkumar//sk//demo.txt");
		try {
			FileReader filereader=new FileReader(file);
			char[] ch=new char[(int)file.length()];
			System.out.println(ch.length);
			filereader.read(ch);
			for(char ch1:ch) {
				System.out.print(ch1);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
