package com.youhua.action;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;

import com.youhua.service.UserService;
import com.youhua.bean.user.User;

@SuppressWarnings("serial")
public class UserAction extends ActionSupport {
    /**
     * @author jean
     */
	
    private String username;
    private String password;
	private String orgid;
	private String orgname;
	
	private UserService userService;

	public String login() throws Exception{
		User user=new User();
		user.setUserName(username);
		user.setPassword(password);
		boolean result=this.userService.login(user);
		if(result){
			HttpServletRequest request = ServletActionContext.getRequest();
			request.getSession().setAttribute("username", username);
			request.getSession().setAttribute("password", password);			        	
			this.setOrgid(this.userService.getOrgid(user));
			request.getSession().setAttribute("orgid", orgid);
			this.setOrgname(this.userService.getOrgname(user));
			request.getSession().setAttribute("orgname", orgname);//记录用户信息
			return "success";
		}else return "error";

	}

	public String logout() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		request.getSession().removeAttribute("username");
		return "success";
	}
  
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

	public String getOrgid() {
		return orgid;
	}

	public void setOrgid(String orgid) {
		this.orgid = orgid;
	}

	public String getOrgname() {
		return orgname;
	}

	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
