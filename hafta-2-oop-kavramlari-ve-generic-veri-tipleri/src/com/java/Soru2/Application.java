package com.java.Soru2;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		int M, N, T;
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Satır ve Sütun Numaralarını Giriniz..");
		M = scan.nextInt();
		N = scan.nextInt();
		T = scan.nextInt();
		
		int[][] firstMatrice = new int[N][M];
		int[][] secondMatrice = new int[M][T];
		
		System.out.println("First Matrice");
		for(int i=0; i<firstMatrice.length; i++) {
			for(int j=0; j<firstMatrice[i].length; j++) {
				firstMatrice[i][j] = (int) (Math.random()*10);
				System.out.print(firstMatrice[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Second Matrice");
		for(int i=0; i<secondMatrice.length; i++) {
			for(int j=0; j<secondMatrice[i].length; j++) {
				secondMatrice[i][j] = (int) (Math.random()*10);
				System.out.print(secondMatrice[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Multiply Matrice");
		GenericMatrix<Integer> multiply = new GenericMatrix<Integer>();
		multiply.multiplyMatrices(firstMatrice, secondMatrice);
		

	}
}
