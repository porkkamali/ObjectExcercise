package com.stackroute.exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;

public class Frequency {
    public static String countEachWords(String fileName, Map<String, Integer>words) throws FileNotFoundException {
       try
       {
    	Scanner file= new Scanner(new File(fileName));
        while(file.hasNext()) {
            String word =file.next();
            Integer count = words.get(word);
            if(count!= null)
                count++;
            else
                count=1;
            words.put(word, count);
        }
        file.close();
        String string="";
        string=string+words;
        return string;
        }
         catch(FileNotFoundException e) {
             e.printStackTrace();
        }
            return null;
        
        }
}

