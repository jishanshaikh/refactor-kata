package com.digite.kata.refactoring;

public class NewReleaseMovie implements MovieHandler {
    @Override
    public double calculateAmount(int daysRented) {
        return (double) daysRented * 3;
    }

    @Override
    public int getFrequentPoint(int daysRented, int currentPoints) {
        currentPoints++;

        if (daysRented > 1)
            currentPoints++;

        return currentPoints;
    }
}
