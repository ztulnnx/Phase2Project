package com.eb.entity;


//新闻
public class News {
	private int nid;  //新闻ID
	private String uid;  //发布新闻管理员ID
	private String nTitle; //新闻标题
	
	private String nContent; //新闻内容

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

	public News(int nid, String uid, String nTitle, String nContent) {
		super();
		this.nid = nid;
		this.uid = uid;
		this.nTitle = nTitle;
		this.nContent = nContent;
	}

	public News(String uid, String nTitle, String nContent) {
		super();
		// TODO Auto-generated constructor stub
		this.uid = uid;
		this.nTitle = nTitle;
		this.nContent = nContent;
	}
	
	
	
}	
