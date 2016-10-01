package com.javalec.robot;

import com.javalec.robot.actions.FireOk;
import com.javalec.robot.actions.FlyOk;
import com.javalec.robot.actions.KnifeWithLazer;

public class SuperRobot extends Robot {

	public SuperRobot() {
		// TODO Auto-generated constructor stub
		flyAction = new FlyOk();
		fireAction = new FireOk();
		knifeAction = new KnifeWithLazer();
	}
	
	@Override
	public void shape() {
		// TODO Auto-generated method stub
		System.out.println("SuperRobot 입니다. 외형은 팔, 다리, 몸통, 머리가 있습니다.");
	}
	

}
