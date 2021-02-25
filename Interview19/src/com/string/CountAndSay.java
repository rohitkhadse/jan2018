package com.string;

/**
 * @author : Rohit Khadse
 * @created : 2020-12-30 , 21:06
 **/
public class CountAndSay {

    public static void main(String[] args) {
        System.out.println(countAndSay(3));
    }

    private static String countAndSay(int n) {

        int count = 1;

        String s = "";
        String str = "";
        while (count <= n){
            if (count==1){
                s = s + "1";
            }
            else {
                char c []= s.toCharArray();
                int charCount = 0;


                for (int i = 0 ;i<c.length ; i++){
                    if (i ==0) {
                        charCount++;
                    }
                    if (c[i] == c[i-1]){
                        charCount++;
                    }
                    else{
                        str = charCount +""+c[i-1];
                    }
                }

                s = str;
            };
            count++;
        }

        return s;
    }
}
