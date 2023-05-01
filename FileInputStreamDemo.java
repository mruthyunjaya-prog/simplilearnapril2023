package ioprograms;
import java.io.*;
public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("file1.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		int size=bis.available();//returns the size of the file
		byte[] buffer=new byte[size];
		bis.read(buffer);
		String s=new String(buffer);//converts byte[] to String
		System.out.println(s);
		bis.close();
		fis.close();
	}

}
