package com.xworkz.project.exception;

public class NullCheckException extends Throwable {

	public NullCheckException(String userName) {
        super(userName);
    }
}
