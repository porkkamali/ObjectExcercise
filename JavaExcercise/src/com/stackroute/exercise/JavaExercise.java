package com.stackroute.exercise;

public class JavaExercise {
	//palindrome exercise1
	public boolean palindrome(int n) {
		int r,sum=0,temp;    
		  temp= n;    
		  while(n>0){    
		   r=n%10;   
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum) {
			  return true;
		  }
		  else {
			  return false;
		  }
}
	//PowerofFour exercise2
	public int PowerOfFour(int n)
    {
        if(n == 0)
        return 0;
        while(n != 1)
        { 
            if(n % 4 != 0)
            return 0;
            n = n / 4;     
        }
        return 1;
    } 
	
	}