package com.example;

public class Classroom {
	
	private String name;
	private Integer floor;
	private String homeRoomTeacherName;

	@Override
	public String toString() {
		return "Classroom [name=" + name + ", floor=" + floor + ", homeRoomTeacherName=" + homeRoomTeacherName + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Classroom() {
	}

	public Classroom(String name, String homeRoomTeacherName) {
		super();
		this.name = name;
		this.homeRoomTeacherName = homeRoomTeacherName;
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
