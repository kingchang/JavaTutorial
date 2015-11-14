package com.waterstart.bo;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

// 客戶
public class Customer extends Object {
	
	private String name;
	
	private String tel;
	
	private Date birthDay;
	
	private Date createDate;
	
	private String createName;
	
	private Date modifiedDate;
	
	private String modifiedName;
	
	private String customerId;
	
	
	public Customer(){
		
	}
	
	
	public Customer(String customerId){
		this.customerId = customerId;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
		return result;
	}





	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (customerId == null) {
			if (other.customerId != null)
				return false;
		} else if (!customerId.equals(other.customerId))
			return false;
		return true;
	}





	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String getTel() {
		return tel;
	}





	public void setTel(String tel) {
		this.tel = tel;
	}





	public Date getBirthDay() {
		return birthDay;
	}





	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}





	public Date getCreateDate() {
		return createDate;
	}





	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}





	public String getCreateName() {
		return createName;
	}





	public void setCreateName(String createName) {
		this.createName = createName;
	}





	public Date getModifiedDate() {
		return modifiedDate;
	}





	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}





	public String getModifiedName() {
		return modifiedName;
	}





	public void setModifiedName(String modifiedName) {
		this.modifiedName = modifiedName;
	}





	public String getCustomerId() {
		return customerId;
	}





	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	
}
