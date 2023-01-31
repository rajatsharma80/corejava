package com.programmingBasic;

public class ByteShortIntLong {

    public static void main(String[] args){

        int myMinInValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        int test = 2_147_483_647;
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        long myLongInt = 100;
        long myLongIntMax = 2147483648L;
        byte myByteNumber = (byte)(myMinByteValue/2);
        float myMinFloat = Float.MIN_VALUE;
        float myMaxFloat = Float.MAX_VALUE;
        double myMinDouble = Double.MIN_VALUE;
        double myMaxDouble = Double.MAX_VALUE;

        System.out.println("myMinLongValue: " + myMinLongValue);
        System.out.println("myMaxLongValue: " + myMaxLongValue);
        System.out.println("myMinShortValue: " + myMinShortValue);
        System.out.println("myMaxShortValue: " + myMaxShortValue);
        System.out.println("myMinByteValue: " + myMinByteValue);
        System.out.println("myMaxByteValue: " + myMaxByteValue);
        System.out.println("myMinInValue: " + myMinInValue);
        System.out.println("myMaxIntValue: " + myMaxIntValue);
        System.out.println("busted myMaxIntValue: " + (myMaxIntValue +2));
        System.out.println("myMinFloat: " + myMinFloat);
        System.out.println("myMaxFloat: " + myMaxFloat);
        System.out.println("myMinDouble: " + myMinDouble);
        System.out.println("myMaxDouble: " + myMaxDouble);
    }

}
