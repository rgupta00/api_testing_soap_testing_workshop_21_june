package com.ws;

import javax.xml.ws.Endpoint;

public class Main {

	public static void main(String[] args) {
			Endpoint.publish("http://localhost:8080/ws", new Calculator());
			System.out.println("ws is configured");
	}
}
