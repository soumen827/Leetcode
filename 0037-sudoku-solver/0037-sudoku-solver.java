class Solution {
    static int check =0;
    public void solve(char[][]board,int row,int col){
        if(row==9){
            check=1;
        }
        else if(board[row][col]!='.'){ //faka nehi hay
            if(col!=8) solve(board,row,col+1); // last col na ho to
            else solve(board,row+1,0); // next row 1st col
        }else{ // ager . hay to
            for(char ch='1';ch<='9';ch++){
                if(isValid(board,row,col,ch)){
                    board[row][col] = ch;
                    if(col!=8) solve(board,row,col+1);
                    else solve(board,row+1,0);

                    if(check==1) return; // row pura var gaya(9 tak a gaya) to return ans a gaya
                    board[row][col] = '.'; // back tracking
            
                }
            }

        }
    }
    public boolean isValid(char[][] board,int row, int col,char num){
        // check row  // cpoy from privious problem
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
    public void solveSudoku(char[][] board) {
        solve(board,0,0);
        check =0;
    }
}