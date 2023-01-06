package FileHandling;

import java.io.File;
import java.io.IOException;

public class Filehandlingdemo {

	public static void main(String[] args) throws IOException {
		//folder created
//		File file=new File("//home//sureshkumar//FileHandling//sk//ap//surthi");
//		boolean present=file.exists();			//folder chacking method
//		System.out.println("Folder present:"+present);
//		if(present==false) {
//			file.mkdirs();		//folder creating method
//		}
//		System.out.println("Folder present:"+present);
					//file craeted
		
//		File file=new File("//home//sureshkumar//FileHandling//sk//test.txt");
//		boolean present=file.exists();
//		System.out.println("file is present:"+present);
//		if(present==false) {
//			try {
//				boolean create=file.createNewFile();
//				System.out.println("file is present:"+create);
//			}
//			catch(Exception e) {
//				e.printStackTrace();
//			}
//		}

					//file delete
//		File file=new File("//home//sureshkumar//FileHandling//sk//test.txt");
//		file.delete();
//		boolean present=file.exists();
//		System.out.println("file is pesent:"+present);
		
					//file nename
//		
//		File file=new File("//home//sureshkumar//FileHandling//sk//test.txt");
//		file.createNewFile();
//		File newfile=new File("//home//sureshkumar//FileHandling//sk//sk.txt");
//		boolean renamesuccess=file.renameTo(newfile);
//		System.out.println("renamesuccess:"+renamesuccess);
//		System.out.println("FileName:"+file.getName());		//filename
//		System.out.println(file.canExecute());
//		System.out.println(file.canRead());			//file properties
//		System.out.println(file.canWrite());
		
//		File file1=new File("/home/sureshkumar");		
//		String[] ListofFileFolders=file1.list();			//listofFileFolders
////		for(int i=0;i<ListofFileFolders.length;i++) {
////			System.out.println(ListofFileFolders[i]);
////		}
//		for(String s:ListofFileFolders) {
//			System.out.println(s);
//		}
//		      //file folder list
//		File file=new File("/home/sureshkumar");
//		File[] FileFolderList=file.listFiles();
//		for(File f:FileFolderList) {
			//System.out.println(f);	//file and folder
//			if(f.isFile()) {			// only files
//				System.out.println(f);
//			}
			
//			if(f.isDirectory()) {
//				System.out.println(f);
//			}
			
			//  find .txt files
//			File file=new File("/home/sureshkumar");
//			File[] fileFolderArray=file.listFiles();
//			for(File f:fileFolderArray) {
//				if(f.isFile()) {
//				String filename=f.getName();
//				int lastDot=filename.lastIndexOf(".");
//				String extension=filename.substring(lastDot+1);
//				//System.out.println(extension);	
//				if(extension.equals("txt"));
//				System.out.println(filename);
//			}
//			}
		
		//find size>5mb
//		File file=new File("/home/sureshkumar");
//		File[] fileFolderrArray=file.listFiles();
//		for(File f:fileFolderrArray) {
//			if(f.isFile()) {
//				String filename=f.getName();
//				int LastDot=filename.lastIndexOf(".");
//				String extension=filename.substring(LastDot+1);
//				if(f.length()>50000) {
//					System.out.println(filename+"-size:"+f.length());
//					
//				}
//			}
//		}
		
	}
		
	}

