package myproject.bean;

public class Customer {
	String name;
	char gender;
	int age;
	String phone;
	String email;
	
// 单元测试
//	public static void main(String[] args) {
//		Customer customer = new Customer();
//		customer.setName("李四");
//		customer.setGender('男');
//		System.out.println(customer.getName() + " " + customer.getGender());
//	}
	
	public Customer() {
		// super();
	}
	public Customer(String name, char gender, int age, String phone, String email) {
		// super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phone = phone;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
