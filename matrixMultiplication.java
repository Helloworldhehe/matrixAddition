//Created by Robert Throne
//Algorithm to compute multiplication of 2 matrices

import java.util.*;

public class matrixMultiplication{
	public static void main(String[] args){
		//Input from user
		int row1 = new Scanner(System.in).nextInt();
		int row2 = new Scanner(System.in).nextInt();
		int col1 = new Scanner(System.in).nextInt();
		int col2 = new Scanner(System.in).nextInt();
		Scanner input = new Scanner(System.in);
		int i,j,k,sum;
		//Initialize the array
		int a[][] = new int[row1][col1];
		int b[][] = new int[row2][col2];
		int c[][] = new int[row1][col2];

		if(col1 != row2)
			throw new IllegalArgumentException("They must be equal");
		
		//Matrix A
		for(i = 0; i < row1; i++){
			for(j = 0; j < col1; j++){
				a[i][j] = input.nextInt();
			}
		}

		//Matrix B
		for(i = 0; i < row2; i++){
			for(j = 0; j < col2; j++){
				b[i][j] = input.nextInt();
			}
		}

		//Algorithm to multiply 2 matrices
		for(i = 0; i < row1; i++){
			for(j = 0; j < col2; j++){
				sum = 0;
				for(k = 0; k < row2; k++){
					sum = sum + (a[i][k] * b[k][j]);
				}
				c[i][j] = sum;
				System.out.println(c[i][j]);
			}
		}
	}
}