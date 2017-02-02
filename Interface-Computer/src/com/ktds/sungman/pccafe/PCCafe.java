package com.ktds.sungman.pccafe;

import com.ktds.sungman.Computer;
import com.ktds.sungman.LGComputer;
import com.ktds.sungman.Macbook;
import com.ktds.sungman.SamsungComputer;

public class PCCafe {
	public static void main(String[] args) {
		Computer[] computers = new Computer[5];
		
		computers[0]= new SamsungComputer();
		computers[1]= new LGComputer();
		computers[2]= new SamsungComputer();
		computers[3]= new Macbook();
		computers[4]= new LGComputer();
		
		for (Computer computer : computers){
			computer.input();
			computer.computer();
			computer.store();
			if(computer instanceof Macbook){
				((Macbook) computer).faceTime();
			}
		}
		
	}
}
