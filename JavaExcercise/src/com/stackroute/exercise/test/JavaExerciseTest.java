package com.stackroute.exercise.test;
import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotEquals;
//import static org.junit.Assert.assertNotNull;
//import static org.junit.Assert.assertNull;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.stackroute.exercise.JavaExercise;

public class JavaExerciseTest {
	private static JavaExercise javaExercise;
	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		javaExercise = new JavaExercise();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		javaExercise = null;

	}

	@Test
	public void testPalindrome() {
		assertEquals("testpalindrome(), It is palindrome",true,javaExercise.palindrome(454));
		assertEquals("testPalindrome(), It is not palindrome",false,javaExercise.palindrome(453));
	}
	
	@Test
	public void testPowerFour() {
		assertEquals("testPowerFour(), It returns power of 4",1,javaExercise.PowerOfFour(64));
		assertEquals("testPowerFour(), It does not return power of 4",0,javaExercise.PowerOfFour(20));		
	}
	
	}

