package com.java.Soru4.Account;

public class InvalidAuthenticationException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;
    public InvalidAuthenticationException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

}
