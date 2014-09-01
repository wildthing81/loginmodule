package com.entities;

public class User {

	private long user_id;
	private String username;
	private String password;
	private int loginAttempts;
	private boolean isLocked;
	/**
	 * @return the user_id
	 */
	public synchronized long getUser_id() {
		return user_id;
	}
	/**
	 * @return the username
	 */
	public synchronized String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public synchronized void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public synchronized String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public synchronized void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the loginAttempts
	 */
	public synchronized int getLoginAttempts() {
		return loginAttempts;
	}
	/**
	 * @param loginAttempts the loginAttempts to set
	 */
	public synchronized void setLoginAttempts(int loginAttempts) {
		this.loginAttempts = loginAttempts;
	}
	/**
	 * @return the isLocked
	 */
	public synchronized boolean getIsLocked() {
		return isLocked;
	}
	/**
	 * @param isLocked the isLocked to set
	 */
	public synchronized void setIsLocked(boolean isLocked) {
		this.isLocked = isLocked;
	}
	
}
