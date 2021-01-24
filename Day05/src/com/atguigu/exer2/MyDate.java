package com.atguigu.exer2;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	
	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}


	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o instanceof MyDate) {
			MyDate myDate = (MyDate)o;
			return (this.year == myDate.year && this.month == myDate.month && this.day == this.day);
		}
		return false;
	}
	

}
