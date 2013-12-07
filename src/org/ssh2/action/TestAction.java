package org.ssh2.action;

import org.ssh2.service.UserService;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -654264884825043600L;

	private UserService uService;
	
	public UserService getuService() {
		return uService;
	}
	public void setuService(UserService uService) {
		this.uService = uService;
	}

	@Override
	public String execute() throws Exception {
		System.out.println("Printf TEST");
		System.out.println(uService.list().get(0).getEmail());
		return SUCCESS;
	}
	
}
