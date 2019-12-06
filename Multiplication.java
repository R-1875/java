package Array;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		
		int n;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the order of square matrix");
		
		n = scn.nextInt();
		
		int[][] a = new int[n][n];
		int[][] b = new int[n][n];
		int[][] c = new int [n][n];
		
		System.out.println("Enter elements of Matrix A: ");
		
 		for(int i = 0; i < n; i++)
 		{
 			for(int j = 0; j < n; j++)
 			{
 				a[i][j] = scn.nextInt();
 			}
 		}
 		
 		System.out.println("Enter elements of Matrix B: ");
 		
 		for(int i = 0; i < n; i++)
 		{
 			for(int j = 0; j < n; j++)
 			{
 				b[i][j] = scn.nextInt();
 			}
 		}
 		
 		for(int i = 0; i < n ; i++)
 		{
 			for(int j = 0; j < n; j++)
 			{
 				
 				for(int k = 0; k < n; k++)
 				{
 					
 					c[i][j] += a[i][k] * b[k][j];
 				}
 				
 			}
 			
 		}
 		
 		System.out.println("Result of multiplication of Matrix A and Matrix B is: ");
 		
 		for(int i = 0; i < n; i++)
 		{
 			for(int j = 0; j < n; j++)
 			{
 				System.out.print(c[i][j]+ " ");
 			}
 			System.out.println();
 		}
	}

}
