package com.waterstart.main;

import java.util.Calendar;
import java.util.Date;

import com.waterstart.bo.Customer;
import com.waterstart.bo.VipCustomer;
import com.waterstart.util.DateUtils;

public class Tutorial1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = Calendar.getInstance().getTime();
		Customer cust1 = new Customer();
		cust1.setCustomerId("A123");
		cust1.setBirthDay(DateUtils.getDate("2011", "3", "1"));
		cust1.setCreateName("Sky");
		
		cust1.setModifiedDate(now);
		cust1.setCreateDate(now);
		cust1.setTel("12345678");
		System.out.println(cust1);
		VipCustomer vipCustomer = new VipCustomer();
		vipCustomer.setCustomerId("A1234");
		vipCustomer.setBirthDay(DateUtils.getDate("2003", "3", "1"));
		vipCustomer.setCreateName("Jelly");
		vipCustomer.setModifiedDate(now);
		vipCustomer.setCreateDate(now);
		vipCustomer.setTel("12345678");
		vipCustomer.setStartDate(DateUtils.getDate("2010", "3", "5"));
		vipCustomer.setEndDate(DateUtils.getDate("2016", "10", "21"));
		System.out.println(vipCustomer);
		
		
		System.out.println(DateUtils.getMonth(13));
	}

}
