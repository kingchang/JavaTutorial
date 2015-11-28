package com.waterstart.spring.rowmapper;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.core.style.ToStringStyler;

public class WorkOrder implements Serializable {
	private Long id;
	private String orderNumber;
	private WorkingType orderStatus;
	private String installationAddress;
	private String engineer;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public WorkingType getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(WorkingType orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getInstallationAddress() {
		return installationAddress;
	}
	public void setInstallationAddress(String installationAddress) {
		this.installationAddress = installationAddress;
	}
	public String getEngineer() {
		return engineer;
	}
	public void setEngineer(String engineer) {
		this.engineer = engineer;
	}
	
	
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.JSON_STYLE);
				
	}
	
}
