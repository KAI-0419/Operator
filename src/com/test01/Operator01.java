package com.test01;

import java.util.Scanner;

public class Operator01 {
	public static void main(String[] args) {
//		Operator01.test();
		Operator01.test2();
		Operator01.test3();
	}
//	public static void test() {
//		System.out.println("true의 부정: " + !true);
//		System.out.println("false의 부정: " +  !false);
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("정수 입력: ");
//		int num = sc.nextInt();
//		
//		System.out.println("입력한 정수가 짝수?: "+ (num%2 == 0));
//		System.out.println("입력한 정수가 짝수?: "+ !(num%2 != 0));
//		
//		System.out.println("입력한 정수가 양수?: "+ (num > 0));
//		System.out.println("입력한 정수가 양수?: "+ !(num > 0));
//		}
	public static void test2() {
		int age = 19;
		
		System.out.println("현재 나이는?" + age);
		
		++age;
		System.out.println("++age 결과?" + age);

		age++;
		System.out.println("age++ 결과?" + age);
		
		--age;
		System.out.println("--age 결과?" + age);

		age--;
		System.out.println("age-- 결과?" + age);

		int num = 20;
		
		int res = ++num;
		System.out.println("res 결과?" + res);
		System.out.println("num 결과?" + num);
		
		int num2 = 20;
		int res2 = num2++;
		System.out.println("res2:" + res2);
		System.out.println("num2 결과?" + num2);
		
		int num3 = 20;
		int res3 = num3++ *3;
		System.out.println("res3 결과?" + res3);
		
		int num4 = 20;
		int res4 = ++num4 *3;
		System.out.println("res4 결과?" + res4);
	}
	
	public static void test3() {
		int num1 = 10;
		int num2 = 3;
		
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
	}
}
