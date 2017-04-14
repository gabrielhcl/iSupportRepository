package com.yongyou.iSupport.entity;
/**
 * 
 * houcl
 * 2017/3/30
 */

public class User {
    private Integer pk_user;
    private String usercode;
    private String password;
    private String username;
    private String usertype;
    private String usercnname;
    private String userphone;
    private String useremail;
    private String usersex;
    private String userarea;
    private String userdept;

	public Integer getPk_user() {
		return pk_user;
	}

	public void setPk_user(Integer pk_user) {
		this.pk_user = pk_user;
	}

	public String getUsercode() {
		return usercode;
	}

	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	public String getUsercnname() {
		return usercnname;
	}

	public void setUsercnname(String usercnname) {
		this.usercnname = usercnname;
	}

	public String getUserphone() {
		return userphone;
	}

	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public String getUsersex() {
		return usersex;
	}

	public void setUsersex(String usersex) {
		this.usersex = usersex;
	}

	public String getUserarea() {
		return userarea;
	}

	public void setUserarea(String userarea) {
		this.userarea = userarea;
	}

	public String getUserdept() {
		return userdept;
	}

	public void setUserdept(String userdept) {
		this.userdept = userdept;
	}
    
    

}