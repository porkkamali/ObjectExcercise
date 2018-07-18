package com.stackroute.exercise;

public class StudentGrade {
	public float average(int n,int a[]) {
		int total=0;
		for(int i=0;i<a.length;i++) {
		total = total + a[i];
	}
		float avg = (float)total/n;
		return avg;
}
	public int getMaxValue(int a[]){
		  int maxValue = a[0];
		  for(int i=0;i < a.length;i++){
		    if(a[i] > maxValue){
			  maxValue = a[i];
			}
		  }
		  return maxValue;
		}
		public int getMinValue(int a[]){
		  int minValue = a[0];
		  for(int i=1;i<a.length;i++){
		    if(a[i] < minValue){
			  minValue = a[i];
			}
		  }
		  return minValue;
		}
}
