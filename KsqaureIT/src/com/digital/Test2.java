package com.digital;
import java.io.IOException;
import java.util.Scanner;

public class Test2 {
    public static void main (String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String a: ");
        String a = scanner.next();
        System.out.println("Enter String b: ");
        String b = scanner.next();

        System.out.println("Merged String are : "+MergeStrings(a,b));
    }

    public static String MergeStrings(String a,String b){
        StringBuffer mergedString = new StringBuffer();
        for(int i=0;i<a.length() && i<b.length() ;i++){
            mergedString.append(a.charAt(i)).append(b.charAt(i));
        }
        //for remaining String
        if (a.length() < b.length()){
            mergedString.append(b.substring(a.length(),b.length()));
        }else{
            mergedString.append(a.substring(b.length(),a.length()));
        }
        return mergedString.toString();
    }
}
