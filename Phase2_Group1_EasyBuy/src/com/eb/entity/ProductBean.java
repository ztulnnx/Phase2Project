package com.eb.entity;

public class ProductBean {
	private String pName;//商品名称
	private String pDscr;//商品描述
	private String img;//商品图片
	private int stock;//商品库存
	private double price;//商品价格
	private String pid;//商品ID
	private Product_cate prcaCate;//关联的商品分类对象
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
	
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
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
