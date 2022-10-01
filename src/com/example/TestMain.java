package com.example;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		TestMain test = new TestMain();
		test.example1();
		test.example2();
		test.example3();
		}
	public void example1(){
		Scanner sc = new Scanner(System.in);
		System.out.print("두 개의 정수를 입력하시오: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("더하기 결과 :" + (a + b));
		System.out.println("빼기 결과 :" + (a - b));
		System.out.println("곱하기 결과 :" + (a * b));
		System.out.println("나누기한 몫 :" + (a / b));
		System.out.println("나누기한 나머지 :" + (a % b));
	}
	public void example2(){
		Scanner sc = new Scanner(System.in);
		System.out.print("가로와 세로 길이를 입력하시오: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		System.out.println("사각형의 면적은: " + (a * b));
		System.out.print("사각형의 둘레는: " + (a+b)*2);
	}
	public void example3(){
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하시오: ");
		String Value = sc.next();
		System.out.print("첫번째 문자 : " + Value.charAt(0));
		System.out.print("두번째 문자 : " + Value.charAt(1));
		System.out.print("세번째 문자 : " + Value.charAt(2));
		System.out.print("입력된 글자 갯수 : " + Value.length());
	}
}
