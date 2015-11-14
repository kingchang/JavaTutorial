package com.waterstart.bo;

import java.util.Date;
import java.util.Vector;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class VipCustomer extends Customer {
	
	private Date startDate;
	
	private Date endDate;
	
	
	
	
	public Date getStartDate() {
		return startDate;
	}




	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}




	public Date getEndDate() {
		return endDate;
	}




	public void setEndDate(Date endDate) {
		
		this.endDate = endDate;
	}




	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}
