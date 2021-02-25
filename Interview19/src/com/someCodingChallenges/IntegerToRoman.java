package com.someCodingChallenges;

public class IntegerToRoman {

    public static void main(String[] args) {

        int number  = 24, remainder, temp = number, quotient;
        String romanNumber = "";

        /*while (number != 0 ){
            remainder = number % 10;
            System.out.println(remainder);
            number = number/10;
        }*/

        for (int i = RomanNumeral.values().length-1; i>=0;--i){
            RomanNumeral romanEnum = RomanNumeral.values()[i];

            if (number >= romanEnum.getValue()){
                remainder = number % 10;
                quotient = number/10;

                if (quotient == 0){
                    quotient = remainder;
                }
                switch (quotient){
                    case 1 : romanNumber += romanEnum.getSymbol();
                    break;
                    case 2 : romanNumber += romanEnum.getSymbol() + romanEnum.getSymbol();
                    break;
                    case 3 : romanNumber += romanEnum.getSymbol() + romanEnum.getSymbol() + romanEnum.getSymbol();
                    break;
                    case 4 : romanEnum.getSymbol();
                }

                number = remainder;
            }
        }

        System.out.printf("Roman Number %s of %d: ",romanNumber,temp);
    }
}

enum RomanNumeral{

    ONE("I",1),
    FIVE("V",5),
    TEN("X",10),
    FIFTY("L",50),
    HUNDRED("C",100),
    FIVE_HUNDRED("D",500),
    THOUSAND("M",1000);

    private final String symbol;
    private final int value;


    RomanNumeral(String symbol, int value) {
        this.symbol = symbol;
        this.value = value;
    }

    public String getSymbol(){
        return symbol;
    }

    public int getValue(){
        return value;
    }
}