package com.java.practoice;
import java.util.*;
public class LoopStatements {
	public static void main(String[] args) {
	int[] arr = new int[5];
	Scanner se = new Scanner(System.in);
	for(int i=0;i<5;i++) {
		arr[i] = se.nextInt();
	}
	for(int j=0;j<arr.length;j++) {
		System.out.println(arr[j]);
	}
}
}
