package ch15.verify;

import java.util.*;

public class Board<T>{
	private String title;
	private String content;
	
	public Board(String title,String content) {
		this.title = title;
		this.content = content;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getContent() {
		return content;
	}
	
}
