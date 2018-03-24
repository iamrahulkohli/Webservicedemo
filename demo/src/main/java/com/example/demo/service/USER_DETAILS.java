package com.example.demo.service;

import javax.persistence.Entity;

@Entity
public class USER_DETAILS {
	private String USER_UID;
	private String USER_NAME;
	private String PASS;
	public String getUSER_UID() {
		return USER_UID;
	}
	public void setUSER_UID(String uSER_UID) {
		USER_UID = uSER_UID;
	}
	public String getUSER_NAME() {
		return USER_NAME;
	}
	public void setUSER_NAME(String uSER_NAME) {
		USER_NAME = uSER_NAME;
	}
	public String getPASS() {
		return PASS;
	}
	public void setPASS(String pASS) {
		PASS = pASS;
	}
}
