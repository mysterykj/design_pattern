package com.patterns.StrategyPattern;

import java.io.IOException;

public class StategyMain {

	public static void main(String[] args) throws IOException {
		Server server = new Server(9999, new EchoService());
		server.start();
	}
}
