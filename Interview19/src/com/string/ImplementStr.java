package com.string;

/**
 * @author : Rohit Khadse
 * @created : 2020-12-29 , 21:58
 **/
public class ImplementStr {
    public static void main(String[] args) {
        String haystack = "hello", needle = "ll";

        System.out.println(strStr(haystack, needle));
    }

    private static int strStr(String haystack, String needle) {
        if (haystack.isEmpty() && needle.isEmpty()) {
            return 0;
        }

        int output = 0;
        String match = "";


        for (int i = 0; i < haystack.length(); i++) {
            if (match.equals(needle)){
                return output;
            }
            for (int j = 0; j < needle.length(); j++) {
                if (needle.charAt(j) == haystack.charAt(i)){
                    output = i;
                    match = match + haystack.charAt(i);
                    i++;
                }
                else{
                    break;
                }
            }
        }


        if (match.equals(needle)){
            return output - (needle.length()-1);
        }
        else{
            return -1;
        }

    }
}
