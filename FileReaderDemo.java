package ioprograms;
import java.io.*;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("C:/Users/Mendu's/Simplilearn/APRIL2023/Day11/Day11Proj01/src/ioprograms/FileInputStreamDemo.java");
		int n;
		while((n=fr.read())!=-1)//-1 indicates EOF
		{
			System.out.print((char)n);
		}
			fr.close();
			char c='p';
			System.out.println((int)c);//UNICODE of char 'p'
	
	}

}
