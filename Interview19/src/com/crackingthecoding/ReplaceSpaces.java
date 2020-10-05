package com.crackingthecoding;

public class ReplaceSpaces {

    public static void main(String[] args) {
        String input  = "Mr John Smith  ";
        //System.out.println(input.toCharArray());
        System.out.println(replaceSpaces(input.toCharArray(),13));
    }

    private static char[] replaceSpaces(char[] inputString, int trueLength) {
        int spaceCount = 0,index, i=0;

        for (i = 0;i<trueLength; i++){
            if (inputString[i] == ' ') {
                spaceCount++;
            }
        }

        index = trueLength + spaceCount * 2;

        char[] outputChar = new char[index];
        if (trueLength<inputString.length){
            inputString[trueLength] = '\0';
        }

        for (i = trueLength-1; i >= 0 ;i--){
            if (inputString[i] == ' '){
                outputChar[index-1] = '0';
                outputChar[index-2] = '2';
                outputChar[index-3] = '%';
                index = index-3;
            }
            else {
                outputChar[index-1] = inputString[i];
                index--;
            }
        }

        return outputChar;

    }
}
