package ch11.exam06_finallize;

public class Counter {
	private int no;
	
	public Counter(int no) {
		this.no = no;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(no + "번 객체의 finalliz()가 실행됨");
	}
	
}
