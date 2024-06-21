package com.bookstore.dto;

import java.time.LocalDateTime;

public class ErrorInfo {
	private String errorMessage;
	private String statusCode;
	private String toContact;
	private LocalDateTime dateTime;
	
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getToContact() {
		return toContact;
	}
	public void setToContact(String toContact) {
		this.toContact = toContact;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	public ErrorInfo(String errorMessage, String statusCode, String toContact, LocalDateTime dateTime) {
		super();
		this.errorMessage = errorMessage;
		this.statusCode = statusCode;
		this.toContact = toContact;
		this.dateTime = dateTime;
	}
	public ErrorInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
