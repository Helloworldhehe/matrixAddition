@ Author: Robert Throniste
@ Created: 8/10/2016 

import java.util.*;

public class matrixAdd{
	public static void main(String[] args){
		int rows = new Scanner(System.in).nextInt(); //number of rows
		int columns = new Scanner(System.in).nextInt(); //number of columns
		Scanner input = new Scanner(System.in);
		int i,j;

		int x[][] = new int[rows][columns];
		int y[][] = new int[rows][columns];
		int z[][] = new int[rows][columns];

		//input elements into matrix X
		for(i = 0; i < rows; i++){
			for(j = 0; j < columns; j++){
				x[i][j] = input.nextInt();
			}
		}

		//Input elements into matrix B
		for(i = 0; i < rows; i++){
			for(j = 0; j < columns; j++){
				y[i][j] = input.nextInt();
			}
		}

		//Add 2 matrix together
		for(i = 0; i < rows; i++){
			for(j = 0; j < columns; j++){
				z[i][j] = x[i][j] + y[i][j];
			}
		}

		//Print that out
		for(i = 0; i < rows; i++){
			for(j = 0; j < columns; j++){
				System.out.println(z[i][j]);
			}
		}
	}


}