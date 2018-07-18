package com.stackroute.exercise.test;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.stackroute.exercise.MemberVariable;

public class MemberTest {
	private static MemberVariable memberVariable;
	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
	   memberVariable = new MemberVariable();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		memberVariable = null;

	}

	@SuppressWarnings("static-access")
	@Test
	public void testMemberVariable() {
		assertArrayEquals(new String[] {"Members Name: Harry Potter","Members Age: 30","Members Salary: 2500.3"},memberVariable.display(new String[]{"Members Name: ","Members Age: ","Members Salary: "}));
	}
}
