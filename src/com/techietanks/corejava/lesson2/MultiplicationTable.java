package com.techietanks.corejava.lesson2;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		Scanner sc = new Scanner(System.in);
		int factor = sc.nextInt();

		for(i= 1;i<=10;i++) {
				System.out.print(i +" X " + factor + " = " + factor*i );
				System.out.print("\n");
			}

		

	}

}
