package com.atguigu.p2.service;
import com.atguigu.p2.bean.Customer;

/**
 * 
 * @Description 为Customer对象的管理模块， 内部用数组管理一组Customer对象， 
 * 				并提供相应的添加、修改、删除和遍历方法，
 *              供CustomerView调用
 * @author oliviau Email:2736737597@qq.com
 * @version
 * @date 2021年1月11日下午8:58:31
 *
 */
public class CustomerList {

	private Customer[] customers;// 用来保存客户对象的数组
	private int total = 0;

	/**
	 * 用来初始化customers数组的构造器
	 * 
	 * @param totalCustomer 指定数组的长度
	 */
	public CustomerList(int totalCustomer) {
		customers = new Customer[totalCustomer];
	}

	/**
	 * 
	 * @Description 将指定的客户添加到数组中
	 * @author Olivia
	 * @date 2021年1月12日上午10:15:50
	 * @param customer
	 * @return true:添加成功 false:添加失败
	 */
	public boolean addCustomer(Customer customer) {
		if (total >= customers.length) {
			return false;
		}
		customers[total++] = customer;
		return true;
	}

	/**
	 * 
	 * @Description 修改指定索引位置上的信息
	 * @author Olivia
	 * @date 2021年1月12日上午10:38:19
	 * @param index
	 * @param customer
	 * @return true:修改成功 false:修改失败
	 */
	public boolean replaceCustomer(int index, Customer customer) {
		if (index < 0 || index >= total) {
			return false;
		}
		customers[index] = customer;
		return true;

	}

	/**
	 * 删除指定索引位置上的客户
	 * 
	 * @Description
	 * @author Olivia
	 * @date 2021年1月12日上午11:01:31
	 * @param index
	 * @return true:删除成功 false:删除失败
	 */
	public boolean deleteCustomer(int index) {
		if (index < 0 || index >= total) {
			return false;
		}
		for (int i = index; i < total - 1; i++) {
			customers[i] = customers[i + 1];
		}
		// 最后有数据的元素需要置空
//		customers[total - 1] = null;
//		total--;
		customers[--total] = null;
		return true;

	}

	/**
	 * 
	 * @Description 获取所有的客户信息
	 * @author Olivia
	 * @date 2021年1月12日上午11:13:59
	 * @return
	 */
	public Customer[] getAllCustomers() {
		// return customers;
		Customer[] cust = new Customer[total];
		for (int i = 0; i < cust.length; i++) {
			cust[i] = customers[i];
		}
		return cust;
	}

	/**
	 * 
	 * @Description 获取指定索引位置上的客户信息
	 * @author Olivia
	 * @date 2021年1月12日上午11:18:52
	 * @param index
	 * @return 如果找到了元素，则返回，如果没有找到元素，则返回null
	 */
	public Customer getCustomer(int index) {
		if (index < 0 || index >= total) {
			return null;
		}
		return customers[index];

	}

	public int getTotal() {
		return total;
	}
}