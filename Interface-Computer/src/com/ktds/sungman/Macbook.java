package com.ktds.sungman;

public class Macbook implements Computer{

	@Override
	public void input() {
		System.out.println("MacŰ����� �Է��մϴ�.");
		
	}

	@Override
	public void computer() {
		System.out.println("Apple CPU�� ����մϴ�.");
		
	}

	@Override
	public void store() {
		System.out.println("Samsung SSD�� �����մϴ�.");
		
	}
	@Override
	public void faceTime(){
		System.out.println("���̽�Ÿ���� �մϴ�.");
	}
}

