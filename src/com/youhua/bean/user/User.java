package com.youhua.bean.user;

import java.sql.Timestamp;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String userId;
	private Orginfo orginfo;
	private String userName;
	private String password;
	private String trueName;
	private String email;
	private String contactTel;
	private Timestamp createTime;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(Orginfo orginfo, String userName, String password,
			String trueName, Timestamp createTime) {
		this.orginfo = orginfo;
		this.userName = userName;
		this.password = password;
		this.trueName = trueName;
		this.createTime = createTime;
	}

	/** full constructor */
	public User(Orginfo orginfo, String userName, String password,
			String trueName, String email, String contactTel,
			Timestamp createTime) {
		this.orginfo = orginfo;
		this.userName = userName;
		this.password = password;
		this.trueName = trueName;
		this.email = email;
		this.contactTel = contactTel;
		this.createTime = createTime;
	}

	// Property accessors

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Orginfo getOrginfo() {
		return this.orginfo;
	}

	public void setOrginfo(Orginfo orginfo) {
		this.orginfo = orginfo;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTrueName() {
		return this.trueName;
	}

	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactTel() {
		return this.contactTel;
	}

	public void setContactTel(String contactTel) {
		this.contactTel = contactTel;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

}