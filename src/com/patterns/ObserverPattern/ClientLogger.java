package com.patterns.ObserverPattern;

public class ClientLogger implements ClientListener {

	@Override
	public void clientAdded(ClientEvent event) {
		System.out.println(event.getIp() + " " + event.getName() +  " added...");
	}

	@Override
	public void clientRemoved(ClientEvent event) {
		System.out.println(event.getIp() + " " + event.getName() +  " removed...");
	}

}
