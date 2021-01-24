package com.atguigu.java1;
/*
 * 异常对象的产生：
 * 1.系统自动生成的异常对象
 * 2.手动的生成一个异常对象，并抛出throw
 * 
 */
public class StudentTest {
	public static void main(String[] args) {
		try {
			Student student = new Student();
			student.regist(-1001);
			System.out.println(student);
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
class Student{
	
	private int id;
	
	public void regist(int id) throws Exception {
		if (id > 0) {
			this.id = id;
		}else {
//			System.out.println("你输入的数据非法！");
//			throw new RuntimeException("您输入的数据非法！");
//			throw new Exception("你输入的数据非法");
			throw new MyException("不能输出负数");
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + "]";
	}
	
	
}
