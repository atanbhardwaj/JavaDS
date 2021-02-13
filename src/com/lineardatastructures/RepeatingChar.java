package com.lineardatastructures;
import java.util.Map;
import java.util.HashMap;

public class RepeatingChar {

    public char firstNonRepeatingCharacter(String string){
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = string.toCharArray();
        for(char c: chars)
        {
            int count = map.getOrDefault(c, 0);
            map.put(c, count+1);
        }
        for(char c: chars){
            if(map.get(c)==1)
                return c;
        }
        return Character.MIN_VALUE;
    }

}
