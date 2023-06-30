package Model;

import java.sql.Date;

public class board {
	private int number;
	private String bname;
	private String title;
	private String content;
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	private String date;
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public board() {
	}

}
