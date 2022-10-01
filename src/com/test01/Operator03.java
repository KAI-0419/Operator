package com.test01;

import java.util.Scanner;

public class Operator03 {
	public static void main(String[] args) {
		Operator03 test = new Operator03();
		test.test1();
	}
	public void test1() {
		System.out.print("정수 하나 입력: ");
		int num = new Scanner(System.in).nextInt();
		
		System.out.print("1부터 100사이인지 확인: " + (1<=num && num<=100));
		
		System.out.println("1미만 or 100초과인지 확인: " + (num<1 || num>100));
		
		System.out.println("\n\n");
		
		System.out.print("문자를 입력하시오: ");
		char ch = new Scanner(System.in).next().charAt(0);
		System.out.print("대소문자 구분: " + (ch >= 'A' && ch <= 'Z'));
		
		System.out.println("--------------");
		System.out.print("계속 하시려면 y 혹은 Y를 입력하시오..");
		
		char ch2 = new Scanner(System.in).next().charAt(0);
		System.out.println("입력 하신 문자는.." + (ch2 == 'y' || ch2 == 'Y'));
	}
}
