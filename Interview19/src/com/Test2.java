package com;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {

    public static void main(String[] args) {
        List<Long> listOfInteger = Arrays.asList(1L,2L);

        long x = 1;

        System.out.println(listOfInteger.toString());

        //System.out.println(reverse(input));
    }

    public static String reverse(int [] input) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0;i<100;i++)
        {
            if (i < input.length-1 && input[i]!= i)
            {
                sb.append(i);
                sb.append(",");
            }


        }

        return sb.toString();

    }
}
