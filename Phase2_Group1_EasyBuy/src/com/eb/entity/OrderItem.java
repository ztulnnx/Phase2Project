package com.eb.entity;

public class OrderItem {
	private int itemId; //���������id
	private int oid;	//��Ӧ�Ķ���id
	private int buyCount;	//ÿ��item����Ʒ��������
	private double subTotal;	//ÿ��item����ƷС��
	private ProductBean productBean;	//ÿ��item�������Ʒ��Ϣ����
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public int getBuyCount() {
		return buyCount;
	}
	public void setBuyCount(int buyCount) {
		this.buyCount = buyCount;
	}
	public double getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}
	public ProductBean getProductBean() {
		return productBean;
	}
	public void setProductBean(ProductBean productBean) {
		this.productBean = productBean;
	}
	
	
}
