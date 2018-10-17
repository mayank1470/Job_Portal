package com.mphasis.security;

import java.math.BigInteger;
import java.security.MessageDigest;

public class HashGen {
	public static String HashGen(String inputVal) {
		String cipherText=null;
		
		try {
			MessageDigest md=MessageDigest.getInstance("SHA-512");
			byte[] intermData=md.digest(inputVal.getBytes());
			BigInteger no=new BigInteger(1, intermData);
			cipherText=no.toString(6);
			return cipherText;
			
		}catch(Exception exe) {
			exe.printStackTrace();
		}
		return cipherText;
		
	}
}
