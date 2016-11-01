package com.patterns.StrategyPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class EchoService implements Service{

	@Override
	public void doService(Socket client) throws IOException {
		BufferedReader reader = null;
		PrintStream writer = null;
		
		try{
			reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
			writer = new PrintStream(client.getOutputStream());
			
			String input = reader.readLine();
			writer.println(input);
		}
		finally{
			client.close();
		}
	}

}
