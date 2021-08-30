/*How do you check if a given string contains valid parentheses?
Given a string containing just the characters '(', ')', '{', '}',
 '[' and ']', write a function in Java or C++ to check if the input
 string is valid. The brackets must close in the correct order, "()" 
and "()[]{}" are all valid but "(]" and "([)]" are not*/

import java.util.Map;
import java.util.HashMap;
import java.util.Stack;

class String19 {
  public static boolean isValid(String str) {    
    Map<Character, Character> parenthesesMapping = new HashMap<>();
    parenthesesMapping.put('(', ')');
    parenthesesMapping.put('{', '}');
    parenthesesMapping.put('[', ']');

    Stack<Character> parentheses = new Stack<>();
    for(int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        if(parenthesesMapping.containsKey(c)) {
            parentheses.push(c);    
        } else {
            if(parentheses.isEmpty()) {
                return false;
            }
            char target = parentheses.pop();
            if(!parenthesesMapping.containsKey(target) || parenthesesMapping.get(target) != c) {
                return false;
            }
        }
    }
    if(!parentheses.isEmpty()) {
        return false;
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(isValid("([{}])"));
  }
}