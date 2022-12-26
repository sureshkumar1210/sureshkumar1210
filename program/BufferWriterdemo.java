package arrys.program;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterdemo {

	public static void main(String[] args) throws IOException {
		File f=new File("/home/sureshkumar");
		FileWriter fw =new FileWriter(f,true);
		BufferedWriter bw =new BufferedWriter(fw);
		bw.newLine();
		bw.write("line 5");
	}

}
