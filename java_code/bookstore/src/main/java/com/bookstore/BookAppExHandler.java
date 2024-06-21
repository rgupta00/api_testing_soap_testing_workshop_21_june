package com.bookstore;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.bookstore.dao.BookNotFoundException;
import com.bookstore.dto.ErrorInfo;

@RestControllerAdvice
public class BookAppExHandler {
	
	@ResponseStatus(code=HttpStatus.NOT_FOUND)
	@ExceptionHandler(BookNotFoundException.class)
	public ErrorInfo handle404(BookNotFoundException ex) {
		ErrorInfo errorInfo=new ErrorInfo();
		errorInfo.setDateTime(LocalDateTime.now());
		errorInfo.setErrorMessage("book not found");
		errorInfo.setToContact("rgupta.mtech@gmail.com");
		errorInfo.setStatusCode("404");
		return errorInfo;
		
	}
}
