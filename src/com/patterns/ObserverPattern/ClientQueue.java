package com.patterns.ObserverPattern;

import java.util.LinkedList;
import java.util.List;

public class ClientQueue {
	private List<Client> clients = new LinkedList<Client>();
	private List<ClientListener> listeners = new LinkedList<ClientListener>();
	
	public void addClientListener(ClientListener listener){
		listeners.add(listener);
	}
	
	public void removeClientListener(ClientListener listener){
		listeners.remove(listener);
	}

	void notifyAdded(Client client){
		ClientEvent event = new ClientEvent(client);
		for(ClientListener listener : listeners){
			listener.clientAdded(event);
		}
	}
	
	void notifyRemoved(Client client){
		ClientEvent event = new ClientEvent(client);
		for(ClientListener listener : listeners){
			listener.clientRemoved(event);
		}
	}
	
	public void add(Client client){
		clients.add(client);
		notifyAdded(client);
	}
	
	public void remove(Client client){
		clients.remove(client);
		notifyRemoved(client);
	}
}
