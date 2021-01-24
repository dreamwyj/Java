package com.atguigu.exer;

public class EmployeeTest {
	public static void main(String[] args) {
		// 多态
		Employee manager = new Manager("库克",1001,2000,1000);
		manager.work();
		
		CommonEmployee commonEmployee = new CommonEmployee();
		commonEmployee.work();
	}
}
