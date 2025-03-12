package com.metacube.junit.JUnitAssignment;

import java.util.Scanner;

public class Maths {
	/**
	 * This Method is Helping us to find the Lcm of 2 numbers
	 * @param num1
	 * @param num2
	 * @param m
	 * @return LCM
	 */
	public int Lcm(int num1,int num2,int m) {
		if(num1==0||num2==0) {
			return 0;
		}
		m=m+num2;
		if(num1<0) {
			Math.abs(num1);
		}if(num2<0) {
			Math.abs(num2);
		}
		if((m%num1==0)&&(m%num2==0)) {
			return m;
		}
		return Lcm(num1,num2,m);
	}
	/**
	 * This Method is Helping us to find the Lcm of 2 numbers
	 * @param num1
	 * @param num2
	 * @param m
	 * @return LCM
	 */
	public static int LCMusingGCD(int num1,int num2) {
		
		return  Math.abs((num1*num2)/HCFusingGCD(num1, num2));	
	}
	/**
	 * This Method is Helping us to find the HCF of 2 numbers
	 * @param num1
	 * @param num2
	 * @param m
	 * @return LCM
	 */
	public static int HCFusingGCD(int num1,int num2) {
		if(num1==0||num2==0) {
			return Math.max(num1, num2);
		}
		//GCD(x,y)=GCD(y,x%y)
		if(num2==0) {
			return num1;
		}
		return Math.abs(HCFusingGCD(num2,num1%num2));
	}
	public static void main(String[] args) {
		Maths mat=new Maths();
		Scanner sc=new Scanner(System.in);
		System.out.println(" Maths Menu");
		System.out.println("\n1:Lcm using Method 1");
		System.out.println("2:Lcm Using GCD");
		System.out.println("3:HCF Using euclid algorithm");
		int choose=sc.nextInt();
		switch(choose) {
		case 1:
			System.out.println("Enter the number 1");
			int num1=sc.nextInt();
			System.out.println("Enter the number 2");
			int num2=sc.nextInt();
			int m=0;
			System.out.println("LCM:"+mat.Lcm(num1, num2, m));
			break;
		case 2:
			System.out.println("Enter the number 1");
			int num1_1=sc.nextInt();
			System.out.println("Enter the number 2");
			int num2_2=sc.nextInt();
			System.out.println("LCM:"+mat.LCMusingGCD(num1_1, num2_2));
			break;
		case 3:
			System.out.println("Enter the number 1");
			int numA=sc.nextInt();
			System.out.println("Enter the number 2");
			int numB=sc.nextInt();
			System.out.println("HCF:"+mat.HCFusingGCD(numA, numB));
			break;
		default:
			System.out.println("Enter Valid Number");
			
		}
	}
}
