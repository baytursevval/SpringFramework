package com.proje.db;

public class DBConnection {
	
	private String url;
	private String username;
	private String pw;
	

	public DBConnection(String url, String username, String pw) {
		this.url = url;
		this.username = username;
		this.pw = pw;
	}

	public void openConnection() {
		System.out.println("url: "+url);
		System.out.println("username: "+username);
		System.out.println("pw: "+ pw);
		System.out.println("db acıldı");
	}
	
	public void closeConnection() {
		System.out.println("db kapandı");
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	
	
	
}
