package com.user.entity;

public class Contact {

	private Long cid;
	private String email;
	private String contactName;
	private Long userId;
	
	public Long getcId() {
		return cid;
	}
	public void setId(Long cid) {
		this.cid = cid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	public Contact(Long cid, String email, String contactName, Long userId) {
		super();
		this.cid = cid;
		this.email = email;
		this.contactName = contactName;
		this.userId = userId;
	}
	public Contact() {
		super();
	}
	
	
}
