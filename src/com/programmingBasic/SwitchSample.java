package com.programmingBasic;

public class SwitchSample {

    public static void main(String[] args) {
        char value = 'D';
        switch(value){
            case 'A':
                System.out.println("Value is A");
                break;
            case 'B':
                System.out.println("Value is B");
                break;
            case 'C':
                System.out.println("Value is C");
                break;
            case 'D':
                System.out.println("Value is D");
                break;
            default:
                System.out.println("Value not found");
        }
    }

}
