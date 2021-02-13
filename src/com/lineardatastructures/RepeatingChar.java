package com.lineardatastructures;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

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

    public char firstRepeatingCharacter(String string){
        Set<Character> set = new HashSet<>();
        for(char c: string.toCharArray())
        {
            if(set.contains(c))
                return c;
            set.add(c);
        }
        return Character.MAX_VALUE;

    }

}
