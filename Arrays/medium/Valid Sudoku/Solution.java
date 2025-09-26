import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            if(hasDuplicateRow(board, i)) return false;
        }
        for (int i = 0; i < board.length; i++) {
            if(hasDuplicateColumn(board, i)) return false;
        }
        if(hasDuplicateAll9(board)) return false;
        return true;
    }

    public static boolean hasDuplicateRow(char[][] row, int n){
        Set<Character> set= new HashSet<>();
        int l=0;
        for (char c : row[n]) {
            if(c != '.'){ set.add(c);
            l++;}
        }
        return l!=set.size();
    }

    public static boolean hasDuplicateColumn(char[][] row, int n){
        Set<Character> set= new HashSet<>();
        int l=0;
        for (int i = 0; i < row.length; i++) {
            char c = row[i][n];
            if(c != '.'){set.add(c);
            l++;}
        }
        return l!=set.size();
    }

    public static boolean hasDuplicate9(char[][] arr, int frx, int fry){
        Set<Character> set= new HashSet<>();
        int l=0;
        for (int i = fry; i <fry+3; i++) {
            for (int j = frx; j < frx+3; j++) {
                char c = arr[i][j];
                if(c != '.'){set.add(c);
                l++;}
            }
        }
        return l!=set.size();
    }

    public static boolean hasDuplicateAll9(char[][] arr){
        for (int i = 0; i < 9; i+=3) {
            for (int j = 0; j < 9; j+=3) {
                if(hasDuplicate9(arr, i, j)) return false;
            }
        }
        return true;
    }
}