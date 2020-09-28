package com.facebookweb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.facebookweb.entity.RegistrationEntity;

public class ResgistrationDao implements RegistrationDaoInterface{

	
//-------------------------------------------------ADD TO THHE DATABASE------------------------------------------------
	private Connection con;
	public ResgistrationDao() {
		
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			con=DriverManager.getConnection("jdbc:derby:d:/Facebookwebdb;create=true","sophia","sophia");
			
		}
		catch(ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public int addToDatabaseDao(RegistrationEntity uai) {
		int i=0;
		try {
			PreparedStatement ps=con.prepareStatement("insert into REGISTRATION values(?,?,?,?,?)");
			ps.setString(1, uai.getName());
			ps.setString(2, uai.getPassword());
			ps.setString(3, uai.getEmail());
			ps.setString(4, uai.getPhone());
			ps.setString(5, uai.getCountry());
			
			//step 4 executeQuery
			i=ps.executeUpdate();
							
			
		}
		catch(SQLException ee) {
			ee.printStackTrace();
		}
		return i;
		

	}

	
	
//---------------------------------------------------LOGIN-----------------------------------------------------------------
	@Override
	public boolean loginProfileDao(RegistrationEntity fe) {
		boolean i=false;
		try {
			PreparedStatement ps=con.prepareStatement("select * from REGISTRATION where name=? and password=?");
			ps.setString(1, fe.getName());
			ps.setString(2, fe.getPassword());
			
			
			//step 4 executeQuery
			ResultSet res=ps.executeQuery();
			if(res.next()) {
				i=true;
			}
	
		}
		catch(SQLException ee) {
			ee.printStackTrace();
		}
		return i;
	}
	

//----------------------------------------------------FRIENDLIST-----------------------------------------------------------
	@Override
	public List<RegistrationEntity> friendProfileDao(RegistrationEntity fe) {
		List<RegistrationEntity> ll=new ArrayList<RegistrationEntity>();
		RegistrationEntity f=new RegistrationEntity();
		f.setName("mohan");
		f.setPhone("+917735448836");
		
		RegistrationEntity f1=new RegistrationEntity();
		f1.setName("Chunnilal");
		f1.setPhone("+918826192528");
		
		ll.add(f1);
		ll.add(f);
		return ll;
	}
	

}
