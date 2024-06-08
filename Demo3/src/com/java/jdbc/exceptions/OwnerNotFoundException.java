package com.java.jdbc.exceptions;

/**
 * @author Gaurab Sah
 *
 */

public class OwnerNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;

	public OwnerNotFoundException(String message) {
		super(message);
	}
}