package com.programmingBasic;

public class OperatorChallenge {

    public static void main(String[] args){
        double firstDoubleNbr = 20.00;
        double secondDoubleNbr = 80.00;
        double calDoubleNbr = (firstDoubleNbr + secondDoubleNbr) * 100.00;  //10,000
        double remainderNbr = calDoubleNbr % 40.00;
        boolean isRemainderNbr = remainderNbr == 0.00 ? true : false;

        System.out.println("isRemainderNbr is ----> " + isRemainderNbr);

        if(!isRemainderNbr){
            System.out.println("Got some remainder");
        }


    }
}
