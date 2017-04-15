package com.myproject.mydao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.myproject.mybean.MyLoginBean;


public class LoginDAO {
	
	private SessionFactory sFactory;
	private Session session;
	
	public LoginDAO()
	{
		if (sFactory == null)
		{
			sFactory = new Configuration().configure()
			        .buildSessionFactory();
		}		
		session=sFactory.openSession();
	}
	
	public String verifylogin(MyLoginBean lBean)
	{
		
		List<MyLoginBean> myList;
		session.beginTransaction().begin();
		
		Query q1 = session.createQuery("from MyLoginBean where strUserName = :uname");
		q1.setString("uname", lBean.getStrUserName());
		myList = q1.list();
		
		session.beginTransaction().commit();
		
		if (myList.size() != 1)
		{
			return "FAILURE";
		}
		else
		{
			MyLoginBean lBean2 = myList.get(0);
			
			if (lBean2.getStrPassword().equals(lBean.getStrPassword()))
				return "SUCCESS";
			else
				return "FAILURE";
		}
		
		
	}

	
	public List<MyLoginBean> getUserList()
	{
		List<MyLoginBean> myList;
		
		Query q1 = session.createQuery("from MyLoginBean");
		myList = q1.list();
		
		return myList;		
		
	}
	
	
	public String registerBean(MyLoginBean lBean)
	{
		try
		{
			session.beginTransaction().begin();
			session.save(lBean);
			session.beginTransaction().commit();
			return "SUCCESS";

		}
		catch (Exception e)
		{
			e.printStackTrace();
			return "FAILURE";
			
		}
	}
	
	
}
