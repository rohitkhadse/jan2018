package com.string;

public class RemoveNumberFromString{
    public static void main(String[] args) {
        String str = "+42";

        System.out.println(myAtoi(str));

    }

    public static int myAtoi(String str) {
        StringBuffer sb = new StringBuffer(str);
        boolean flag = false;

        for(int i=0;i<sb.length();i++){
            if((i== 0) && !Character.isWhitespace(sb.charAt(i)) && (sb.charAt(i)>64 && sb.charAt(i)<123)){
                return 0;
            }

            if((i== 0) && !Character.isWhitespace(sb.charAt(i)) && (sb.charAt(i)<48 || sb.charAt(i)>57) && (sb.charAt(i) != 45 && sb.charAt(i) != 43)){
                return 0;
            }

            if(!Character.isWhitespace(sb.charAt(i)) && flag != true){
                flag = checkSign(sb.charAt(i));
            }

            if(sb.charAt(i)!= 46 && (sb.charAt(i)<48 || sb.charAt(i)>57)){
                sb.deleteCharAt(i);
                i--;
            }
        }

        if(sb.toString().isEmpty()){
            return 0;
        }

        if(flag){
            if(Double.parseDouble(sb.toString()) > Integer.MAX_VALUE){
                return -Integer.MIN_VALUE;
            }
            int number = (int)Double.parseDouble(sb.toString());
            return -number;
        }
        else{

            if(Double.parseDouble(sb.toString()) > Integer.MAX_VALUE){
                return Integer.MIN_VALUE;
            }
            int number = (int)Double.parseDouble(sb.toString());
            return number;
        }

    }


    public static boolean checkSign(char c){
        if(c == '-'){
            return true;
        }

        return false;
    }
}



/*
* old solution
* */

class Solution {
    public int myAtoi(String str) {
        int i =0;
        int num = 0;
        boolean isNeg = false;

        str = str.trim();


        if(str.charAt(0) == '-'){
            isNeg = true;
            i =1;
        }

        while(i < str.length()){
            num = num * 10;
            num = num + str.charAt(i++) - '0';
        }

        if(isNeg){
            num = -num;
        }

        return num;
    }
}
