package Org.FileConcept;

import java.io.FileWriter;
import java.io.IOException;

public class UsingFilewriter 
{
	public static void main(String[] args) throws IOException 
	{
		// 1.File Location 2.content
		String location="UsingFileWriter.txt";
		String Content="Learning Java&Selenium";
		
		FileWriter filewriter = new FileWriter(location);
		filewriter.write(Content);
		filewriter.close();

	}

}
