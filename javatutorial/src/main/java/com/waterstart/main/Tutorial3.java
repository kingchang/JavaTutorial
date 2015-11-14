package com.waterstart.main;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.waterstart.bo.WorkOrder;
import com.waterstart.vo.WorkingType;

public class Tutorial3 {
	private final static Logger logger = LoggerFactory.getLogger(Tutorial3.class);
	public static void main(String[] args) {
		WorkOrder order1 = new WorkOrder();
		order1.setStatus(WorkingType.Pending);
		logger.info("Status{}",order1.getStatus());
		// xxxxx
		order1.setStatus(WorkingType.PendingInstalltion);
		logger.info("Status{}",order1.getStatus());
		// 報峻
		order1.setStatus(WorkingType.Receiver);
		logger.info("Status{}",order1.getStatus());
		// 客服
		order1.setStatus(WorkingType.Installation);
		logger.info("Status{}",order1.getStatus());
		//   帳務，會計
		order1.setStatus(WorkingType.Finish);
		logger.info("Status{}",order1.getStatus());
		System.out.println(Arrays.toString(WorkingType.values()));
		
	}

}
