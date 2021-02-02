package com.digite.kata.refactoring;

public class RegularMovie implements MovieHandler {
    @Override
    public double calculateAmount(int daysRented) {
        double amount = 2;

        if (daysRented > 2)
            amount += (daysRented - 2) * 1.5;

        return amount;
    }

    @Override
    public int getFrequentPoint(int daysRented, int currentPoints) {
        return currentPoints + 1;
    }
}
