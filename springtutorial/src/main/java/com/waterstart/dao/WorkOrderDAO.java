package com.waterstart.dao;
import java.util.List;
import java.util.Map;

import com.waterstart.spring.rowmapper.WorkOrder;

public interface WorkOrderDAO {
	public WorkOrder insert(WorkOrder workOrder);
	public WorkOrder update(WorkOrder workOrder);
	public WorkOrder findByOrderNumber(String orderNumber);
	public WorkOrder findById(Long id);
	public List<WorkOrder> findWhereClause(String whereClause,Map<String,Object> paramMap);
}
