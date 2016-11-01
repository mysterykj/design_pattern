package com.patterns.ObserverPattern;

public class ClientEvent {

	private final String ip;
	private final String name;
	
	public ClientEvent(Client client) {
		this.ip = client.getIp();
		this.name = client.getName();
	}

	public String getIp() {
		return ip;
	}

	public String getName() {
		return name;
	}

}
