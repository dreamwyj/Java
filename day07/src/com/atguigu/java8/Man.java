package com.atguigu.java8;

class Man implements Filial, Spoony {
	@Override
	public void help() {
		System.out.println("我该怎么办呢？");
		Filial.super.help();
		Spoony.super.help();
	}
}
