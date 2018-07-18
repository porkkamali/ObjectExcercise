package com.stackroute.exercise.test;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotEquals;
//import static org.junit.Assert.assertNotNull;
//import static org.junit.Assert.assertNull;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import com.stackroute.exercise.FileUpper;

public class FileUpperTest {

	private static FileUpper fileUpper;
	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		fileUpper = new FileUpper();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		fileUpper = null;

	}
	@Test
	public void testGetRead(){
		assertEquals("testFileUpperTest(), It returns file content in uppercase","KAMALI",fileUpper.getRead("/home/porkkamali/Documents/workspace-sts-3.9.5.RELEASE/JavaExcercise/src/com/stackroute/exercise/textcontent.txt"));
	}
	@Test
	public void testGetLength(){
		assertEquals("testFileUpperTest(), It returns file length",6,fileUpper.getLength("/home/porkkamali/Documents/workspace-sts-3.9.5.RELEASE/JavaExcercise/src/com/stackroute/exercise/textcontent.txt"));
	}
	

}
