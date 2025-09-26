import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        int sum='1'+'2'+'3'+'4'+'5'+'6'+'7'+'8'+'9';
        // for (int i = 0; i < board.length; i++) {
        //     if(sumRow(board, i)!=sum) return false;
        // }
        // for (int i = 0; i < board.length; i++) {
        //     if(sumColumn(board, i)!=sum) return false;
        // }
        for (int i = 0; i < board.length; i++) {
            if(hasDuplicateRow(board, i)) return false;
        }
        for (int i = 0; i < board.length; i++) {
            if(hasDuplicateColumn(board, i)) return false;
        }
        return true;
    }

    // public static int sumRow(char[][] row, int n){
    //     int res=0;
    //     for (char c : row[n]) {
    //         res+=c;
    //     }
    //     return res;
    // }
    // public static int sumColumn(char[][] row, int n){
    //     int res=0;
    //     for (int i = 0; i < row.length; i++) {
    //         res+=row[i][n];
    //     }
    //     return res;
    // }

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

    public static boolean hasDuplicate9(char[][] arr){
        Set<Character> set= new HashSet<>();
        int l=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                char c = arr[i][j];
                if(c != '.'){set.add(c);
                l++;}
            }
        }
        return l!=set.size();
    }
    
}