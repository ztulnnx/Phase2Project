package com.eb.entity;

public class ProductBean {
	private String pName;
	private String pDscr;
	private String pPrice;
	private int stock;
	private double price;
	private String pid;
	private Product_cate prcaCate;
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpDscr() {
		return pDscr;
	}
	public void setpDscr(String pDscr) {
		this.pDscr = pDscr;
	}
	public String getpPrice() {
		return pPrice;
	}
	public void setpPrice(String pPrice) {
		this.pPrice = pPrice;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public Product_cate getPrcaCate() {
		return prcaCate;
	}
	public void setPrcaCate(Product_cate prcaCate) {
		this.prcaCate = prcaCate;
	}
	
}
