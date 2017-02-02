package com.ktds.sungman;

public class SamsungComputer implements Computer {

	@Override
	public void input() {
		System.out.println("키보드와 마우스로 입력을 합니다.");
		
	}

	@Override
	public void computer() {
		System.out.println("Intel 7세대 CPU i7을 사용해 계산합니다.");
		
	}

	@Override
	public void store() {
		System.out.println("ssd에 저장합니다.");
		
	}
	
}
