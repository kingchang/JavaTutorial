package com.waterstart.main;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.waterstart.bo.Customer;
import com.waterstart.util.DateUtils;

public class Tutorial2 {
	
	private final static Logger logger = LoggerFactory.getLogger(Tutorial2.class);
	
	public static void main(String[] args) {
//		Map<String,Customer> customerHashMap = new HashMap<String,Customer>();
//		List<Customer> customerArrayList = new ArrayList<Customer>();
//		Set<Customer> customerHashSet = new HashSet<Customer>();
		// int <=> Integer
		// long <=> Long
		// char <=> Integer
		// boolean <=> Boolean
		Map<String,Customer> customerMap = Maps.newConcurrentMap();
		List<Customer> customerList = Lists.newCopyOnWriteArrayList();
		Set<Customer> customerSet = Sets.newConcurrentHashSet(); 
		Date now = Calendar.getInstance().getTime();
		Customer cust1 = new Customer();
		cust1.setCustomerId("A123");
		cust1.setBirthDay(DateUtils.getDate("2011", "3", "1"));
		cust1.setCreateName("Sky");
		
		cust1.setModifiedDate(now);
		cust1.setCreateDate(now);
		cust1.setTel("12345678");
		cust1.setName("Jelly");
		
		Customer cust2= new Customer();
		cust2.setCustomerId("A1234");
		cust2.setBirthDay(DateUtils.getDate("2011", "3", "1"));
		cust2.setCreateName("Sky");
		
		cust2.setModifiedDate(now);
		cust2.setCreateDate(now);
		cust2.setTel("12345678");
		cust2.setName("Jessica");
		customerMap.put("A123", cust1);
		customerMap.put("A1234",cust2);
		logger.debug("customerMap:{},a:{},b:{}",new Object[]{customerMap,"1",123});
		logger.trace("customerMap:{}",customerMap);
		logger.info("customerMap:{}",customerMap);
		logger.warn("customerMap:{}",customerMap);
		logger.error("cusomterMap:{}",customerMap);
		
		customerList.add(cust1);
		customerList.add(cust2);
		logger.info("customerList:{}"+customerList);
		
		customerSet.add(cust1);
		customerSet.add(cust1);
		logger.info("customerSet:{}"+customerSet);
		
		List<String> customerNames = Lists.transform(customerList, new Function<Customer, String>() {
			@Override
			public String apply(Customer arg0) {
				// TODO Auto-generated method stub
				return arg0.getName();
			}
		});
		
		logger.info("customer:{}",customerNames);
	}

}
