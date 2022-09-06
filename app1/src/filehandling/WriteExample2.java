package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteExample2 {
	public static void main(String[] args) {
		File file=new File("C:/files/");
		String content="{\r\n"+
			"	\"fname\":\"abc\",\r\n"+
			"	\"lname\":\"xyz\",\r\n"+
			"	\"age\":22,\r\n"+
			"	\"address\":\"Banglore\"\r\n"+
			"}\r\n"+
			"";
				
				
				
				FileWriter fw=null;

		try
		{
			fw=new FileWriter(file+"/t.txt");
			fw.write(content);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fw.close();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("done");
		}
	}
}
