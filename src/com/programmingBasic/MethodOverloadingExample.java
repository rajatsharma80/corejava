package com.programmingBasic;

public class MethodOverloadingExample {

    public static void main(String[] args) {
        double centimeters = 0.0;
        centimeters = calculateFeetAndInchesToCentimeters(6, 0);
        if(validate(centimeters)) {
            System.out.println("Feet and Inches to Centimeters is " + centimeters);
        }
        centimeters = calculateFeetAndInchesToCentimeters(6);
        if(validate(centimeters)) {
            System.out.println("Inches to Centimeters is " + centimeters);
        }
    }
    public static double calculateFeetAndInchesToCentimeters(double feet, double inches){
        double centimeter = 0.0;
        if(feet >= 0 && (inches >=0 && inches <=12)){
            centimeter = ( feet + (inches / 12) ) * 30.48;
        }
        return centimeter;
    }
    public static double calculateFeetAndInchesToCentimeters(double inches){
        double centimeter = 0.0;
        if(inches >=0 && inches <=12){
            centimeter =  inches * 2.54;
        }
        return centimeter;
    }
    public static boolean validate(double centimeters){
        if(centimeters < 0.0){
            System.out.println("Invalid Number");
            return false;
        }
        return true;
    }
}
