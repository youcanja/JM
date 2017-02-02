package com.ktds.sungman;

public class Main {
	public static void main(String[] args) {
		Computer samsungComputer = new SamsungComputer();
		samsungComputer.input();
		samsungComputer.computer();
		samsungComputer.store();

		Computer lgComputer = new LGComputer();
		lgComputer.input();
		lgComputer.computer();
		lgComputer.store();
		
		Computer macbook = new Macbook();
		macbook.input();
		macbook.computer();
		macbook.store();
		macbook.faceTime();
	}
}
