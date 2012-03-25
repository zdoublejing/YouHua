package com.youhua.bean.user;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Orginfo entity. @author MyEclipse Persistence Tools
 */

public class Orginfo implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String orgId;
	private String orgName;
	private Timestamp createTime;
	private Set<User> users = new HashSet<User>(0);

	// Constructors

	/** default constructor */
	public Orginfo() {
	}

	/** minimal constructor */
	public Orginfo(String orgName, Timestamp createTime) {
		this.orgName = orgName;
		this.createTime = createTime;
	}

	/** full constructor */
	public Orginfo(String orgName, Timestamp createTime, Set<User> users) {
		this.orgName = orgName;
		this.createTime = createTime;
		this.users = users;
	}

	// Property accessors

	public String getOrgId() {
		return this.orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getOrgName() {
		return this.orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Set<User> getUsers() {
		return this.users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

}