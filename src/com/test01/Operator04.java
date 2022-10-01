package com.test01;

import java.util.Scanner;

public class Operator04 {
	public static void main(String[] args) {
		Operator04.test1();
		Operator04.test2();
	}
	public static void test1() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 하나 입력:");
		int num = scan.nextInt();
		
//		String str = (num >= 0) ? "양수" : "음수";
		
		String str = (num >= 0) ? "양수" : (num==0) ? "0이다." : "음수";
		
		System.out.println(str);
	}
	public static void test2() {
//		Scanner scan = new Scanner(System.in);
//		int a = scan.nextInt();
		int num = 12;
		System.out.println("num: " + num);
		
		num += 3;
		System.out.println("num: " + num);
		
		num -= 5;
		System.out.println("num: " + num);
		
		num *= 2;
		System.out.println("num: " + num);

		num /= 5;
		System.out.println("num: " + num);
		
		num %= 2;
		System.out.println("num: " + num);

	}
}
