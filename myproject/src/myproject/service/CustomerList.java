package myproject.service;
/**
 * CustomerList为Customer对象的管理模块，
 * 内部用数组管理一组Customer对象，
 * 并提供相应的添加、修改、删除和遍历方法，供CustomerView调用

 */
import myproject.bean.Customer;

public class CustomerList {
	Customer[] customers;
	int total = 0;
	
//	public static void main(String[] args) {
//		CustomerList customerList = new CustomerList(10);
//		System.out.println("add测试");
//		Customer customer1 = new Customer("张三", '男', 15, "1378681", "sjksk@qq.com");
//		System.out.println(customerList.addCustomer(customer1));
//		Customer customer2 = new Customer("刘三", '男', 165, "1378681", "sjksk@qq.com");
//		System.out.println(customerList.addCustomer(customer2));
//		Customer customer3 = new Customer("余三", '女', 85, "1378681", "sjksk@qq.com");
//		System.out.println(customerList.addCustomer(customer3)); 
//		Customer customer4 = new Customer("王菲三", '女', 95, "1378681", "sjksk@qq.com");
//		System.out.println(customerList.addCustomer(customer4)); 
//		Customer customer5 = new Customer("大叔控", '男', 195, "1378681", "sjksk@qq.com");
//		System.out.println(customerList.addCustomer(customer5));
//		Customer customer6 = new Customer("动物三", '男', 15, "1378681", "sjksk@qq.com");
//		System.out.println(customerList.addCustomer(customer6));
//		System.out.println("添加后：");
//		Customer[] custs1 = new Customer[customerList.getTotal()];
//		custs1 = customerList.getAllCustomers();
//		for (int i = 0; i < custs1.length; i++) {
//			Customer customer = new Customer();
//			customer = custs1[i];
//			System.out.println( (i+1) + "\t"+ customer.getName()+ "\t" 
//			+ customer.getGender() + "\t" + customer.getAge() + "\t"
//			+ customer.getPhone() + "\t" + customer.getEmail());
//			
//		}
//		Customer customer7 = new Customer("菲三", '女', 24, "18681", "ksk@qq.com");
//		System.out.println(customerList.addCustomer(customer7)); 
//		Customer customer8 = new Customer("大叔控", '男', 195, "1378681", "sjksk@qq.com");
//		System.out.println(customerList.addCustomer(customer8));
//		Customer customer9 = new Customer("动物三", '男', 15, "1378681", "sjksk@qq.com");
//		System.out.println(customerList.addCustomer(customer9));
//		Customer customer10 = new Customer("王菲三", '女', 95, "1378681", "sjksk@qq.com");
//		System.out.println(customerList.addCustomer(customer10)); 
//		Customer customer11 = new Customer("大叔控", '男', 195, "1378681", "sjksk@qq.com");
//		System.out.println(customerList.addCustomer(customer11));
//		Customer customer12 = new Customer("动物三", '男', 15, "1378681", "sjksk@qq.com");
//		System.out.println(customerList.addCustomer(customer12));
//		System.out.println("***********删除测试：");
//		System.out.println(customerList.deleteCustomer(10)); 
//		System.out.println(customerList.deleteCustomer(2)); 
//		System.out.println("***********替换测试：");
//		System.out.println(customerList.replaceCustomer(1, customer7));
//		Customer[] custs = new Customer[customerList.getTotal()];
//		custs = customerList.getAllCustomers();
//		for (int i = 0; i < custs.length; i++) {
//			Customer customer = new Customer();
//			customer = custs[i];
//			System.out.println( (i+1) + "\t"+ customer.getName()+ "\t" 
//			+ customer.getGender() + "\t" + customer.getAge() + "\t"
//			+ customer.getPhone() + "\t" + customer.getEmail());
//			
//		}
//		System.out.println("客户总共有：" + customerList.getTotal());
//		Customer cust3 = new Customer();
//		int num = 3;
//		cust3 = customerList.getCustomer(num);
//		if (cust3 != null) {
//			System.out.println(num + "\t"+ cust3.getName()+ "\t" 
//					+ cust3.getGender() + "\t" + cust3.getAge() + "\t"
//					+ cust3.getPhone() + "\t" + cust3.getEmail());
//		}
//		else {
//			System.out.println("查询失败哦");
//		}
//	}
	
	/**用来初始化customers数组
	 * 参数：totalCustomer：指定customers数组的最大空间
	 * 
	 * @param totalCustomer
	 */
	public CustomerList(int totalCustomer) {
		customers = new Customer[totalCustomer];
	}
	/**
	 * 
	 * @Description 将参数customer添加到数组中最后一个客户对象记录之后
	 * @author Olivia
	 * @date 2021年1月12日下午8:05:02
	 * @param customer 指定要添加的客户对象 
	 * @return 添加成功返回true；false表示数组已满，无法添加
	 */
	public boolean addCustomer(Customer customer) {
		if((total + 1) <= customers.length) {
			customers[total++] = customer; 
//			System.out.println("添加成功");
			return true;
		}
		else {
//			System.out.println("内存已满！添加失败");
			return false;
		}
	}
	/**
	 * 
	 * @Description 用参数customer替换数组中由index指定的对象
	 * @author Olivia
	 * @date 2021年1月12日下午8:14:00
	 * @param customer指定替换的新客户对象 
	 * 			index指定所替换对象在数组中的位置，从0开始
	 * @param cust
	 * @return	替换成功返回true；false表示索引无效，无法替换
	 */
	public boolean replaceCustomer(int index, Customer cust) {
		if(index < 0 || index >= total) {
//			System.out.println("索引无效！，修改失败");
			return false;
		}
		else {
			customers[index] = cust;
//			System.out.println("修改" + (index + 1)  + "成功");
			return true;
		}
	}
	/**
	 * 
	 * @Description 从数组中删除参数index指定索引位置的客户对象记录
	 * @author Olivia
	 * @date 2021年1月12日下午8:20:55
	 * @param index 指定所删除对象在数组中的索引位置，从0开始
	 * @return 删除成功返回true；false表示索引无效，无法删除
	 */
	public boolean deleteCustomer(int index) {
		if(index < 0 || index >= total) {
//			System.out.println("删除失败");
			return false;
		}
		for (int i = index; i < total - 1; i++) {
			customers[i] = customers[i + 1];
		}
		total--;
//		System.out.println("删除" + (index + 1) +"成功");
		return true;
			
	}
	/**
	 * 
	 * @Description 返回数组中记录的所有客户对象
	 * @author Olivia
	 * @date 2021年1月13日上午9:36:51
	 *  Customer[] 数组中包含了当前所有客户对象，该数组长度与对象个数相同。
	 * @return
	 */
	public Customer[] getAllCustomers() {
		Customer[] custs = new Customer[total];
		for (int i = 0; i < custs.length; i++) {
			custs[i] = customers[i];
		}
		return custs;
	}
	/**
	 * 
	 * @Description 返回参数index指定索引位置的客户对象记录
	 * @author Olivia
	 * @date 2021年1月13日上午9:39:54
	 * @param index 指定所要获取的客户在数组中的索引位置，从0开始
	 * @return 封装了客户信息的Customer对象
	 */
	public Customer getCustomer(int index) {
		Customer cust = new Customer();
		if(index < 0 || index >= total) {
			cust = null;
			
		}else {
			cust = customers[index];
		}
		return cust;
	}
	/**
	 * 
	 * @Description
	 * @author Olivia
	 * @date 2021年1月13日上午9:45:32
	 * @return
	 */
	public int getTotal() {
		return total;
	}

	

}
