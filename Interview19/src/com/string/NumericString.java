package com.string;

public class NumericString {
    public static void main(String[] args) {
        String s = "adadsa";
        System.out.println(checkNumericString(s));
    }

    private static boolean checkNumericString(String string) {

        try {
            if (string != null && (Integer.parseInt(string) > 0 && Integer.parseInt(string) < 9)) {
                return true;
            }
            else {
                return false;
            }
        }
        catch (NumberFormatException e){
            return false;
        }

    }
}
