package com.bridgelab;
import java.util.Random;

public class GamblingSimulator {
    int EVERYDAY_STAKE = 100;
    int EVERYGAME_BET = 1;

        public void WinLosse() {
            int afterBet = 0;
            Random r = new Random();
            for (int i = 1; i <= 20; i++) {
                EVERYDAY_STAKE = afterBet;
                int stakeCheck = EVERYDAY_STAKE;
                int percentage = EVERYDAY_STAKE / 2;
                int ifwin = percentage + EVERYDAY_STAKE;
                int ifloose = EVERYDAY_STAKE - percentage;

                while (EVERYDAY_STAKE > ifloose && EVERYDAY_STAKE < ifwin) {
                    int winLoose = r.nextInt(2);
                    if (winLoose == 1) {
                        //System.out.println("win");
                        afterBet = EVERYDAY_STAKE + EVERYGAME_BET;
                    } else {
                        //System.out.println("loose");
                        afterBet = EVERYDAY_STAKE - EVERYGAME_BET;
                    }
                    System.out.println("Bet amount for the  day " + i + " is:" + EVERYDAY_STAKE);


                    EVERYDAY_STAKE = afterBet;
                    //System.out.println("after play="+afterBet);
                }
                System.out.println("day " + i + " after the bet amount:" + EVERYDAY_STAKE);

                if (stakeCheck < afterBet) {
                    int profit = afterBet - stakeCheck;
                    System.out.println("day " + i + " in profit:" + profit);
                } else {
                    int loose = stakeCheck - afterBet;
                    System.out.println("day " + i + " in loose:" + loose);
                }
            }
        }


        public static void main(String[] args) {
        GamblingSimulator gambler = new GamblingSimulator();
        System.out.println("WELCOME TO GAMBLING SIMULATOR");
        System.out.println("The user can start the day with: $" + gambler.EVERYDAY_STAKE);
        System.out.println("Minimum amount user can bet every game is: $" + gambler.EVERYGAME_BET);
        gambler.WinLosse();
    }
}
