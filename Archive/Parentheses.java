import java.util.Stack;

import java.util.*;

public class Parentheses {

    public static void main(String[] args) {
        int i = 0;
        if(i.equals(0)){
            System.out.println("no");
        }
        parenthesis(2);

    }

    public static void parenthesis(int n) {
        List<String> sols = new ArrayList<>();
        StringBuilder parenthesis = new StringBuilder();
        Stack<String> tracker = new Stack<>();
        parenthesesHelper(parenthesis, sols, tracker, n);
        System.out.print("[" );
        for (int i = 0; i < sols.size() - 1; i++){
            System.out.print("\"" + sols.get(i) + "\", ");
        }
        System.out.println("\"" + sols.get(sols.size() - 1) + "\"]");
    }

    public static void parenthesesHelper(StringBuilder parenthesis, List<String> sols, Stack<String> tracker, int N) {
        if (parenthesis.length() == N * 2) {
            if(tracker.isEmpty()) {
                sols.add(parenthesis.toString());
            }   
        } else {
            if (!tracker.isEmpty()) {
                parenthesis.append(")");
                tracker.pop();
                parenthesesHelper(parenthesis, sols, tracker, N);
                tracker.push("(");
                parenthesis.delete(parenthesis.length() - 1, parenthesis.length());
            } 
            parenthesis.append("(");
            tracker.push("(");
            parenthesesHelper(parenthesis, sols, tracker, N);
            tracker.pop();
            parenthesis.delete(parenthesis.length() - 1, parenthesis.length());
        }
    }
}