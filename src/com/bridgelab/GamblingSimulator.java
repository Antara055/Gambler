package com.bridgelab;

public class GamblingSimulator {
    int EVERYDAY_STAKE = 100;
    int EVERYDAY_BET = 1;

    public static void main(String[] args) {
        GamblingSimulator gambler = new GamblingSimulator();
        System.out.println("WELCOME TO GAMBLING SIMULATOR");
        System.out.println("The user can start the day with: $" + gambler.EVERYDAY_STAKE);
        System.out.println("Minimum amount user can bet every game is: $" + gambler.EVERYDAY_BET);
    }
}
