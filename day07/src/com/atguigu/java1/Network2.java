package com.atguigu.java1;

public class Network2 {
	public static void main(String[] args) {
		Server server = new Server();
		Proxy proxy = new Proxy(server);
		proxy.browse();
	}

}

interface NetWork{
	
	public void browse();
}

class Server implements NetWork{

	@Override
	public void browse() {
		// TODO Auto-generated method stub
		System.out.println("真正的服务器访问网路");
	}
	
	
}

class Proxy implements NetWork{
	
	private NetWork network;
	
	public Proxy(NetWork network) {
		// TODO Auto-generated constructor stub
		this.network = network;
	}
	
	public void check() {
		System.out.println("检查网络环境！");
	}
	
	@Override
	public void browse() {
		// TODO Auto-generated method stub
		check();
		network.browse();
	}
	
}