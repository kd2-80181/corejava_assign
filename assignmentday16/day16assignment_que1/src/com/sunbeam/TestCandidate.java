package com.sunbeam;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class TestCandidate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		try(CandidateDao dao = new CandidateDao()){
//			Candidate can = new Candidate();
//	    		System.out.print("Name: ");
//	    		String name = sc.next();
//	    		System.out.print("Party: ");
//	    		String party = sc.next();
//	    		System.out.print("No.of Votes: ");
//	    		int votes = sc.nextInt();
//	    		can.setName(name);
//	    		can.setParty(party);
//	    		can.setVotes(votes);
//	    		int cnt = dao.saveUser(can);
//	    		System.out.println("Rows Updated: "+cnt);
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		
//		try(CandidateDao dao = new CandidateDao()){
//			Candidate can = new Candidate();
//			System.out.println("Enter the Id to be updated: ");
//			int id = sc.nextInt();
//			System.out.println("Updated Name: ");
//			String name = sc.next();
//			System.out.println("Updated Party: ");
//			String party = sc.next();
//			System.out.println("Updated Votes: ");
//			int votes = sc.nextInt();
//			can.setId(id);
//			can.setName(name);
//			can.setParty(party);
//			can.setVotes(votes);
//			int cnt = dao.updateUser(can);
//			System.out.println("Rows Updated: "+cnt);
//		} 
//		catch (Exception e) {
//			e.printStackTrace();
//		}
		
		try(CandidateDao dao = new CandidateDao()){
			List<PartyVotes> list = dao.getPartywiseVotes();
			list.forEach(c -> System.out.println(c));
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
