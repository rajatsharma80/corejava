package com.programmingBasic;

public class EvenNumber {
    public static void main(String[] args) {
       int i = 2;
        while(i != 10){
            if (isEvenNumber(i)) {
                System.out.println(i + " number is even");
            }else{
                System.out.println(i + " number is odd");
            }
            i++;
        }
    }
    public static boolean isEvenNumber(int number){
        if(number % 2 == 0){
            return true;
        }
        return false;
    }
}
