package controller;

public class user {
	private String user_id;
	private String name;
	private String username;
	private String password;
	
	/**
	 * @param user_id
	 * @param name
	 * @param username
	 * @param password
	 */
	public user() {
		
	}
	public user(String user_id, String name, String username, String password) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.username = username;
		this.password = password;
	}
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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

}
