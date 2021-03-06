package com.eb.entity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Orders {
	private int oid;	//订单id
	private double money;	//订单总计金额
	private Date ordertime;	//订单时间
	private int oStatus;	//订单状态:0.待审核 1.审核通过 2.配货 3.返货 4.收货确认
	private User user;	//订单的用户信息
	private String showDate;	//订单展示在页面的时间
	private List<OrderItem> orderItem; //订单的详情
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
		if(ordertime != null){
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			return df.format(ordertime);
		}
		
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
