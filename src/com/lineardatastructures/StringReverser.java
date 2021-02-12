package com.lineardatastructures;
import java.util.Stack;
public class StringReverser {

    public String reverseString(String string){
        if(string==null)
            throw new IllegalArgumentException();
        Stack<Character> stack = new Stack<>();
        for(char c: string.toCharArray())
            stack.push(c);
        StringBuilder reversed = new StringBuilder();
        while(!stack.isEmpty()){
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }

}
