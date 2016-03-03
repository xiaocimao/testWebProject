package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test1 {
	// public static void main(String[] args) throws IOException {
	// try {
	// BufferedReader reader = new BufferedReader(new FileReader(new
	// File("d:\\banks.txt")));
	// PrintWriter writer = new PrintWriter(new FileWriter(new
	// File("d:\\banks1.txt")));
	// String bankInfo = reader.readLine();
	// String finalBankInfo = "";
	// while (null != bankInfo) {
	// String[] bankInfoArray = bankInfo.split(" ");
	// finalBankInfo = "{code:\"" + bankInfoArray[0] + "\",name:\"" +
	// bankInfoArray[1] + "\"},";
	// writer.println(finalBankInfo);
	// bankInfo = reader.readLine();
	// }
	// writer.close();
	// reader.close();
	// } catch (FileNotFoundException e) {
	// e.printStackTrace();
	// }
	// }
	public static String generateHiddenBankCardNo(String bankCardNo) {
		StringBuilder builder = new StringBuilder();
		String frontNumber = bankCardNo.substring(0, bankCardNo.length() - 4);
		String endNumber = bankCardNo.substring(bankCardNo.length() - 4);
		for (int i = 0; i < frontNumber.length(); i++) {
			builder.append("*");
		}
		builder.append(endNumber);
		return builder.toString();
	}
	
	public static String generateHiddenIDCard(String IDCard) {
		StringBuilder builder = new StringBuilder();
		String frontNumber = IDCard.substring(0, 4);
		builder.append(frontNumber);
		for (int i = 0; i < IDCard.length()-5; i++) {
			builder.append("*");
		}
		builder.append("X");
		return builder.toString();
	}

	public static void main(String[] args) {
		int isAuthentication = -1;
		boolean ownerVerified = isAuthentication==0?false:(isAuthentication==1?true:false);
		
		System.out.println(ownerVerified);
//		String str = "210682198409296795";
//		System.out.println(generateHiddenBankCardNo(str));
//		System.out.println(generateHiddenIDCard(str));
	}
}
