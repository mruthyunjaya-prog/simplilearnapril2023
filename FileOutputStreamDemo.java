package ioprograms;
import java.io.*;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileOutputStream fos=new FileOutputStream("file2.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		String s="Java is OO Programming Language";
		bos.write(s.getBytes());//Converts String into byte[]
		System.out.println("File Created");
		bos.close();
		fos.close();
	}
}
