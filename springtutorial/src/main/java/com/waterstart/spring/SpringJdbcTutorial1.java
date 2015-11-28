package com.waterstart.spring;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.waterstart.dao.WorkOrderDAO;
import com.waterstart.spring.rowmapper.WorkOrder;
import com.waterstart.spring.rowmapper.WorkOrderRowMapper;

public class SpringJdbcTutorial1 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext =  new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		WorkOrderDAO workOrderDAO = applicationContext.getBean(WorkOrderDAO.class);
		String whereClause = " where orderNumber = :orderNumber";
		Map<String,Object> paramMap = new HashMap<>();
		paramMap.put("orderNumber", "20151121000003");
		System.out.println("workOrderList:"+workOrderDAO.findWhereClause(whereClause,paramMap));
	}

}
