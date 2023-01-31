package com.programmingBasic;

public class LearnMethod {

    public static void main(String[] args){
        displayHighScorePosition("Superman", calculateHighScorePosition(1500));
        displayHighScorePosition("Black Adam", calculateHighScorePosition(900));
        displayHighScorePosition("Shazam", calculateHighScorePosition(400));
        displayHighScorePosition("Flash", calculateHighScorePosition(50));

        displayHighScorePosition("Spiderman", calculateHighScorePosition(1000));
        displayHighScorePosition("Ironman", calculateHighScorePosition(500));
        displayHighScorePosition("Hulk", calculateHighScorePosition(100));
    }

    static int calculateHighScorePosition(int score){
        int position = 4;
        if(score >= 1000){
            position = 1;
        }else if(500 <= score){
            position = 2;
        }else if(100 <= score){
            position = 3;
        }
        return position;
    }
    static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }
}
