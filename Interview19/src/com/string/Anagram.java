package com.string;

import java.util.ArrayList;

public class Anagram {
    public static void main(String[] args) {

        String s = "aacc";
        String t = "aaca";

        System.out.println("Is Anagram : " + isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t) {
        ArrayList<Character> strArr = new ArrayList();

        if(s.length() != t.length())
        {
            return false;
        }
        for (int i=0;i<s.length();i++)
        {
            strArr.add(s.charAt(i));
        }

        for(int j=0;j<t.length();j++)
        {
            if(strArr.contains(t.charAt(j)))
            {
                strArr.remove(Character.valueOf(t.charAt(j)));
            }
        }

        if(strArr.isEmpty())
        {
            return true;
        }

        return false;
    }
}
