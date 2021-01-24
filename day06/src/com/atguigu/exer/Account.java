package com.atguigu.exer;

import java.util.Iterator;
import java.util.Scanner;

public class Account {
	private int id;// 账号
	private String pwd = "000000";
	private double balance;
	
	private static double interesRate;
	private static double minMoney = 1.0;
	private static int init = 1000;
	
	public Account() {
		id = init++;
	}
	
	public Account(String pwd,double balance) {
		id = init++;
		this.pwd = pwd;
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", pwd=" + pwd + ", balance=" + balance + "]";
	}

	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public static double getInteresRate() {
		return interesRate;
	}
	public static void setInteresRate(double interesRate) {
		Account.interesRate = interesRate;
	}
	public static double getMinMoney() {
		return minMoney;
	}
	public static void setMinMoney(double minMoney) {
		Account.minMoney = minMoney;
	}
	public int getId() {
		return id;
	}
	public double getBalance() {
		return balance;
	}
	
	

}
