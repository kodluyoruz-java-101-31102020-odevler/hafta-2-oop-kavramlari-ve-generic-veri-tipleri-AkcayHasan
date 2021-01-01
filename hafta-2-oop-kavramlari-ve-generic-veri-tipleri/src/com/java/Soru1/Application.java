package com.java.Soru1;

public class Application {

	static void spiralPrint(int m, int n, int a[][] ) {
		
		int i, k=0, l=0;
		/*  
		k - starting row index
        m - ending row index
        l - starting column index
        n - ending column index
        i - iterator
        */
		
		while (k<m && l<n) {
			for(i=l; i<n; i++) {
				System.out.print(a[k][i]+ " ");
			}
			k++;
			for(i=k; i<m; i++) {
				System.out.print(a[i][n-1]+ " ");
			}
			n--;
			for(i=n-1; i>=l; i--) {
				System.out.print(a[m-1][i]+ " ");
			}
			m--;
			for(i=m-1; i>=k; i--) {
				System.out.print(a[i][l]+ " ");
			}
			l++;
		}
		
	}
	
	public static void main(String[] args) {
		
		int r=5;
		int c=5;
		
		int a[][] = {
				{1,2,3,4,5},
				{16,17,18,19,6},
				{15,24,25,20,7},
				{14,23,22,21,8},
				{13,12,11,10,9}				
		};
		
		spiralPrint(r, c, a);

	}

}
