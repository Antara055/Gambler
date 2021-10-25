package com.bridgelab;
import java.util.Random;

public class GamblingSimulator {
    int EVERYDAY_STAKE = 100;
    int EVERYGAME_BET = 1;

        public void WinLosse() {
            Random r = new Random();
            int winCal=EVERYGAME_BET;
            int looseCal=EVERYGAME_BET;
            int percentage=EVERYDAY_STAKE/2;
            int ifwin=percentage+EVERYDAY_STAKE;
            int ifloose=EVERYDAY_STAKE-percentage;

            while(EVERYDAY_STAKE>ifloose && EVERYDAY_STAKE<ifwin){
                int check=r.nextInt(2);
                if(check==0){
                    //System.out.println("WIN");
                    EVERYDAY_STAKE=EVERYDAY_STAKE+winCal;
                    //System.out.println("changed amount after a win"+EVERYDAY_STAKE);
                }
                else{
                    //System.out.println("LOSSE");

                    EVERYDAY_STAKE=EVERYDAY_STAKE-looseCal;
                    //System.out.println("changed amount after a loose"+EVERYDAY_STAKE>);

                }

            }
            System.out.println("earning : "+EVERYDAY_STAKE);
        }
        public static void main(String[] args) {
        GamblingSimulator gambler = new GamblingSimulator();
        System.out.println("WELCOME TO GAMBLING SIMULATOR");
        System.out.println("The user can start the day with: $" + gambler.EVERYDAY_STAKE);
        System.out.println("Minimum amount user can bet every game is: $" + gambler.EVERYGAME_BET);
        gambler.WinLosse();
    }
}
