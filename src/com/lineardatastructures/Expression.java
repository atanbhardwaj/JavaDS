package com.lineardatastructures;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Expression {

    private final List<Character> leftBracket = Arrays.asList('(','{','[','<');
    private final List<Character> rightBracket = Arrays.asList(')','}',']','>');

    public boolean paranthesisMatch(String string){
        Stack<Character> stack = new Stack<>();

        for(char ch: string.toCharArray()){
            if(isLeftBracket(ch))
                stack.push(ch);
            else if(isRightBracket(ch)){
                if(stack.isEmpty()) return false;

                char top = stack.pop();
                if(!match(ch, top))
                    return false;
            }
        }
        return stack.isEmpty();
    }

    private boolean isLeftBracket(char ch){
        return leftBracket.contains(ch);
    }

    private boolean isRightBracket(char ch){
        return rightBracket.contains(ch);
    }

    private boolean match(char left, char right){
        return leftBracket.indexOf(left) == rightBracket.indexOf(right);
    }

}
