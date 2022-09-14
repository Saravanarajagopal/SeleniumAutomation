package Org.FileConcept;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UsingBufferFilewriter 
{
	public static void main(String[] args) throws IOException 
	{
		String location="UsingBufferFileWriter.txt";
		String Content="Never Give-Up!!!";
		
		FileWriter filewriter =new FileWriter(location);
		BufferedWriter bufferedWriter = new BufferedWriter(filewriter); 
		bufferedWriter.write(Content);
		bufferedWriter.close();
	}

}
