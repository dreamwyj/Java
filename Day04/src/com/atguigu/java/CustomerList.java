package com.atguigu.java;import java.util.Iterator;


/**
 * 
 * @Description 为Customer对象的管理模块，
 * 内部用数组管理一组Customer对象，
 * 并提供相应的添加、修改、删除和遍历方法，
 * 供CustomerView调用
 * @author oliviau Email:2736737597@qq.com
 * @version
 * @date 2021年1月11日下午8:58:31
 *
 */
public class CustomerList {
	private Customer[] customers = new Customer[100];
	private int num = 1;
	// 增加
	//String name,Boolean sex,int age,String phone,String mail
	public void add(String name,String sex,int age,String phone,String mail) {
//		customer[index].setName(name);
//		customer[index].setSex(sex);
//		customer[index].setAge(age);
//		customer[index].setPhone(phone);
//		customer[index].setMail(mail);
//		index++;
		Customer cust = new Customer(name, sex, age, phone, mail);
		customers[num++] = cust;
		
	}
	// 修改
	public void revise(int index) {
		if(index > 0 && index < num) {
			//Customer cust = new Customer(null, null, index, null, null)
			
		}
	
		
		
	}
	// 删除
	public void delete(int index) {
		if(index > 0&&index < num) {
			for (int i = index; i < num - 1; i++) {
				//Customer p = new Customer();
				customers[i] = customers[i+1];
				
			}
		}
		num--;
	}
	// 查询
	public void inquire() {
		
		for (int index = 1; index < num; index++) {
			String name = customers[index].getName();
			String sex = customers[index].getSex();
			int age = customers[index].getAge();
			String Phone = customers[index].getPhone();
			String mail = customers[index].getMail();
			System.out.println(index + "\t" + name + "\t" + sex + "\t" + age + "\t"
					+ Phone + "\t" + mail);
			
		}
		
	}

}
