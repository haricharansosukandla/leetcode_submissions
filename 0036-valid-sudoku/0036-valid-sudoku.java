class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashSet<Character> seen = new HashSet<>();
        HashSet<Character> seenc = new HashSet<>();

        // Check rows and columns
        for (int i = 0; i < 9; i++) {

            seen.clear();
            seenc.clear();

            for (int j = 0; j < 9; j++) {

                // Row check
                if (board[i][j] != '.') {

                    if (board[i][j] < '1' || board[i][j] > '9') {
                        return false;
                    }

                    if (!seen.add(board[i][j])) {
                        return false;
                    }
                }

                // Column check
                if (board[j][i] != '.') {

                    if (board[j][i] < '1' || board[j][i] > '9') {
                        return false;
                    }

                    if (!seenc.add(board[j][i])) {
                        return false;
                    }
                }
            }
        }

        // Check 3 × 3 boxes
        for (int startRow = 0; startRow < 9; startRow += 3) {

            for (int startCol = 0; startCol < 9; startCol += 3) {

                HashSet<Character> set = new HashSet<>();

                for (int i = startRow; i < startRow + 3; i++) {

                    for (int j = startCol; j < startCol + 3; j++) {

                        if (board[i][j] != '.') {

                            if (board[i][j] < '1' || board[i][j] > '9') {
                                return false;
                            }

                            if (!set.add(board[i][j])) {
                                return false;
                            }
                        }
                    }
                }
            }
        }

        return true;
    }
}