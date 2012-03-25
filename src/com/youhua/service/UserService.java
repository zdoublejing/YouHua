package com.youhua.service;

import com.youhua.bean.user.Orginfo;
import com.youhua.bean.user.User;
import com.youhua.dao.UserDAO;

public class UserService{
	private UserDAO userdao;
	
	public boolean login(User user) throws Exception{
		boolean flag=false;
		if(userdao.checkUser(user.getUserName(), user.getPassword())){
			flag=true;
			}
		return flag;
	}
	
	public String getOrgid(User user) throws Exception{
		//String temp = "5SS242 85";
		Orginfo orginfo = userdao.getOrginfo(user.getUserName());
		//System.out.println(orginfo.getOrgId());
		return orginfo.getOrgId();
	}
	
	public String getOrgname(User user) throws Exception{
		Orginfo orginfo = userdao.getOrginfo(user.getUserName());
		return orginfo.getOrgName();
	}
	
	public void setUserdao(UserDAO userdao) {
		this.userdao = userdao;
	}
	
}