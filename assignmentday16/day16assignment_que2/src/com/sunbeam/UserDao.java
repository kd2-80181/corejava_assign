package com.sunbeam;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao implements AutoCloseable {
	
	private Connection con;
	public UserDao() throws SQLException {
		con = DbUtil.getConnection();
	}

	@Override
	public void close() throws Exception {
		if( con != null) {
			con.close();
		}
		
	}
	
	//Add new User
	public int addUser(User u) throws Exception{
		String sql = "INSERT INTO users VALUES(default,?,?,?,?,?,false,'voter')";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			stmt.setString(1, u.getFirstName());
			stmt.setString(2, u.getLastName());
			stmt.setString(3, u.getEmail());
			stmt.setString(4, u.getPwd());
			java.sql.Date sdate = new java.sql.Date(u.getDob().getTime());
			stmt.setDate(5, sdate);
			int cnt = stmt.executeUpdate();
			return cnt;
		}		
	}

	//Delete Given User
	public int deleteUserById(User u) throws Exception {
		String sql = "DELETE FROM users WHERE id = ?";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			stmt.setInt(1, u.getId());
			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}
	
	//Update Given User 
	public int updateUserById(User u) throws Exception {
		String sql = "UPDATE users SET first_name=?,last_name=?,email=?,password=?,dob=?,status=?,role=? WHERE id=?";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			stmt.setString(1, u.getFirstName());
			stmt.setString(2, u.getLastName());
			stmt.setString(3, u.getEmail());
			stmt.setString(4, u.getPwd());
			java.sql.Date sdate = new java.sql.Date(u.getDob().getTime());
			stmt.setDate(5, sdate);
			stmt.setInt(6, 0);
			stmt.setString(7, "voter");
			stmt.setInt(8, u.getId());
			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}
	
	//Show All Users
	public List<User> showAllUsers() throws Exception {
		List<User> list = new ArrayList<User>();
		String sql = "SELECT * FROM users";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			try(ResultSet rs = stmt.executeQuery()){
				while(rs.next()) {
					int id = rs.getInt("id");
					String fname = rs.getString("first_name");
					String lname = rs.getString("last_name");
					String email = rs.getString("email");
					String passwd = rs.getString("password");
					java.util.Date udate = new java.sql.Date(rs.getDate("dob").getTime());
					int status = rs.getInt("status");
					String role = rs.getString("role");
					User u = new User(id,fname,lname,email,passwd,udate,status,role);
					list.add(u);
				}
			}
		}
		return list;
	}
}



