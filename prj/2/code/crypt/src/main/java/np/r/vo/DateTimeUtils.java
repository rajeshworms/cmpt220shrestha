package np.r.vo;

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class DateTimeUtils {
	
	
	public static String getCurrentDate(){
		SimpleDateFormat newFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		
		String dateString = newFormat.format(new Date());
		BigInteger bi = new BigInteger(dateString);
		bi =bi.multiply(new BigInteger("100000"));
		bi = bi.add(new BigInteger(new Random().nextInt(999)+""));
		
		return bi.toString();
		
		
	}
	
	public static void main(String [] args){
	
		for(int i =0;i<=122;i++){
			BigInteger bi = new BigInteger(getCurrentDate());
			bi =bi.multiply(new BigInteger("100000"));
			bi = bi.add(new BigInteger(new Random().nextInt(999)+""));
		//	System.out.println(bi);
			System.out.println(getCurrentDate());
		}
		
		
	}

}
