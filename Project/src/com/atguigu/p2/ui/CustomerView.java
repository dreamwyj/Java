package com.atguigu.p2.ui;

import java.util.Iterator;
import java.util.Scanner;

import com.atguigu.p2.bean.Customer;
import com.atguigu.p2.service.CustomerList;
import com.atguigu.p2.util.CMUtility;

//import myproject.util.CMUtility;

/**
 * 
 * @Description 为主模块，负责菜单的显示和处理用户操作
 * @author oliviau Email:2736737597@qq.com
 * @version
 * @date 2021年1月11日下午9:00:26
 *
 */
public class CustomerView {
	private CustomerList customerList = new CustomerList(10);

	public CustomerView() {
		Customer customer = new Customer("王涛", '男', 23, "13212341234", "wt@gmail.com");
		customerList.addCustomer(customer);
	}

	/**
	 * 
	 * @Description 显示客户信息管理软件界面的方法
	 * @author Olivia
	 * @date 2021年1月12日上午11:42:02
	 */
	public void enterMainMenu() {

		boolean isFlag = true;
		while (isFlag) {
			System.out.println("\n-------------------客户信息管理软件-----------------");
			System.out.println("                     1.添加客户");
			System.out.println("                     2.修改客户");
			System.out.println("                     3.删除客户");
			System.out.println("                     4.客户列表");
			System.out.println("                     5.退出\n");
			System.out.print("      请选择(1-5):");
			// Scanner input = new Scanner(System.in);
			char menu = CMUtility.readMenuSelection();
			switch (menu) {
			case '1':
				addNewCustomer();
				break;
			case '2':
				modifyCustomer();
				break;
			case '3':
				deleteCustomer();
				break;
			case '4':
				listAllCustomers();
				break;
			case '5': {
				System.out.println("确认是否退出(Y/N):");
				char isExit = CMUtility.readConfirmSelection();
				if (isExit == 'Y') {
					isFlag = false;
				}

			}

			}

		}
		System.out.println("已退出");
	}

	/**
	 * 
	 * @Description 添加客户的操作
	 * @author Olivia
	 * @date 2021年1月12日上午11:35:58
	 */
	private void addNewCustomer() {
		// System.out.println("的操作");
		System.out.println("-------------------添加客户-----------------");
		System.out.print("姓名：");
		String name = CMUtility.readString(10);
		System.out.print("性别：");
		char gender = CMUtility.readChar();
		System.out.print("年龄：");
		int age = CMUtility.readInt();
		System.out.print("电话：");
		String phone = CMUtility.readString(13);
		System.out.print("邮箱：");
		String email = CMUtility.readString(30);

		// 将上面的数据封装到对象中
		Customer customer = new Customer(name, gender, age, phone, email);
		boolean isSuccess = customerList.addCustomer(customer);
		if (isSuccess) {
			System.out.println("-------------------添加完成-----------------");
		} else {
			System.out.println("--------------客户目录已满，添加失败-----------");
		}
	}

	/**
	 * 
	 * @Description 修改客户的操作
	 * @author Olivia
	 * @date 2021年1月12日上午11:40:34
	 */
	private void modifyCustomer() {
		System.out.println("修改客户的操作");
		System.out.println("-------------------修改客户-----------------");
		Customer cust;
		int number;
		for (;;) {
			System.out.println("请选择待修改客户编号（-1退出）");
			number = CMUtility.readInt();

			if (number == -1) {
				return;
			}
			cust = customerList.getCustomer(number - 1);
			if (cust == null) {
				System.out.println("无法找到指定客户！");
			} else {// 找到相应编号的客户
				break;
			}
		}
		// 修改客户信息
		System.out.print("姓名(" + cust.getName() + "):");
		String name = CMUtility.readString(10, cust.getName());
		System.out.print("性别(" + cust.getSex() + "):");
		char gender = CMUtility.readChar(cust.getSex());
		System.out.print("年龄(" + cust.getAge() + "):");
		int age = CMUtility.readInt(cust.getAge());
		System.out.print("电话(" + cust.getPhone() + "):");
		String phone = CMUtility.readString(13, cust.getPhone());
		System.out.print("邮箱(" + cust.getEmail() + "):");
		String email = CMUtility.readString(30, cust.getEmail());

		Customer newcust = new Customer(name, gender, age, phone, email);

		boolean isRepalaced = customerList.replaceCustomer(number - 1, newcust);
		if (isRepalaced) {
			System.out.println("-------------------修改完成-----------------");
		} else {
			System.out.println("-------------------修改失败-----------------");
		}

	}

	/**
	 * 
	 * @Description 删除客户的操作
	 * @author Olivia
	 * @date 2021年1月12日上午11:40:48
	 */
	private void deleteCustomer() {
		// System.out.println("删除客户的操作");
		System.out.println("-------------------删除客户-----------------");
		int number;
		Customer customer;
		for (;;) {
			System.out.println("请删除待删除客户编号(-1退出)");
			number = CMUtility.readInt();
			if (number == -1) {
				return;
			}
			customer = customerList.getCustomer(number - 1);
			if (customer == null) {
				System.out.println("无法找到指定客户");
			} else {
				break;
			}
		}
		// 找到指定客户
		System.out.print("确认是否删除(Y/N):");
		char isDelete = CMUtility.readConfirmSelection();
		if (isDelete == 'Y') {
			boolean deleteSuccess = customerList.deleteCustomer(number - 1);
			if (deleteSuccess == true) {
				System.out.println("-------------------删除成功-----------------");
			} else {
				System.out.println("-------------------删除失败-----------------");
			}

		} else {
			return;
		}
	}

	/**
	 * 
	 * @Description 显示客户列表的操作
	 * @author Olivia
	 * @date 2021年1月12日上午11:41:32
	 */
	private void listAllCustomers() {
//		System.out.println("显示客户的操作");
		System.out.println("-------------------客户列表-----------------");
		int total = customerList.getTotal();
		if (total == 0) {
			System.out.println("没有客户记录");
		} else {
			System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
			Customer[] custs = customerList.getAllCustomers();
			for (int i = 0; i < custs.length; i++) {
				Customer cust = custs[i];
				System.out.println((i + 1) + "\t" + cust.getName() + "\t" + cust.getSex() + "\t" + cust.getAge() + "\t"
						+ cust.getPhone() + "\t" + cust.getEmail());
			}
		}

		System.out.println("-----------------客户列表完成----------------");
	}

	public static void main(String[] args) {
		CustomerView view = new CustomerView();
		view.enterMainMenu();
	}

}
