package com.waterstart.util;

import java.util.Calendar;
import java.util.Date;

public class DateUtils {
	
	
	public final static Date getDate(String year,String month,String date){
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, Integer.parseInt(year));
		
		cal.set(Calendar.MONTH,getMonth(Integer.parseInt(month)));
		cal.set(Calendar.DATE,Integer.parseInt(date));
		return cal.getTime();
		
		
	}
	
	public final static int getMonth(int month){
		switch(month){
			case 1:
				return Calendar.JANUARY;
			case 2:
				return Calendar.FEBRUARY;
			case 3:
				return Calendar.MARCH;
			case 4:
				return Calendar.APRIL;
			case 5:
				return Calendar.MAY;
			case 6:
				return Calendar.JUNE;
			case 7:
				return Calendar.JULY;
			case 8:
				return Calendar.AUGUST;
			case 9:
				return Calendar.SEPTEMBER;
			case 10:
				return Calendar.OCTOBER;
			case 11:
				return Calendar.NOVEMBER;
			case 12:
				return Calendar.DECEMBER;
			default:
				throw new RuntimeException("月份錯誤");
		}
	}
	
	
}
