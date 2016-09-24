package ch15.sec06.exam02_queue;

import java.util.*;

public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message> ();
		
		messageQueue.offer(new Message("sendMail","홍길동"));
		messageQueue.offer(new Message("sendSMS","한용희"));
		messageQueue.offer(new Message("sendKakotalk","하뇽이"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch(message.command) {
			case "sendMail":
				System.out.println(message.to+"님에게 메일을 보냅니다.");
				break;
			case "sendSMS" :
				System.out.println(message.to+"님에게 SMS를 보냅니다.");
				break;
			case "sendKakotalk" :
				System.out.println(message.to+"님에게 카카오톡을 보냅니다.");
				break;
			}
		}
	}
}
