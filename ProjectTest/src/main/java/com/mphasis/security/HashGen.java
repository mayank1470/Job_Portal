package com.mphasis.security;

import java.math.BigInteger;
import java.security.MessageDigest;

public class HashGen {
	public static String SHAGen(String plainText) {
		String cipherText=null;
		try {
			MessageDigest digest=MessageDigest.getInstance("SHA-512");
			byte[] intermData=digest.digest(plainText.getBytes());
			BigInteger bigNo=new BigInteger(1,intermData);
			cipherText=bigNo.toString(16);
			return cipherText;
		}
		catch(Exception exe) {
			exe.printStackTrace();
		}
		return cipherText;
	}

}
