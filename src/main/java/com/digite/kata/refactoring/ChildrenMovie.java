package com.digite.kata.refactoring;

public class ChildrenMovie implements MovieHandler {

    @Override
    public double calculateAmount(int daysRented) {
        double amount = 1.5;

        if (daysRented > 3)
            amount += (daysRented - 3) * 1.5;

        return amount;
    }

    @Override
    public int getFrequentPoint(int daysRented, int currentPoints) {
        return currentPoints + 1;
    }

}
