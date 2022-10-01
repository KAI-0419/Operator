package com.practice;

import java.util.Scanner;

public class Example {
	public void sample1(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Korean 점수: ");
		int Korean = sc.nextInt();
		System.out.print("English 점수: ");
		int English = sc.nextInt();
		System.out.print("Math 점수: ");
		int Math = sc.nextInt();
		
		int Total = (Korean + English + Math);
		int Average = ((Korean + English + Math)/3);
		
//		if(Total >= 40 && Average >= 60) {
//			System.out.println("합격입니다!");
		
		String res = (Total >= 40 && Average >= 60)?"합격입니다":"불합격입니다.";
		System.out.println(res);
		}
//	}
	
	public void sample2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("성별(M/F):");
		char gender = sc.next().charAt(0);
		
		String res = (gender == 'M' || gender == 'm')? "남학생" : "여학생" ;
		System.out.println(res);
		
		System.out.print("학생 이름: ");
		String name = sc.next();
		
		System.out.print("학년: ");
		int grade = sc.nextInt();
		
		System.out.print("반: ");
		int room = sc.nextInt();
		
		System.out.print("번호: ");
		int num = sc.nextInt();
		
		System.out.print("성적: ");
		double mark = sc.nextDouble();
		
		System.out.println(gender + name + "은 " + grade + "학년 " + room + "반 " + num + "번 이고," + " 성적은" + mark + "이다.");
	}
	
	public void sample3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int test = sc.nextInt();
		String str = (test > 0)?"양수다.":"양수가 아니다.";
		System.out.println("결과값은: "+str);
	}
	
	public void sample4() {
		Scanner sc = new Scanner(System.in);
		String str = null;
		System.out.println("정수를 입력하세요: ");
		int a = sc.nextInt();
		str = (a%2==0)?"짝수다.":"홀수다.";
		System.out.println(str);
	}
	
	
}
