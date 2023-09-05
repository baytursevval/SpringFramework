package com.proje.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proje.db.DBConnection;

public class TestSpring {

	public static void main(String[] args) {
		
		BeanFactory beanFactory=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		DBConnection dbConnection=(DBConnection) beanFactory.getBean("dbConnection");
		dbConnection.openConnection();
		dbConnection.closeConnection();
		
		
		//2.yol
		ConfigurableApplicationContext configurableApplicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		DBConnection dbConnection2=(DBConnection) configurableApplicationContext.getBean("dbConnection");
		dbConnection2.openConnection();
		dbConnection2.closeConnection();
		configurableApplicationContext.close();
		
		
		//3.yol
		AbstractApplicationContext abstractApplicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		DBConnection dbConnection3=abstractApplicationContext.getBean("dbConnection",DBConnection.class);
		dbConnection3.openConnection();
		dbConnection3.closeConnection();
		abstractApplicationContext.close();
		
		//4.yol
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		DBConnection dbconnection4=(DBConnection) applicationContext.getBean("dbConnection");
		dbconnection4.openConnection();
		dbconnection4.closeConnection();
	}

}
