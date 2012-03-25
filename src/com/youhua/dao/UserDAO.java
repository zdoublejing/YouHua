package com.youhua.dao;

import com.youhua.bean.user.Orginfo;

public interface UserDAO{
	public boolean checkUser(String username,String password);
	public Orginfo getOrginfo(String username);
}