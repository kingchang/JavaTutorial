package com.waterstart.spring.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class WorkOrderRowMapper implements RowMapper<WorkOrder> {
	
	@Override
	public WorkOrder mapRow(ResultSet rs, int rowNum) throws SQLException {
		WorkOrder workOrder = new WorkOrder();
		Long id = rs.getLong("id");
		String orderNumber = rs.getString("orderNumber");
		WorkingType orderStatus = WorkingType.valueOf(rs.getString("orderStatus"));
		String installationAddress = rs.getString("installationAddress");
		String engineer = rs.getString("engineer");
		workOrder.setId(id);
		workOrder.setOrderNumber(orderNumber);
		workOrder.setOrderStatus(orderStatus);
		workOrder.setInstallationAddress(installationAddress);
		workOrder.setEngineer(engineer);
		return workOrder;
	}
}
