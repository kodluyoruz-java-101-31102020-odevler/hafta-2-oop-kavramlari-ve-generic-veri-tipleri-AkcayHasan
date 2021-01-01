package com.java.Soru2;

public class GenericMatrix <T extends Number> { 
		
	public int[][] multiplyMatrices(int[][] firstMatrice, int[][] secondMatrice){

		int[][] resultMatrice = new int[firstMatrice.length][secondMatrice[0].length];
        for (int i= 0 ; i< firstMatrice.length; i++){
            for (int j=0; j< secondMatrice[0].length; j++){
            	resultMatrice[i][j] = 0;
                for (int k=0; k< firstMatrice[0].length; k++){
                    resultMatrice[i][j] += firstMatrice[i][k] * secondMatrice [k][j];
                }
                System.out.print(resultMatrice[i][j] + " ");
            }
            System.out.println();
        }
        
        return resultMatrice;
	}
	
		
}



/*
	public int[][] multiplyMatrices(int[][] firstMatrice, int[][] secondMatrice){

			int[][] resultMatrice = new int[firstMatrice.length][secondMatrice[0].length];
	        for (int i= 0 ; i< firstMatrice.length; i++){
	            for (int j=0; j< secondMatrice[0].length; j++){
	            	resultMatrice[i][j] = 0;
	                for (int k=0; k< firstMatrice[0].length; k++){
	                    resultMatrice[i][j] += firstMatrice[i][k] * secondMatrice [k][j];
	                }
	                System.out.println(resultMatrice[i][j] + " ");
	            }
	            System.out.println();
	        }
	        
	        return resultMatrice;
		}
*/