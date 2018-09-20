package d.e.f;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Mncls {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	
		File ff=new File("C:\\traning\\kaveritst.txt"); //to write into text file
		String j="java is mighty powerful language";
		byte[] arr=j.getBytes();
		FileOutputStream fos=new FileOutputStream(ff);
		fos.write(arr);
		fos.close();
		
		
	}

}
