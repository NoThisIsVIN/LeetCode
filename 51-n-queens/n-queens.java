class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        backtrack(0, board, res, new boolean[n], new boolean[2 * n], new boolean[2 * n]);
        return res;
    }

    private void backtrack(int row, char[][] board, List<List<String>> res, 
                           boolean[] cols, boolean[] diag1, boolean[] diag2) {
        if (row == board.length) {
            List<String> validBoard = new ArrayList<>();
            for (int i = 0; i < board.length; i++) {
                validBoard.add(new String(board[i]));
            }
            res.add(validBoard);
            return;
        }

        for (int col = 0; col < board.length; col++) {
            int id1 = row - col + board.length; 
            int id2 = row + col;                
            
            if (cols[col] || diag1[id1] || diag2[id2]) continue;

            board[row][col] = 'Q';
            cols[col] = true;
            diag1[id1] = true;
            diag2[id2] = true;

            backtrack(row + 1, board, res, cols, diag1, diag2);

            board[row][col] = '.';
            cols[col] = false;
            diag1[id1] = false;
            diag2[id2] = false;
        }
    }
}