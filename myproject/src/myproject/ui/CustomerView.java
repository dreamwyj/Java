package myproject.ui;
/*
 * CustomerView为主模块，负责菜单的显示和处理用户操作
 */

import myproject.bean.Customer;
import myproject.service.CustomerList;
import myproject.util.CMUtility;

public class CustomerView {
	CustomerList customerList = new CustomerList(10);

	public CustomerView() {
		// TODO Auto-generated constructor stub
		customerList.addCustomer(new Customer("张三", '男', 19, "27971923", "3278616@qq.com"));
		customerList.addCustomer(new Customer("大叔控", '男', 75, "31647681", "sjksk@qq.com"));
		customerList.addCustomer(new Customer("王菲三", '女', 95, "1378681", "sjksk@qq.com"));
		customerList.addCustomer(new Customer("张三", '男', 19, "27971923", "3278616@qq.com"));
		customerList.addCustomer(new Customer("大叔控", '男', 75, "31647681", "sjksk@qq.com"));
		customerList.addCustomer(new Customer("王菲三", '女', 95, "1378681", "sjksk@qq.com"));
		customerList.addCustomer(new Customer("张三", '男', 19, "27971923", "3278616@qq.com"));
		customerList.addCustomer(new Customer("大叔控", '男', 75, "31647681", "sjksk@qq.com"));
		customerList.addCustomer(new Customer("王菲三", '女', 95, "1378681", "sjksk@qq.com"));
		customerList.addCustomer(new Customer("张三", '男', 19, "27971923", "3278616@qq.com"));
	}

	/**
	 * 
	 * @Description 显示主菜单，响应用户输入， 根据用户操作分别调用其他相应的成员方法（如addNewCustomer）， 以完成客户信息处理。
	 * @author Olivia
	 * @date 2021年1月13日上午11:19:57
	 * @param args
	 */
	public void enterMainMenu() {
		CustomerView customerView = new CustomerView();
		boolean isflag = true;
		do {
			System.out.println(" -----------------客户信息管理软件-----------------\n");
			System.out.println("\t\t   1 添 加 客 户");
			System.out.println("\t\t   2 修 改 客 户");
			System.out.println("\t\t   3 删 除 客 户");
			System.out.println("\t\t   4 客 户 列 表");
			System.out.println("\t\t   5 退 出 客 户\n");
			System.out.print("\t请选择(1-5)：");
			// CMUtility cmUtility = new CMUtility();
			char menu = CMUtility.readChar();

			switch (menu) {
			case '1':
//				System.out.println("添加");
				customerView.addNewCustomer();
				break;
			case '2':
				// System.out.println("修改");
				customerView.modifyCustomer();
				break;
			case '3':
				// System.out.println("删除");
				customerView.deleteCustomer();
				break;
			case '4':
//				System.out.println("列表");
				customerView.listAllCustomers();

				break;
			case '5':
				// System.out.println("退出");
				System.out.print("确认是否删除(Y/N)：");
				char exit = CMUtility.readConfirmSelection();
				if (exit == 'Y') {

					isflag = false;
				}
				break;

			}
		} while (isflag);
		System.out.println("--------------------已退出系统---------------------");
	}

	private void addNewCustomer() {
		System.out.println("---------------------添加客户---------------------");
		System.out.print("姓名：");
		String name = CMUtility.readString(7);
		System.out.print("性别：");
		char gender = CMUtility.readChar();
		System.out.print("年龄：");
		int age = CMUtility.readInt();
		System.out.print("电话：");
		String phone = CMUtility.readString(13);
		System.out.print("邮箱：");
		String email = CMUtility.readString(20);
		Customer customer = new Customer(name, gender, age, phone, email);
		boolean isflag_add = customerList.addCustomer(customer);
		if (isflag_add) {
			System.out.println("---------------------添加完成---------------------");

		} else {
			System.out.println("---------------内存已满，添加失败-------------------");

		}

	}

	private void modifyCustomer() {
		System.out.println("---------------------修改客户---------------------");
		System.out.print("请选择待修改客户编号(-1退出)：");
		int num = CMUtility.readInt();
		if (num == -1) {
			return;
		}
//		if (num > customerList.getTotal()) {
//			System.out.println("没有该编号客户信息");
//			return;
//		}
		Customer customer = new Customer();
		// customer对象 获取以前该客户信息
		customer = customerList.getCustomer(num - 1); 
		if (customer == null) {
			System.out.println("\n-------------------索引错误，修改失败---------------------\n");
			return;
		}
		// 1.打印以前的该号信息
		System.out.print("姓名（" + customer.getName() + "）:");
		String name = CMUtility.readString(7, customer.getName());
		System.out.print("性别（" + customer.getGender() + "）:");
		char gender = CMUtility.readChar(customer.getGender());
		System.out.print("年龄（" + customer.getAge() + "）:");
		int age = CMUtility.readInt(customer.getAge());
		System.out.print("电话（" + customer.getPhone() + "）:");
		String phone = CMUtility.readString(13, customer.getPhone());
		System.out.print("邮箱（" + customer.getEmail() + "）:");
		String email = CMUtility.readString(20, customer.getEmail());
		// customer2 获取修改后客户信息
		Customer customer2 = new Customer(name, gender, age, phone, email);
		// 2.替换客户列表中该客户的信息
		boolean isflag_modify = customerList.replaceCustomer(num - 1, customer2);
		if (isflag_modify) {
			System.out.println("\n---------------------修改完成---------------------");
		}

	}

	private void deleteCustomer() {
		System.out.println("---------------------删除客户---------------------");
		System.out.print("请选择待修改客户编号(-1退出)：");
		int num = CMUtility.readInt();
		if (num == -1) {
			return;
		}

		System.out.print("确认是否删除(Y/N)：");
		char delete = CMUtility.readConfirmSelection();
		if (delete == 'N') {
			return;
		}

		boolean isflag_delete = customerList.deleteCustomer(num - 1);
		if (isflag_delete) {

			System.out.println("---------------------删除完成---------------------");

		}
		else {
			System.out.println("-----------------索引无效，删除失败--------------------");
		}

	}

	private void listAllCustomers() {
		System.out.println("---------------------客户列表---------------------");
		// 1.得到客户列表
		// 2.遍历列表
		Customer[] customers = new Customer[customerList.getTotal()];
		customers = customerList.getAllCustomers();
		System.out.println("编号\t姓名\t\t性别\t年龄\t电话 \t\t 邮箱\n");
		for (int i = 0; i < customers.length; i++) {
			Customer customer = new Customer();
//			customer = customers[i];
			customer = customerList.getCustomer(i);
			System.out.println((i + 1) + "\t" + customer.getName() + "\t\t" + customer.getGender() + "\t"
					+ customer.getAge() + "\t" + customer.getPhone() + "\t\t" + customer.getEmail());

		}
		System.out.println("--------------------客户列表完成---------------------");

	}

	public static void main(String[] args) {
		CustomerView customerView = new CustomerView();
		customerView.enterMainMenu();
	}

}
