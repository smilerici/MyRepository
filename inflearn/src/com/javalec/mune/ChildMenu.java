package com.javalec.mune;

public class ChildMenu extends ParentMenu {
	
	public ChildMenu() {
		// TODO Auto-generated constructor stub
	}
	
	private void makeBeefChungGukJang() {
		// TODO Auto-generated method stub
		System.out.println("쇠고기 청국장");
	}
	
	public void makeHotDoenJangGuk() {
		// TODO Auto-generated method stub
		System.out.println("얼큰 된장국");
	}
	
	public void makeKongNaMool() {
		// TODO Auto-generated method stub
		System.out.println("콩나물국");
	}
	
	@Override
	public void makeChungGukJang() {
		// TODO Auto-generated method stub
		System.out.println("냄새 없는 청국장");
	}
	
}
