package com.seulgae.ch07;

class Time {
	private int hour; // 0~23 사이의 값을 가져야함.
	private int minute;
	private int second;
	
	public void setHour(int hour) {
		if(isNotValidHour(hour)) return ;
		
		this.hour = hour; // private int hour 인스턴스 변수를 가르킨다.
	}

	// 매개변수로 넘겨진 hour가 유효한지 확인해서 알려주는 메서드
	private boolean isNotValidHour(int hour) {
		return hour < 0 || hour > 23;
	}
	
	public int getHour() {return hour;}
}

public class TimeTest{
	public static void main(String[] args) {
		Time t = new Time();
//		t.hour = -100;
		t.setHour(21); // hour 값을 21로 변경
		System.out.println(t.getHour());
		t.setHour(100);
		System.out.println(t.getHour());
	}
}