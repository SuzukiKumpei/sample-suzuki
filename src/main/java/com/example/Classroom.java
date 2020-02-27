package com.example;

public class Classroom {
	
	private String name;
	private Integer floor;
	private String grade;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}


	@Override
	public String toString() {
		return "Classroom [name=" + name + "]";
	}
	
	

}
