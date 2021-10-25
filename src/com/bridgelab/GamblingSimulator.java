package com.bridgelab;
import java.util.Random;

public class GamblingSimulator {
    int EVERYDAY_STAKE = 100;
    int EVERYDAY_BET = 1;

        public void WinLosse() {
            Random r = new Random();
            int check = r.nextInt(2);
            if (check == 0) {
                System.out.println("WIN");
            } else
                System.out.println("LOSSE");
        }
        public static void main(String[] args) {
        GamblingSimulator gambler = new GamblingSimulator();
        System.out.println("WELCOME TO GAMBLING SIMULATOR");
        System.out.println("The user can start the day with: $" + gambler.EVERYDAY_STAKE);
        System.out.println("Minimum amount user can bet every game is: $" + gambler.EVERYDAY_BET);
        gambler.WinLosse();
    }
}
