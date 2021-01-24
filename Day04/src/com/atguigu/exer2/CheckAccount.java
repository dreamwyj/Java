package com.atguigu.exer2;
/*
 * 创建 Account 类的一个子类 CheckAccount 代表可透支的账户，该账户中定义一个属性
overdraft 代表可透支限额。在 CheckAccount 类中重写 withdraw 方法，其算法如下：
如果（取款金额<账户余额），
可直接取款
如果（取款金额>账户余额），
计算需要透支的额度
判断可透支额 overdraft 是否足够支付本次透支需要，如果可以
将账户余额修改为 0，冲减可透支金额
如果不可以
提示用户超过可透支额的限额
 */
public class CheckAccount extends Account {
	

	private double overdraft;
	
	public CheckAccount(int id, double balance, double annualInterestRate,double overdraft) {
		super(id, balance, annualInterestRate);
		// TODO Auto-generated constructor stub
		this.overdraft = overdraft;
	}
	
	public double getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
//		System.out.println("取款金额:" + amount);
//		System.out.println("账户余额为：" + getBalance());
//		System.out.println("可透支金额为：" + overdraft);
//		double balance = getBalance();
		if (amount <= balance) {
			// 方式一：
//			setBalance(balance - amount);
			// 方式二：
			super.withdraw(amount);
			// 方式三：修改balance权限
		}else if (overdraft >= amount - getBalance()) {
			overdraft -= (amount - getBalance());
			super.withdraw(getBalance());
			// 或者
//			setBalance(0);
		}else {
			System.out.println("超过可透支限额");
		}
		
//		if(amount > balance) {
//			double over = amount - balance;
//			if (over <= overdraft) {
//				setBalance(0);
//				overdraft -= over;
//				
//			}else {
//				System.out.println("超过可透支额的限额");
//			}
//		}
//		System.out.println("取款金额:" + amount);
//		System.out.println("取款后账户变动");
////		System.out.println("账户余额为：" + getBalance());
//		System.out.println("账户余额为：" + balance);
//		System.out.println("可透支金额为：" + overdraft);
	}

}
