package com.example;

public class Classroom {
	
	private String name;
	private Integer floor;
	private String homeRoomTeacherName;
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
		return "Classroom [name=" + name + ", floor=" + floor + ", homeRoomTeacherName=" + homeRoomTeacherName
				+ ", grade=" + grade + "]";
	}

	
	public Classroom(String name, Integer floor, String homeRoomTeacherName, String grade) {
		super();
		this.name = name;
		this.floor = floor;
		this.homeRoomTeacherName = homeRoomTeacherName;
		this.grade = grade;
	}

	public Classroom() {
	}

	public String getHomeRoomTeacherName() {
		return homeRoomTeacherName;
	}

	public void setHomeRoomTeacherName(String homeRoomTeacherName) {
		this.homeRoomTeacherName = homeRoomTeacherName;
	}

	public Integer getFloor() {
		return floor;
	}

	public void setFloor(Integer floor) {
		this.floor = floor;
	}
	
	

}
