package com.qa.xmas;

import java.util.Scanner;

public class XmasPattern {
	
	public static void main(String[] args) {
		printTree();
	}
	
	public static void printTree() {
		int treeSize;
		Scanner s=new Scanner(System.in);
		System.out.println("How big do you want your xmas tree?");
		treeSize=s.nextInt();
		if (treeSize >=20) {
			System.out.println("Too big - choose a smaller number!");
		}
		else {
		for (int i = 0; i < treeSize; i++) {
			 for (int j = 0; j < treeSize - i; j++)
				 System.out.print(" ");
			   for (int k = 0; k < (2 * i + 1); k++)
			    System.out.print("*");
			   	System.out.println();
			  	}
			}
		}

}
