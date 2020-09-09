package com.string;

import java.util.HashMap;
import java.util.Map;

class MyClass
{
    private Map<String,Integer> map;

    public MyClass() {
        map = new HashMap<>();
        map.put("foo", 1);
        map.put("bar", 3);
    }

    public int getValue(String input, int numRetries) throws Exception {
        try {
            return map.get(input);
        }
        catch (Exception e) {
            if (numRetries > 3) {
                throw e;
            }
            return getValue(input, numRetries + 1);
        }
    }
}

class Study{
    public static void main(String[] args) throws Exception {
        MyClass myClass = new MyClass();
        myClass.getValue("foo", 0);
        myClass.getValue("bar", 2);
        myClass.getValue("baz", 0);
        //myClass.getValue("fubar", 1);
    }
}
