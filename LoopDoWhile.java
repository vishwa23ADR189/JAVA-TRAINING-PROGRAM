package com.java.practoice;
import java.util.Scanner;
public class LoopDoWhile {

	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner scan =new Scanner(System.in);
		for(int i=0;i<5;i++) {
			arr[i]= scan.nextInt();
		}
		int j=0;
		do{
			System.out.println(arr[j]);
			j++;
		}while(j<5);
		int k=0;
		while(k<5) {
			System.out.println(arr[k]);
			k++;
		}
		

	}

}
