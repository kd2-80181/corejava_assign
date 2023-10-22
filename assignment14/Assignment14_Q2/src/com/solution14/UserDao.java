package com.solution14;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDao implements AutoCloseable {

	private Connection conn;

	public UserDao() throws SQLException {
		conn = DBUtil.getConnection();
	}

	@Override
	public void close() {
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<User> getAll() throws SQLException {
		String sql = "SELECT * FROM users";
		List<User> list = new ArrayList<>();
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					int id = rs.getInt("user_id");
					String fname = rs.getString("fname");
					String lname = rs.getString("lname");
					String email = rs.getString("email");
					String password = rs.getString("password");

					java.sql.Date sdate = rs.getDate("bdate");
					java.util.Date bdate = new Date(sdate.getTime());

					boolean status = rs.getBoolean("status");
					String role = rs.getString("role");

					User user = new User(id, fname, lname, email, password, bdate, status, role);

					list.add(user);
				}
			}
		}
		return list;
	}

	public int deleteUser(int id) throws SQLException {
		
		String sql = "DELETE FROM users WHERE user_id=?";
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, id);
			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}
	
	public int updateUser(User user)throws SQLException
	{
		String sql="UPDATE users SET fname=?,lname=?,email=?,password=?,bdate=?,status=?,role=? WHERE user_id=?";
		try(PreparedStatement stmt=conn.prepareStatement(sql))
		{
			stmt.setString(1, user.getFname());
			stmt.setString(2, user.getLname());
			stmt.setString(3, user.getEmail());
			stmt.setString(4, user.getPassword());
			
			java.util.Date udate=user.getBdate();
			java.sql.Date sdate=new java.sql.Date(udate.getTime());
			stmt.setDate(5, sdate);
			
			stmt.setBoolean(6, user.isStatus());
			stmt.setString(7,user.getRole());
			stmt.setInt(8,user.getUser_id());
			
			
			int cnt=stmt.executeUpdate();
			System.out.println(sql);
			return cnt;
			
		}
	}
	
	public int addUser(User user)throws Exception
	{
		String sql="INSERT INTO users VALUES(default,?,?,?,?,?,?,?)";
		try(PreparedStatement stmt=conn.prepareStatement(sql))
		{
			stmt.setString(1, user.getFname());
			stmt.setString(2, user.getLname());
			stmt.setString(3, user.getEmail());
			stmt.setString(4, user.getPassword());
			
			java.util.Date udate=user.getBdate();
			java.sql.Date sdate=new java.sql.Date(udate.getTime());
			
			stmt.setDate(5, sdate);
			
			stmt.setBoolean(6, user.isStatus());
			stmt.setString(7,user.getRole());
			
			int cnt=stmt.executeUpdate();
			return cnt;
			
		}
	}
}
