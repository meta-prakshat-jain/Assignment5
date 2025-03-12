package com.metacube.junit.JUnitAssignment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class NQueensTest {
	NQueens NQ=new NQueens();
	@Test 
	public void emptyBoard_Test() {
		int [][] chessBoard=new int[NQ.SIZE][NQ.SIZE];
		assertTrue(NQueens.isSafe(chessBoard, 0, 0));
		//Checking the True 
		//Answer must come True
	}
	@Test
	public void Queens_SameColumn() {
		int [][] chessBoard=new int[NQ.SIZE][NQ.SIZE];
		assertTrue(NQueens.isSafe(chessBoard, 1, 0));
		//Checking the True 
		//Answer must come True
	}

	@Test
	public void UpperLeft_Diagonal() {
		int [][] chessBoard=new int[NQ.SIZE][NQ.SIZE];
		chessBoard[0][0]=1;
		assertFalse(NQ.isSafe(chessBoard, 1, 1));
		assertFalse(NQ.isSafe(chessBoard, 2, 2));
		assertFalse(NQ.isSafe(chessBoard, 3, 3));
		//Answer must come False
	}
	@Test
	public void UpperRight_Diagonal() {
		int [][] chessBoard=new int[NQ.SIZE][NQ.SIZE];
		chessBoard[0][3]=1;
		assertFalse(NQ.isSafe(chessBoard, 1, 2));
		assertFalse(NQ.isSafe(chessBoard, 2, 1));
		assertFalse(NQ.isSafe(chessBoard, 3, 0));
		//Answer must come False
	}
	@Test 
	public void validPositions() {
		int [][] chessBoard=new int[NQ.SIZE][NQ.SIZE];
		chessBoard[0][0]=1;
		assertTrue(NQ.isSafe(chessBoard, 1, 2));
	}

}
