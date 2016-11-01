package com.patterns.ObserverPattern;

public class ObserverMain {

	public static void main(String[] args) {
		ClientQueue queue = new ClientQueue();
		queue.addClientListener(new ClientLogger());
		
		Client c1 = new Client("127.0.0.1", "localhost");
		Client c2 = new Client("192.168.0.1", "router");
		
		queue.add(c1);
		queue.add(c2);
		
		queue.remove(c1);
		queue.remove(c2);
	}

}
