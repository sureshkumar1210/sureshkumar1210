package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWritedemo {

	public static void main(String[] args) {
		//line by line writting 
//try {
//	File file=new File("//home//sureshkumar//sk//demo.txt");
//	FileWriter fwriter=new FileWriter(file);
//	BufferedWriter bwriter=new BufferedWriter(fwriter);
//	bwriter.write("i am in chennai");
//	bwriter.newLine();
//	bwriter.write("channai is very busy city and many city peoples lived here");
//	bwriter.newLine();
//	bwriter.write("tamil my native tounge");
//	bwriter.newLine();
//	bwriter.write("english my second language");
//	bwriter.flush();
//	bwriter.close();
//}catch(Exception e) {
//	e.printStackTrace();
//	
//}

					//Bufferedreader and line count
//		try {
//			File file=new File("//home//sureshkumar//sk//demo.txt");
//			FileReader freader=new FileReader(file);
//			BufferedReader breader=new BufferedReader(freader);
//			String line=breader.readLine();
//			int linecount=0;
//			while(line!=null) {
//				linecount++;
//				System.out.println(line);
//				line=breader.readLine();
//			}
//			System.out.println(linecount);
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		
		//no of words,sentence,character,words count
		try {
		File file=new File("//home//sureshkumar//sk//demo.txt");
		FileReader freader=new FileReader(file);
		BufferedReader breader=new BufferedReader(freader);
		String line=breader.readLine();
		int linecount=0;
		int sentencecount=0;
		int wordcount=0;
		int charcount=0;
		while(line!=null) {
			String[] sentence=line.split("[.]");
			String[] words=line.split(" ");
			wordcount+=words.length;
			sentencecount+=sentence.length;
			linecount++;
			charcount+=line.length();
			line=breader.readLine();
		}
		System.out.println("no of sentence:"+sentencecount);
		System.out.println("no of Word:"+wordcount);
		System.out.println("no of lines:"+linecount);
		System.out.println("no of charactor:"+charcount);
		}catch(Exception e) {
			e.printStackTrace();
		}		
}
	}
