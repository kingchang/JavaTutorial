package com.waterstart.main;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

public class HelloWorld {
	
	protected int a = 1;
	private String name  = "Hello";
	private long b = 1L;
	private char c = 'Y';
	private double e = 100.5;
	private float f = 0.3F;
	private BigDecimal dollor = new BigDecimal("100.5");
	private boolean isHuman = true;
	
	public final String getName(String name){
		return name;
	}
	public void test1(String a){
		float b = 1.0F;
	}
	
	public final static Date getNow(){
		Calendar cal = Calendar.getInstance();
		return cal.getTime();
	}
	
	public final Date getNow1(){
		Calendar cal = Calendar.getInstance();
		return cal.getTime();
	}
	public static void main(String[] args) {
		String name="Sky";
		System.out.println("Hello "+ name);
		System.out.println("Integer MAX_VALUE:"+Integer.MAX_VALUE);
		System.out.println("Integer MIN_VALUE:"+Integer.MIN_VALUE);
		BigDecimal dollor = new BigDecimal("100.5");
		
		double test1 = 1.0;
		for(int i=0;i< 10 ;i++){
			System.out.println(test1 - (0.1*i));
		}
		HelloWorld helloWorld = new HelloWorld();
		System.out.println(helloWorld.getNow1());
		System.out.println(HelloWorld.getNow());
		int a = 1;
		long b = 2L;
		System.out.println(a+b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a == b);
		System.out.println(a == 1 && b == 2);
		System.out.println(a == 3 || b == 2L);
		System.out.println(a++); // a = 1 ,1+1 ,a =2
		System.out.println(++a); // 2 + 1, a = 3
		System.out.println(a++); // a =3 , 3+1
		System.out.println( 1 << 3); // 1 * 2^3
		System.out.println(8 >> 3); // 8 / 2^3
		
		if(1 == 2){
			System.out.println(1);
		}else if ( 2 == 2){
			System.out.println(2);
		}else {
			System.out.println(3);
		}
		
	}

}
