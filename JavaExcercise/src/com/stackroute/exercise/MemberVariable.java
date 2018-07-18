package com.stackroute.exercise;
import com.stackroute.exercise.Member;
public class MemberVariable{  
	public static String[] display(String[] strArr) {
		Member obj = new Member();
		obj.Name = "Harry Potter";
		obj.Age = 30;
		obj.Salary =(float) 2500.3; 
		String string =strArr[0].concat(obj.Name).concat(",").concat(strArr[1]).concat(Integer.toString(obj.Age)).concat(",").concat(strArr[2]).concat(Float.toString(obj.Salary));
        return string.split(",");

}
}
