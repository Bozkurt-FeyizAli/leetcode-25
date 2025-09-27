import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> generateParenthesis(int n) {
        return generateParenthesisRec(n, "");
    }

    public List<String> generateParenthesisRec(int n, String s) {
        List<String> result = new ArrayList<>();
        if (n == 0) {
            result.add(s);
            return result;
        }
        result.addAll(generateParenthesisRec(n - 1, s + "("));
        result.addAll(generateParenthesisRec(n - 1, s + ")"));
        return result;
    }
} 
