package com.proje.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.proje.db.DBConnection;

@Configuration
public class AppConfig {
	
//	@Bean
//	public DBConnection dbConnection() {
//		DBConnection dbConnection=new DBConnection();
//		dbConnection.setUrl("mysql.localhost");
//		dbConnection.setUsername("sevval");
//		dbConnection.setPw("");
//		return dbConnection;
//	}
	
	@Bean
	public DBConnection dbConnection() {
		DBConnection dbConnection=new DBConnection("mysql.localhost", "bsevvall","1245");
		return dbConnection;
	}

}
