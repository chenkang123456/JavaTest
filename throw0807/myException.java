package com.throw0807;

public class myException extends Exception {
	String message;
	public myException(String ErrorMessage){
		message=ErrorMessage;
		
	}
	public String getMessage(){
		return message;
	}

}
