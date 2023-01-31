package com.programmingBasic;

public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        getDurationString(61, 59);
        getDurationString(10000);
    }
    public static void getDurationString(int minutes, int seconds){
        int hours = 0;
        int minutesFormatted = 0;

        if(validateMinutes(minutes) && validateSeconds(seconds)){
            //XXh YYm ZZs
            hours = minutes / 60;
            minutesFormatted = minutes % 60;

            System.out.println( hours+ "h" + minutesFormatted + "m" + seconds + "s");
        }else{
            System.out.println("Invalid Time");
        }
    }
    public static void getDurationString(int seconds){
        int minutes = 0;
        int remainingSeconds = 0;
        if(seconds >= 0){
            minutes = seconds / 60;
            remainingSeconds = seconds % 60;
            getDurationString(minutes, remainingSeconds);
        }else{
            System.out.println("Invalid Time");
        }
    }
    public static boolean validateMinutes(int minutes){
        if(minutes >= 0){
            return true;
        }
        return false;
    }
    public static boolean validateSeconds(int seconds){
        if(seconds >= 0 && seconds <= 59){
            return true;
        }
        return false;
    }
}
