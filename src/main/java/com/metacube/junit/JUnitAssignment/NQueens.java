package com.metacube.junit.JUnitAssignment;

import java.util.Arrays;

public class NQueens {
	//Size and Dimensions of our array 4 and 4X4
	public static int SIZE=4;
	/**
	 * This Method is used to print our array
	 * @param arr
	 */
	public static void printBoard(int [][] arr) {
		for(int i=0;i<SIZE;i++) {
			for(int j=0;j<SIZE;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	/**
	 * This Method is checking wheater is it safe to place the queen or not
	 * on our chessBoard
	 * @param chessBoard
	 * @param Row
	 * @param Column
	 * @return true/false
	 */
	public static boolean isSafe(int[][] chessBoard,int Row,int Column) {
		//Column Check 
		for(int i=0;i<Row;i++) {
			if(chessBoard[i][Column]==1) {
				return false;
			}
		}
		//Upper Left Diagonal Check
		for(int i=Row,j=Column;i>=0&&j>=0;i--,j--) {
			if(chessBoard[i][j]==1) {
				return false;
			}
		}
		//Upper Right Diagonal Check
		for(int i=Row,j=Column;i>=0&&j<SIZE;i--,j++) {
			if(chessBoard[i][j]==1) {
				return false;
			}
		}
		return true;
	}
	/**
	 * 
	 * @param chessBoard
	 * @param 1st Row of our chessBoard
	 */
	public static void nQueenSolution(int[][] chessBoard,int Row) {
		//Termination Condition 
		//Else infinite Rule
		//if Row reaches to the size of the array then we get all our solution
		if(Row==SIZE) {
			printBoard(chessBoard);
			return;
		}
		//We will use for loop to iterate over each and every column on particular row
		for(int column=0;column<SIZE;column++) {
			//Weather is it safe to place the queen on the particular cell or not
			//Actual Logic of Recursion
			/**
			 * If issafe() function returns true means wheather is it safe to place
			 * queen at particular row and column
			 */
			if(isSafe(chessBoard, Row, column)) {
				//if Safe then we are placing 1 
				chessBoard[Row][column]=1;
				//If not we are moving forward 
				nQueenSolution(chessBoard, Row+1);
				/**
				 * If we find that we have placed our queen wronglywe have to undo
				 * our solution and for undoing we are changing our value form 1 to 0
				 */
				chessBoard[Row][column]=0;
			}
		}
	}
	public static void main(String[] args) {
		int [] [] chessBoard=new int[SIZE][SIZE];
		
		for(int row=0;row<SIZE;row++) {
			Arrays.fill(chessBoard[row], 0);
		}
		nQueenSolution(chessBoard, 0);
		
	}

}
