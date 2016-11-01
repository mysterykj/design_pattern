package com.patterns.StrategyPattern;

import java.io.IOException;
import java.net.Socket;

public interface Service {
	void doService(Socket client) throws IOException;
}
