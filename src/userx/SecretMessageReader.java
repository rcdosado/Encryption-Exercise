package userx;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class SecretMessageReader {


	public SecretMessageReader()
	{

	}	
    /* Reads a line in the file given the line number and filename 
	 * 
	 */
	public static String ReadLine(String filename,int lineNum) throws IOException{
		String line;
		int currentLine = 0;
		BufferedReader br = null;
		try {
		    InputStream fis = new FileInputStream(filename.toLowerCase());
		    InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
		    br = new BufferedReader(isr);
		}
		catch(FileNotFoundException e)
		{	
			System.out.println("Cannot find file " + e.getMessage());
		}
		
		while ((line = br.readLine()) != null){
			if(lineNum == currentLine )
			  return line;
		}
		return line;
		
	}
	
	public static void main(String[] args) {
		System.out.println("My main method has been run");

	}

}
