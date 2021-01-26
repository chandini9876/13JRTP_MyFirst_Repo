package com.ashokit.security;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class securityUtils {
	public static String encode(String plainText) {
		Encoder encoder=Base64.getEncoder();
		return encoder.encodeToString(plainText.getBytes());
		}
	public static String decode(String encodedText) {
		//@git squash example task1 is doing
		Decoder decoder=Base64.getDecoder();
		byte[] decodedtxt=decoder.decode(encodedText);
		return new String(decodedtxt);
		
	}
	public static void main(String[] args) {
		String encode=securityUtils.encode("ashokit");
		System.out.println(encode);
		String decode=securityUtils.decode(encode);
		System.out.println(decode);
	}
 

}
