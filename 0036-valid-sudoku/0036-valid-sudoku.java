class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j] == '.') continue; // ager pehele sehi . ho to continue
                char num  = board[i][j];
                board[i][j] = '.';
                if(isValid(board,i,j,num)==false) return false;
                board[i][j] = num;
            }
        }
        return true;
    }
    public boolean isValid(char[][] board,int row, int col,char num){
        // check row
        int n = board.length;
        for(int j=0;j<n;j++){
            if(board[row][j]==num) return false;
        }
         // check col
        for(int i=0;i<n;i++){
            if(board[i][col]==num) return false;
        }
        // Check 3*3 Box
        int Bigrow = (row/3)*3;
        int Bigcol = (col/3)*3;
        for(int i=Bigrow;i<Bigrow+3;i++){
            for(int j=Bigcol;j<Bigcol+3;j++){
                if(board[i][j]==num) return false;
            }
        }
        return true;
    }
}