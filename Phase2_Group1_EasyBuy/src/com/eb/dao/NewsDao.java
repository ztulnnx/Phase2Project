package com.eb.dao;



public class NewsDao {
	private int nid;
	private String uid;
	private String nTitle;
	
	private String nContent;

	public int getNid() {
		return nid;
	}

	public void setNid(int nid) {
		this.nid = nid;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getnTitle() {
		return nTitle;
	}

	public void setnTitle(String nTitle) {
		this.nTitle = nTitle;
	}

	public String getnContent() {
		return nContent;
	}

	public void setnContent(String nContent) {
		this.nContent = nContent;
	}

	public NewsDao(int nid, String uid, String nTitle, String nContent) {
		super();
		this.nid = nid;
		this.uid = uid;
		this.nTitle = nTitle;
		this.nContent = nContent;
	}

	public NewsDao(String uid, String nTitle, String nContent) {
		super();
		// TODO Auto-generated constructor stub
		this.uid = uid;
		this.nTitle = nTitle;
		this.nContent = nContent;
	}
	
	
	
}	
