package com.eb.entity;

import java.util.Date;
import java.util.List;

public class Orders {
	private int oid;
	private double money;	//�����ܼƽ��
	private Date ordertime;	//����ʱ��
	private int oStatus;	//����״̬:0.����� 1.���ͨ�� 2.��� 3.���� 4.�ջ�ȷ��
	private User user;	//�������û���Ϣ
	private String showDate;	//����
	private List<OrderItem> orderItem;
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public Date getOrdertime() {
		return ordertime;
	}
	public void setOrdertime(Date ordertime) {
		this.ordertime = ordertime;
	}
	public int getoStatus() {
		return oStatus;
	}
	public void setoStatus(int oStatus) {
		this.oStatus = oStatus;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getShowDate() {
		return showDate;
	}
	public void setShowDate(String showDate) {
		this.showDate = showDate;
	}
	public List<OrderItem> getOrderItem() {
		return orderItem;
	}
	public void setOrderItem(List<OrderItem> orderItem) {
		this.orderItem = orderItem;
	}
	
}
