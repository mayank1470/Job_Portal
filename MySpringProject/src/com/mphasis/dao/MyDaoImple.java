package com.mphasis.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mphasis.model.User;
import com.mphasis.myutility.MyUtility;


public class MyDaoImple implements MyDao {

	@Override
	public User getUser(String username) {
		Connection con;
		User user=null;
		try {
			con = MyUtility.getMydataSource().getConnection();
		
		
		String sql="select * from companyLogin where usn=?";
		
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1,username);
			ResultSet rst=pst.executeQuery();
			while(rst.next()){
				if(user==null){
					user=new User();
					user.setUsername(rst.getString("username"));
					
				}
			}
		
		/*if(user==null){
					user=new User();
					user.setUserName(userName);
					user.setPassword("bogus");
					user.setUid(0L);                        
					user.setRoles("fraud");
				}*/
				
			} catch (SQLException e) {
			
			e.printStackTrace();
		}
		System.out.println(user);
		return user;
	

}
}

