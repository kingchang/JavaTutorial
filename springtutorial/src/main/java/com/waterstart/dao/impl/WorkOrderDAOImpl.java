package com.waterstart.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.util.StringUtils;

import com.waterstart.dao.WorkOrderDAO;
import com.waterstart.spring.rowmapper.WorkOrder;
import com.waterstart.spring.rowmapper.WorkOrderRowMapper;
import com.waterstart.spring.rowmapper.WorkingType;

public class WorkOrderDAOImpl implements WorkOrderDAO {
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}
	
	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
		return namedParameterJdbcTemplate;
	}
	
	@Override
	public WorkOrder insert(WorkOrder workOrder) {
		Map<String,Object> paramerMap = new HashMap<>();
		Long id = namedParameterJdbcTemplate.queryForObject("select nextval('workorder_id_seq')",paramerMap,Long.class);
		paramerMap.put("id", id);
		paramerMap.put("orderNumber",workOrder.getOrderNumber());
		paramerMap.put("orderStatus", WorkingType.Pending);
		paramerMap.put("installationAddress", workOrder.getInstallationAddress());
		paramerMap.put("engineer", workOrder.getEngineer());
		namedParameterJdbcTemplate.update("insert into workOrder(id,orderNumber,orderStatus,installationAddress,engineer) values(:id,:orderNumber,:orderStatus,:instAddr,:engineer)", paramerMap);
		return findById(id);
	}

	@Override
	public WorkOrder update(WorkOrder workOrder) {
		Map<String,Object> paramerMap = new HashMap<>();
		paramerMap.put("id", workOrder.getId());
		paramerMap.put("orderNumber",workOrder.getOrderNumber());
		paramerMap.put("orderStatus", WorkingType.Pending);
		paramerMap.put("installationAddress", workOrder.getInstallationAddress());
		paramerMap.put("engineer", workOrder.getEngineer());
		namedParameterJdbcTemplate.update("update workOrder set orderNumber=:orderNumber,orderStatus = :orderStatus,installationAddress = :installationAddress,engineer =:engineer where id = :id", paramerMap);
		return findById(workOrder.getId());
	}

	@Override
	public WorkOrder findByOrderNumber(String orderNumber) {
		Map<String,Object> paramMap = new HashMap<>();
		paramMap.put("orderNumber", orderNumber);
		List<WorkOrder> orderList = namedParameterJdbcTemplate.query("SELECT * FROM workOrder where orderNumber = :orderNumber ", paramMap,new WorkOrderRowMapper());
		return (orderList.size() > 0)?orderList.get(0):null;
	}

	@Override
	public WorkOrder findById(Long id) {
		Map<String,Object> paramMap = new HashMap<>();
		paramMap.put("id", id);
		List<WorkOrder> orderList = namedParameterJdbcTemplate.query("SELECT * FROM workOrder where id = :id", paramMap,new WorkOrderRowMapper());
		return (orderList.size() > 0)?orderList.get(0):null; 
	}

	@Override
	public List<WorkOrder> findWhereClause(String whereClause, Map<String, Object> paramMap) {
		String baseSql= "SELECT * FROM workOrder ";
		if(StringUtils.hasText(whereClause)){
			baseSql += whereClause;
		}
		return namedParameterJdbcTemplate.query(baseSql, paramMap,new WorkOrderRowMapper());
	}

}
