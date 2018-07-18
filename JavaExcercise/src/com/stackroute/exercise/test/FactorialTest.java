package com.stackroute.exercise.test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import com.stackroute.exercise.Factorial;

public class FactorialTest {
	private static Factorial factorial;
	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		factorial = new Factorial();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		factorial = null;

	}
		@Test
		public void testIntFact() {
		 int a=479001600 ;
		 assertEquals(a,factorial.integerFactorials(1,1));
		}
		@Test
		public void testLongFact() {
		 long x=1L;
		 long y=1L;
		 long z=2432902008176640000L;
		 assertEquals(z,factorial.longFactorials(x,y));
		}
	}
