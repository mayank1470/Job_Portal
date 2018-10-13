package com.mphasis.myutility;

import java.sql.Connection;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;

public class MyUtility {
	private static Connection con=null;
	private static DataSource mydataSource;

	public static DataSource getMydataSource() {
		return mydataSource;
	}
	public static void setMydataSource(DataSource mydataSource) {
		MyUtility.mydataSource = mydataSource;
	}
	public static SessionFactory mySessionFactory;

	public static SessionFactory getMySessionFactory() {
		return mySessionFactory;
	}
	public static void setMySessionFactory(SessionFactory mySessionFactory) {
		MyUtility.mySessionFactory = mySessionFactory;
	}
}
