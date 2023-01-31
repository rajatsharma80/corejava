package com.programmingBasic;

public class SampleString {

    public static void main(String[] args){
        String nameString = "My name is Rajat ";
        nameString = nameString + "I am an engineer and ";
        String calString = "10";
        int myInt = 50;

        calString = calString + myInt;
        System.out.println(nameString + " I am learning Java \u00A9");
        System.out.println("calString is " + calString);
    }
}
