package com.qa.xmas;

public class XmasPattern {
	
	public static void main(String[] args) {
		printTree();
	}
	
	public static void printTree() {
		int treeSize = 5;
		for (int i = 0; i < treeSize; i++) {
			 for (int j = 0; j < treeSize - i; j++)
				 System.out.print(" ");
			   for (int k = 0; k < (2 * i + 1); k++)
			    System.out.print("*");
			   	System.out.println();
			  	}
		}

}
