package com.java.practoice;
import java.util.Scanner;
public class FizzBuzz {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for(int i=1;i<=50;i++) {
			if(i%3==0) {
				System.out.println("Fizz");
			}
			else if(i%5==0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}
		}
	}
}
