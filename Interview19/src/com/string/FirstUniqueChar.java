package com.string;

import java.util.LinkedHashMap;
import java.util.Set;

public class FirstUniqueChar {
    public static void main(String[] args) {

        System.out.println(firstUniqChar("loveleetcode"));
    }

    public static int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> lmap = new LinkedHashMap<Character,Integer>();

        for (int i = 0; i<s.length();i++)
        {
            if(lmap.containsKey(s.charAt(i)))
            {
                int count = lmap.get(s.charAt(i));
                lmap.put(s.charAt(i), count +1);
            }
            else
            {
                lmap.put(s.charAt(i),1);
            }
        }

        System.out.println(lmap);

        Set<Character> setKeys = lmap.keySet();

        for(Character key: setKeys)
        {
            if(lmap.get(key) == 1)
            {
                return s.indexOf(key);
            }
        }

        return -1;
    }
}
