package com.someCodingChallenges;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153;
        //int num = 5;

        System.out.println(checkArmstrongNumber(num));
    }

    private static boolean checkArmstrongNumber(int num) {

        int lengthOfInt = String.valueOf(num).length();

        //all single digits are Armstrong Numbers
        if (lengthOfInt==1){
            return true;
        }

        int sum = 0, temp = num;

        for (int i =0;i<3;i++){
            sum = sum + (int) Math.pow((num % 10), lengthOfInt);
            num = num/10;
        }

        System.out.println(sum);

        return sum == temp;
    }
}
