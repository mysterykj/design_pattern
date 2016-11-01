package com.patterns.ObserverPattern;

public interface ClientListener {
	public void clientAdded(ClientEvent event);
	
	public void clientRemoved(ClientEvent event);
}
