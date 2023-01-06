package FileHandling;

import java.io.File;

public class ListFilefolder {

	public static void main(String[] args) {
		File file=new File("/home/sureshkumar");
		String[] ListofFileFolders=file.list();
		for(int i=0;i<ListofFileFolders.length;i++) {
			System.out.println(ListofFileFolders[i]);
		}
	}

}
