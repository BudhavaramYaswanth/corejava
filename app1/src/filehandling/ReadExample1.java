package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadExample1 {

	public static void main(String[] args) throws IOException {
		File file=new File("C:/files");
		FileReader fr=new FileReader(file+"/t.txt");
		BufferedReader br=new BufferedReader (fr);
		String content = br.readLine();
		System.out.println(content);
	}
}