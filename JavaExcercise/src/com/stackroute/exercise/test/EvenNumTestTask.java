package com.stackroute.exercise.test;

import static org.junit.Assert.*;
import org.junit.Test;

import com.stackroute.exercise.EvenNumTest;

public class EvenNumTestTask{

	@Test
	public void testEvenNum() {
		assertEquals("testEvenNum(), It is even",true,EvenNumTest.isEven(4));
		assertEquals("testEvenNum(), It is not even",false,EvenNumTest.isEven(3));
	}

}
