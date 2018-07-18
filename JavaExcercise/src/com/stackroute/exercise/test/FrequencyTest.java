package com.stackroute.exercise.test;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.stackroute.exercise.Frequency;

public class FrequencyTest {

	@Test
	   public void testFrequency() throws FileNotFoundException {
	       
	       Map<String, Integer> words = new HashMap<String, Integer>();
	       String path ="/home/porkkamali/Documents/workspace-sts-3.9.5.RELEASE/JavaExcercise/src/com/stackroute/exercise/text2.txt/";
	       String expected="{sleep=1, a=2, home.=1, like=1, have=1, i=3, man=1, to=1, am=1, ,=2}";
	       assertEquals(expected,Frequency.countEachWords(path,words));
	}
}