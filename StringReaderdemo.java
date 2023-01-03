package String;

import java.io.IOException;
import java.io.StringReader;

public class StringReaderdemo {

	public static void main(String[] args) throws IOException {
//		try {
//			String str="sureshkumar";
//			StringReader sk=new StringReader(str);
//			int ch;
//			for(int i=0;i<=10;i++) {
//				ch=sk.read();
//				System.out.println("interger value of charctor read"+ch);
//				System.out.println("actual charactor read:"+(char)ch);
//			}
//			sk.close();
//		}
//		catch(Exception e){
//			System.out.println(e);
//			
//		}

		String srg="haii sureshkumar!!\nWelcome to our village.";
		StringReader sk=new StringReader(srg);
		int s=0;
		while((s=sk.read())!=-1) {
			System.out.println((char)s);
		}
	}

}
