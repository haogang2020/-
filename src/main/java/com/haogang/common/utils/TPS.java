package com.haogang.common.utils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

public class TPS {

	private Integer id;
	private String name;
	private Integer age;
	private BigDecimal money;
	private Date date;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public BigDecimal getMoney() {
		return money;
	}
	public void setMoney(BigDecimal money) {
		this.money = money;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "TPS [id=" + id + ", name=" + name + ", age=" + age + ", money=" + money + ", date=" + date + "]";
	}
	public TPS(Integer id, String name, Integer age, BigDecimal money, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.money = money;
		this.date = date;
	}
	public TPS() {
		super();
	}

}
