class Solution {
    public boolean exist(char[][] board, String word) {
        char first = word.charAt(0);
        int total = board.length * board[0].length;
        Set<Integer> used = new HashSet<Integer>();
        for(int i = 0; i < total; i++) {
            int row = i / board[0].length;
            int column = i - row * board[0].length;
            if (board[row][column] == first) {
                if (exist(board, word, row, column, "", used)) {
                    return true;
                }
                used.clear();
            }
        }
        return false;
    }
    
    public boolean exist(char[][] board, String word, int row, int column, 
                         String curr, Set<Integer> used) {
        if (curr.length() == word.length()) {
            if (curr.equals(word)) {
                return true;
            }
        } else {
            if (!curr.equals(word.substring(0, curr.length()))) {
                return false;
            }
            if (row < 0 || row >= board.length || column < 0 || column >= board[0].length) {
                return false;
            }
            int index = row * board[0].length + column;
            String character = Character.toString(board[row][column]);
            if(!used.contains(index)) {
                used.add(index);
                if (exist(board, word, row - 1, column, curr + character, used) ||
                    exist(board, word, row + 1, column, curr + character, used) ||
                    exist(board, word, row, column - 1, curr + character, used) ||
                    exist(board, word, row, column + 1, curr + character, used)){
                        return true;
                }
                used.remove(index);
            }
        } 
        return false;
    }  
}