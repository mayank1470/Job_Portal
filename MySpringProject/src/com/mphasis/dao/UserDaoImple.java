package com.mphasis.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mphasis.model.CompanyUsers;

import com.mphasis.myutils.MyUtility;

public class UserDaoImple implements UserDao {

	@Override
	public List<CompanyUsers> getUsers() {
		List<CompanyUsers> users = new ArrayList<CompanyUsers>();
		Session session=MyUtility.getMySessionFactory().openSession();
		Transaction t = session.beginTransaction();
		 users = (List<CompanyUsers>)session.createQuery("from CompanyUsers").list();
		 System.out.println(users);
		
		
//		Connection con; User user=null;
//		try {
//			con = MyUtility.getMydataSource().getConnection();
//
//			String sql="select * from user where username=?";
//			
//				PreparedStatement pst=con.prepareStatement(sql);
//				pst.setString(1, userName);
//				ResultSet rst=pst.executeQuery();
//				while(rst.next())
//				{
//					if(user==null)
//					{
//						user=new User();
//						user.setUid(rst.getLong("uid"));
//						user.setUserName(rst.getString("username"));
//						user.setRoles(rst.getString("roles"));
//					} 
//				}
//			
//		} catch (SQLException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
	
		return users;
	}

	@Override
	public boolean ValidUser(CompanyUsers userPassed,CompanyUsers usersReceived) {
		if(userPassed.getUserName().equals(usersReceived.getUserName())&&userPassed.getPassword().equals(usersReceived.getPassword())) {
			return true;
		}else {
			return false;
			
		}
		
		
	}

	
}
