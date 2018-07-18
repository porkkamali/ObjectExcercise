package com.stackroute.exercise.test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.stackroute.exercise.StudentGrade;

public class StudentGradeTest {

	private static StudentGrade studentGrade;
	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		studentGrade = new StudentGrade();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		studentGrade = null;

	}
	@Test
	public void testAverage() {
		int a[]= {86,65,98,77};
		int n=4;
		float actual=studentGrade.average(n, a);
		float expected = (float)81.50;
		assertEquals("testAverage(), It returns average",expected,actual,0.001);
	}
	@Test
	public void testGetMaxValue() {
		int a[] = {86,65,98,77};
		assertEquals("testGetMaxValue(),It returns maxvalue",98,studentGrade.getMaxValue(a));
	}
	@Test
	public void testGetMinValue() {
		int a[] = {86,65,98,77};
		assertEquals("testGetMaxValue(),It returns maxvalue",65,studentGrade.getMinValue(a));
	}


}
