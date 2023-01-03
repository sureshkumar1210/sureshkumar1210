package String;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;

public class StringWriterDemo2 {

	public static void main(String[] args) throws IOException {
		char[] ch=new char[512];
		StringWriter write=new StringWriter();
		FileInputStream input=null;
		BufferedReader buffer=null;
		input=new FileInputStream("/home/sureshkumar/todayjava.txt");
		buffer=new BufferedReader(new InputStreamReader(input,"utf-8"));
		int x;
		while((x=buffer.read(ch))!=-1) {
			write.write(ch,0,x);	
		}
		System.out.println(write.toString());
		write.close();
		buffer.close();
	}

}
