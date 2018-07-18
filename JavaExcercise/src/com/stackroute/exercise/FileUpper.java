package com.stackroute.exercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileUpper {
	public String getRead(String fileName){
		try{
		File file = new File(fileName);
		FileReader fileContent = new FileReader(file);
		BufferedReader reader = new BufferedReader(fileContent);
	    String textcontent= "";
	    String line = reader.readLine();
	    while ( line != null)
	    {
	    	textcontent += line;
	    	line = reader.readLine();
	    }
	    return(textcontent.toUpperCase());
	    }
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public int getLength(String fileName) {
		try {
		File file = new File(fileName);
		FileReader fileContent = new FileReader(file);
		BufferedReader reader = new BufferedReader(fileContent);
	    String textcontent= "";
	    String line = reader.readLine();
	    while ( line != null)
	    {
	    	textcontent += line;
	    	line = reader.readLine();
	    }
	    return(textcontent.length());
	    }
	   catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
}

