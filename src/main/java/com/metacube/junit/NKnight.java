 package com.metacube.junit.JUnitAssignment;

import java.util.Arrays;

public class NKnight {
	public static void printGrid(int[][] grid) {
	    for (int[] row : grid) {
	        for (int num : row) {
	            System.out.printf("%3d ", num);
	        }
	        System.out.println();
	    }
	}
	public boolean helper(int [][] grid,int row,int col,int num, boolean[][] visited) {
		int n=grid.length;
		//Base Case
		//If we came to last grid we need to return True
		if(num==n*n)return true;
		int i,j;
		//2 Up 1 right
		int[][] moves = {
	            {-2, 1}, {-2, -1}, {2, 1}, {2, -1},
	            {-1, 2}, {1, 2}, {-1, -2}, {1, -2}
	        };
		for (int[] move : moves) {
            int nextRow = row + move[0];
            int nextCol = col + move[1];
            if (nextRow >= 0 && nextRow < n && nextCol >= 0 && nextCol < n && !visited[nextRow][nextCol]) { // Check if visited
                visited[nextRow][nextCol] = true; 
                if (helper(grid, nextRow, nextCol, num + 1, visited)) {
                    return true;
                }
                visited[nextRow][nextCol] = false;
            }
        }

        return false;
    }
	//We are making helper because we need more number of parameter
	/**
	 * Checking the Valid Grid to place N knight
	 * @param grid
	 * @return
	 */
	public boolean checkValidGrid(int[][] grid) {
        int n = grid.length;
        if (grid[0][0] != 0) return false;

        boolean[][] visited = new boolean[n][n];
        for(boolean[] row : visited) {
            Arrays.fill(row, false);
        }

        visited[0][0] = true; 
        return helper(grid, 0, 0, 1, visited);
    }
	
	public static void main(String[] args) { 
		NKnight knight = new NKnight();
	int[][] validGrid1 = { {0, 3, 6, 9, 12}, 
				{7, 10, 1, 4, 15}, 
				{2, 5, 8, 11, 16}, 
				{13, 18, 21, 24, 19}, 
				{22, 25, 20, 17, 14} };
	printGrid(validGrid1); 
	System.out.println("Result: " + knight.checkValidGrid(validGrid1)); 
	System.out.println();

	}


}
