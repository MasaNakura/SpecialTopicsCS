import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {


    // Complete the braces function below.
    static String[] braces(String[] values) {
        String[] result = new String[values.length];
 
        for (int i = 0; i < values.length; i++) {
            result[i] = "YES";
            Stack<Character> check = new Stack<Character>();
            for (int j = 0; j < values[i].length(); j++) {
                Character brace = values[i].charAt(j);
                if(brace == '[' || brace == '{' || brace == '(') {
                    check.push(brace);
                } else {
                    if(check.isEmpty()) {
                        result[i] = "NO";
                        j = values[i].length();
                    } else {
                        char open = check.pop();
                        if ((open != '[' && brace == ']')|| (open != '{' && brace == '}')
                            || (open != '(' && brace ==')')) {
                            result[i] = "NO";
                            j = values[i].length();
                        }
                    }
                }
            }
            if (!check.isEmpty()) {
                result[i] = "NO";
            }   
        }
        return result;
    }
