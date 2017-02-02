package com.ktds.sungman;

public class Macbook implements Computer{

	@Override
	public void input() {
		System.out.println("Mac키보드로 입력합니다.");
		
	}

	@Override
	public void computer() {
		System.out.println("Apple CPU로 계산합니다.");
		
	}

	@Override
	public void store() {
		System.out.println("Samsung SSD로 저장합니다.");
		
	}
	@Override
	public void faceTime(){
		System.out.println("페이스타임을 합니다.");
	}
}

