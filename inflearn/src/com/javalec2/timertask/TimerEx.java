package com.javalec2.timertask;

import java.util.*;

public class TimerEx {

	public TimerEx() throws InterruptedException{
		
		System.out.println("^^");
		Timer timer = new Timer(true);
		TimerTask t1 = new ExTimerTask1();
		TimerTask t2 = new ExTimerTask2();
		
		timer.schedule(t1,2000);
		timer.schedule(t2,10000);
		
		Thread.sleep(11000);
		System.out.println("**");
	}
}
