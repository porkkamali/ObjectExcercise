package com.stackroute.exercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FindFiles{

	static String string="";

	public static String listFilesForFolder( File folder) {
		for (File fileEntry : folder.listFiles()) {
			if (fileEntry.isDirectory()) {

				listFilesForFolder(fileEntry);
			} else {
				String name = fileEntry.getName();
				if (name.endsWith(".txt")) {
					System.out.println(name);
					String fullName = "/home/porkkamali/Documents/workspace-sts-3.9.5.RELEASE/JavaExcercise/src/com/stackroute/exercise/text1/";
					fullName = fullName.concat(name);
					InputStream fileInputStream = null;
					try {
						fileInputStream = new FileInputStream(fullName);
						byte file_content[] = new byte[1024];
						int read_count = 0;
						while ((read_count = fileInputStream.read(file_content)) > 0) {
					string=string.concat((new String(file_content, 0, read_count - 1)));
					
						}

					} catch (FileNotFoundException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						try {
							if (fileInputStream != null)
								fileInputStream.close();
						} catch (Exception ex) {

						}
					}

				}
			}
		}
		return string;
	}
}
