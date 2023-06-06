package com.kapil.beans;

public class StudentResult {
	
	private int marks;
	private String result;
	
	public StudentResult() {
		marks=0;
		result="";
	}

	public String getResult() {
		return result;
	}

	public void setMarks(int marks) {
		this.marks = marks;
		findResult();
	}
	
	private void findResult() {
		if(marks>35)
			result="pass";
		else
			result="fail";
	}
	
	
}
