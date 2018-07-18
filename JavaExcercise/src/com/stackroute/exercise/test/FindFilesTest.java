package com.stackroute.exercise.test;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import com.stackroute.exercise.FindFiles;


public class FindFilesTest {
	private static FindFiles findfiles;
	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
	   findfiles = new FindFiles();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		findfiles = null;

	}
	
		@Test
		public void testFileFilter() {
			File folder = new File("/home/porkkamali/Documents/workspace-sts-3.9.5.RELEASE/JavaExcercise/src/com/stackroute/exercise/text1/");
			assertEquals("kamali",findfiles.listFilesForFolder(folder));

		}
	}
