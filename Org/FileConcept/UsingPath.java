package Org.FileConcept;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UsingPath 
{
	public static void main(String[] args) throws IOException 
	{
		String location="UsingFilePath.txt";
		String Content="Test the hole application!!!";
		
		Path path = Paths.get(location);
		Files.write(path, Content.getBytes());
	}
}
