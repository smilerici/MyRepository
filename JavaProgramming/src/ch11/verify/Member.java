package ch11.verify;

public class Member {
	private String id;
	private String name;
	
	public Member(String id,String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {

		return this.id+": "+this.name;
	}
}
