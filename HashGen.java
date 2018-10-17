import java.math.BigInteger;
import java.security.MessageDigest;

public class HashGen {
public static String HashCodeGenerator(String inputString) {
	String cipherText=null;
	try {
		MessageDigest md=MessageDigest.getInstance("SHA-512");
		byte[] intermHash=md.digest(inputString.getBytes());
		BigInteger bigNo=new BigInteger(1,intermHash);
		cipherText=bigNo.toString(16);
		return cipherText;
		
	}catch(Exception exe) {
		exe.printStackTrace();
	}
	return cipherText;
}
}
