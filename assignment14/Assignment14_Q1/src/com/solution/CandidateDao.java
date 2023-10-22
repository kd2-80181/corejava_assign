package com.solution;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CandidateDao implements AutoCloseable {

	private Connection con;

	public CandidateDao() throws SQLException {
		con = DbUtil.getConnection();
	}

	@Override
	public void close() {
		try {
			if(con!=null) {
			con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Candidate> getAll() throws SQLException {
		String sql = "SELECT * FROM candidates";
		List<Candidate> list = new ArrayList<>();
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String party = rs.getString("party");
					int votes = rs.getInt("votes");

					Candidate c = new Candidate(id, name, party, votes);
					list.add(c);
				}
			} // stmt.close()
		} // rs.close()
		return list;
	}

	public int save(Candidate c) throws SQLException {
		String sql = "INSERT INTO candidates VALUES(default,?,?,?)";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, c.getName());
			stmt.setString(2, c.getParty());
			stmt.setInt(3, c.getVotes());
			int cnt = stmt.executeUpdate();
			return cnt;
		} // stmt.close()
	}

	public Candidate getCandidateById(int id) throws SQLException {
		String sql = "SELECT * FROM candidates WHERE id=?";
		Candidate c1 = new Candidate();
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, id);
			try (ResultSet rs = stmt.executeQuery()) {
				while(rs.next()) {
				c1.setId(rs.getInt("id"));
				c1.setName(rs.getString("name"));
				c1.setParty(rs.getString("party"));
				c1.setVotes(rs.getInt("votes"));
				}
			} // rs.close()
		} // stmt.close()

		return c1;

	}

	public int update(Candidate c) throws SQLException {
		String sql = "UPDATE candidates SET name=?,party=? WHERE id=?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, c.getName());
			stmt.setString(2, c.getParty());
			stmt.setInt(3, c.getId());

			int cnt = stmt.executeUpdate();
			return cnt;
		} // stmt.close()
	}
	
	public List<PartyVotes> getPartywiseVotes()throws SQLException
	{
		
		String sql="SELECT party,sum(votes) as totalVotes from candidates GROUP BY party";
		List<PartyVotes> list=new ArrayList<>();
		
		try(PreparedStatement stmt=con.prepareStatement(sql))
		{
			try(ResultSet rs=stmt.executeQuery())
			{
				while(rs.next())
				{
					String party=rs.getString("party");
					int votes=rs.getInt("totalVotes");
					PartyVotes pv=new PartyVotes(party,votes);
					list.add(pv);
				}
			}//rs.close()
		}//stmt.close()
		
		return list;
	}

}
