package com.techietanks.corejava.lesson1;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, j;
		for(i=1; i<=30;i++) {
			for(j=1;j<=10;j++) {
				System.out.print(i +" X " + j + " = " + i*j );
				System.out.print("\n");
			}
			System.out.print("---------------------\n");
		}
		

	}

}
