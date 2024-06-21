package com.theknowledgeacademy;

public class ClientMain {

	public static void main(String[] args) {
	
		CalculatorService calculatorService=new CalculatorService();
		Calservice calservicePort = calculatorService.getCalservicePort();
		System.out.println(calservicePort.addOp(4, 1));
	}
}
