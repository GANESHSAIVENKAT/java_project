package com.xworkz.project.exception;

public class UsernameLengthException extends Throwable {
   
	public UsernameLengthException(String userName) {
        super(userName);
    }
}