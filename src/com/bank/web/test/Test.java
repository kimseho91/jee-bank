package com.bank.web.test;

import java.util.Random;

public class Test {
	
	public static void main(String[] args) {
		Random ran = new Random();
		String seqNum = "";
		seqNum = "NO." + ran.nextInt(9999) + "/";
		System.out.println(seqNum);
	}

}
