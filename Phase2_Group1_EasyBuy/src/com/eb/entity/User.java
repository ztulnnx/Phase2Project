package com.eb.entity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class User {
	private String uId;
	private String uName;
	private String uRealName;
	private String uPass;
	private String sex;
	private Date uBirth;
	private String userBirth;
	private String uIdCard;
	private String uEmail;
	private String uPhone;
	private int uFlag;
	
	private List<ReceiverAddress> receiverAddress;

	//获取字符串birth
	public String getUserBirth() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		if(this.uBirth != null){//为什么要判断不为空?
			String userBirth = sdf.format(uBirth);
			return userBirth;
		}
		return "";
	}
	
	//uuid获取
	public String getuId() {
		return UUID.randomUUID().toString().replace("-","");
	}

	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuRealName() {
		return uRealName;
	}
	public void setuRealName(String uRealName) {
		this.uRealName = uRealName;
	}
	public String getuPass() {
		return uPass;
	}
	public void setuPass(String uPass) {
		this.uPass = uPass;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getuBirth() {
		return uBirth;
	}
	public void setuBirth(Date uBirth) {
		this.uBirth = uBirth;
	}
	public String getuIdCard() {
		return uIdCard;
	}
	public void setuIdCard(String uIdCard) {
		this.uIdCard = uIdCard;
	}
	public String getuEmail() {
		return uEmail;
	}
	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}
	public String getuPhone() {
		return uPhone;
	}
	public void setuPhone(String uPhone) {
		this.uPhone = uPhone;
	}
	public int getuFlag() {
		return uFlag;
	}
	public void setuFlag(int uFlag) {
		this.uFlag = uFlag;
	}

	public List<ReceiverAddress> getReceiverAddress() {
		return receiverAddress;
	}

	public void setReceiverAddress(List<ReceiverAddress> receiverAddress) {
		this.receiverAddress = receiverAddress;
	}

	
	
	
	
	
}
