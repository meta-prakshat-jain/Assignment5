package com.metacube.junit.JUnitAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Search {
	public int BinarySearch(int [] arr,int st,int end,int Target) {
		
		if(arr.length<=0||arr==null) {
			throw new AssertionError("You have not intialized the array or the array is empty");
		}
		if(st>end) {
			return -1;
		}
		int mid=(st+end)/2;
		if(arr[mid]==Target) {
			return mid;
		}
		if(arr[mid]>Target) {
			return BinarySearch(arr, st, mid-1, Target);
			
		}else {
			return BinarySearch(arr, mid+1, end, Target);
		}
	
	}
	public int LinearSearch(int[] arr,int Target,int index) {
		int Length=arr.length;
		if(arr.length<=0||arr==null) {
			throw new AssertionError("You have not intialized the array or the array is empty");
		}
		//Base Case
		if(index>=arr.length) return 0;
		
		//Self Work
		if(arr[index]==Target) return index;
		
		//Sub-Problem
		return LinearSearch(arr, Target, index+1);
		
		
	}
	public static boolean exist(int[] arr ,int target) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Search search=new Search();
		Scanner sc=new Scanner(System.in);
		System.out.println("Search Menu");
		System.out.println("\n1:Linear Search");
		System.out.println("2:Binary Search");
		int choose=sc.nextInt();
		sc.nextLine();
		switch(choose) {
		case 1:
			System.out.println("Enter the size of an array");
			int sizeOfArray=sc.nextInt();
//			if(sizeOfArray<=0) {
//			System.out.println("The Size of an array Cannot be negative");
//			}
			System.out.println("Enter the Array");
			int[] arr=new int[sizeOfArray];
			for(int i=0;i<sizeOfArray;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println("Target");
			int target=sc.nextInt();
			if(exist(arr, target)) {
				try {
				System.out.println("Index"+search.LinearSearch(arr, target, 0));
			}catch(AssertionError e) {
				e.getMessage();
			}
			}
			else {
				System.out.println("Target Does Not exist in our array");
			}
				
		case 2:
			System.out.println("Enter the length of our array");
			int sizeOfArray2=0;
			try {
			sizeOfArray2=sc.nextInt();
			}catch(NegativeArraySizeException e) {
				e.getMessage();
			}
			
			System.out.println("Enter the Array");
			int[] arr2=new int[sizeOfArray2];
			for(int i=0;i<sizeOfArray2;i++) {
				arr2[i]=sc.nextInt();
			}
			System.out.println("Target");
			int target2=sc.nextInt();
			if(exist(arr2, target2)) {
				try {
				Arrays.sort(arr2);
				System.out.println("Index:"+search.BinarySearch(arr2, 0,arr2.length-1,target2));
			}catch(AssertionError e) {
				e.getMessage();
			}
			}
			else {
				System.out.println("Target Does Not exist in our array");
			}
		default:
			System.out.println("Invalid Choice Please Enter either 1 or 2");
			
		}
		
		
	}

}

