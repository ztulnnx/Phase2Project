package com.eb.entity;

public class Products_Category {
	//Ʒ��ID
   private String cid;
   //Ʒ������
   private String categoryName;
   //����Ʒ��ID
   private String parent_category_id;
public String getCid() {
	return cid;
}
public void setCid(String cid) {
	this.cid = cid;
}
public String getCategoryName() {
	return categoryName;
}
public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
}
public String getParent_category_id() {
	return parent_category_id;
}
public void setParent_category_id(String parent_category_id) {
	this.parent_category_id = parent_category_id;
}
@Override
public String toString() {
	return "Products_Category [cid=" + cid + ", categoryName=" + categoryName + ", parent_category_id="
			+ parent_category_id + "]";
}
   
}
