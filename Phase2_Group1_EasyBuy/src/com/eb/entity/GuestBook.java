package com.eb.entity;

import java.util.Date;

public class GuestBook {
	private int gid;//515
	private String guestbook_content;
	private String replay;
	private Date guestbook_date;
	private int gStatus;
	private User user;
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getGuestbook_content() {
		return guestbook_content;
	}
	public void setGuestbook_content(String guestbook_content) {
		this.guestbook_content = guestbook_content;
	}
	public String getReplay() {
		return replay;
	}
	public void setReplay(String replay) {
		this.replay = replay;
	}
	public Date getGuestbook_date() {
		return guestbook_date;
	}
	public void setGuestbook_date(Date guestbook_date) {
		this.guestbook_date = guestbook_date;
	}
	public int getgStatus() {
		return gStatus;
	}
	public void setgStatus(int gStatus) {
		this.gStatus = gStatus;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public GuestBook(int gid, String guestbook_content, String replay,
			Date guestbook_date, int gStatus, User user) {
		super();
		this.gid = gid;
		this.guestbook_content = guestbook_content;
		this.replay = replay;
		this.guestbook_date = guestbook_date;
		this.gStatus = gStatus;
		this.user = user;
	}
	public GuestBook() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
