package ioprograms;
import java.io.*;
public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw=new FileWriter("file3.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		String s="Hibernate is an ORM framework";
		bw.write(s);
		System.out.println("File Created");
		bw.close();
		fw.close();
	}

}
