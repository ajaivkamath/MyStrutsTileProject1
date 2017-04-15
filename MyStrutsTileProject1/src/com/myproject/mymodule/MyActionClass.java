package com.myproject.mymodule;

import java.util.List;

import com.myproject.mybean.MyLoginBean;
import com.myproject.mydao.LoginDAO;

public class MyActionClass {
	
	MyLoginBean lBean;
	LoginDAO loginDao;
	List<MyLoginBean> lUserList;

	public String execute()
	{
		System.out.println("execute");
		return "SUCCESS";
	}
	
	public List<MyLoginBean> getlUserList() {
		return lUserList;
	}


	public MyActionClass() {
		loginDao = new LoginDAO();
	}
	
	
	public MyLoginBean getlBean() {
		return lBean;
	}


	public void setlBean(MyLoginBean lBean) {
		this.lBean = lBean;
	}


	public String registerProcess()
	{
		String result =loginDao.registerBean(lBean);
		System.out.println("registerProcess: " + result);
		return result;
	}
	
	
	public String loginProcess()
	{
		String result = loginDao.verifylogin(lBean);
		System.out.println("loginProcess: " + result);
		return result;
	}
	
	public String userListPrint()
	{
		lUserList = loginDao.getUserList();
		
		System.out.println("userListPrint: " + lUserList.size());
		for (MyLoginBean lBean  : lUserList)
		{
			System.out.println(lBean.getStrFullName());
		}
		return "SUCCESS";
		
	}
	

}
