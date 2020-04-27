package com.haogang.common.utils;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class TPSTest {

	@Test
	public void test() {
		
		Calendar c = Calendar.getInstance();
		c.set(2012, 1, 1);
		Date date = DateUtil.random(c.getTime(), new Date());
		
		for (int i=1; i <=100; i++) {
			System.out.println(new TPS(i, ZHStringUtil.getZHName(),RandomUtil.random(1, 100),RandNumUtil.getValue(30000, 80000, 2),date));
		}
	}

}
