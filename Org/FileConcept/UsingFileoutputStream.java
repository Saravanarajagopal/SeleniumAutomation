package Org.FileConcept;


import java.io.FileOutputStream;
import java.io.IOException;

public class UsingFileoutputStream 
{
	public static void main(String[] args) throws IOException 
	{
		String location="UsingFileoutputWriter.txt";
		String Content="Test the hole application!!!";
		
		FileOutputStream fileOutputStream = new FileOutputStream(location);
		byte[] writeThis = Content.getBytes();
		fileOutputStream.write(writeThis);
		fileOutputStream.close();
	}

}
