package com.programmingBasic;

import org.w3c.dom.ls.LSOutput;

public class ConvertStringToBoolean {
    public static void main(String[] args) {
        boolean checkValue;
        boolean test = false;
        String stringTest = "Y";
        test = Boolean.parseBoolean(stringTest);
        System.out.println(test);
    }
}
