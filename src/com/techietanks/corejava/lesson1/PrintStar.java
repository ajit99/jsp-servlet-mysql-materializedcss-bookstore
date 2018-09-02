package com.techietanks.corejava.lesson1;

public class PrintStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, j;
		for(i=0; i<9;i++) {
			for(j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		

	}

}
