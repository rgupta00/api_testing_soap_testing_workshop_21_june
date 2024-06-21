package com.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name="calservice", targetNamespace="http://theknowledgeacademy.com")
public class Calculator {


	@WebMethod(operationName="addOp", action="addAction")
	@WebResult(name="addResult")
	public int add(@WebParam(name="x")  int a,@WebParam(name="y") int b) {
		return a+b;
	}
	

	@WebMethod(operationName="multiplyOp", action="multiplyAction")
	@WebResult(name="mulResult")
	public int multiply(@WebParam(name="x")  int a,@WebParam(name="y") int b) {
		return a*b;
	}
}
