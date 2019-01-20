package leetcode.bruteforce;

import java.util.Arrays;

public class ValidSudoku_36 {
	
	/*
	 * 브루트포스로 확인
	 * 가로/세로/정사각형에서 1~9번이 겹치지 않는지 확인 
	 * */
	
	 public boolean isValidSudoku(char[][] board) {
        boolean[] check = new boolean[9];
        for(int i=0;i<3;i++) {
            for(int j=0;j<9;j++) {
                Arrays.fill(check,  false);
        
                for(int k=0;k<9;k++) {
                    int b=0;
                    if(i==0) {
                        if(board[j][k]=='.') continue;
                        b=Character.getNumericValue(board[j][k]); 
                    }
                    else if(i==1) {
                        if(board[k][j]=='.') continue;
                        b=Character.getNumericValue(board[k][j]);
                    }
                    else if(i==2) {
                        if(board[j/3*3+k%3][j%3*3+k/3]=='.') continue;
                        b=Character.getNumericValue(board[j/3*3+k%3][j%3*3+k/3]);
                    }
                    if(check[b-1])
                        return false;
                    check[b-1] = true;
                }
            }
        }
        return true;
    }
}
