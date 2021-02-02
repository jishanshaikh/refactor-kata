package com.digite.kata.refactoring;

import java.util.Enumeration;

public class MovieManager {
    public String calculateAmountAndPoint(Customer customer) {
        double totalAmount = 0;
        int frequentRenterPoints = 0;

        Enumeration rentals = customer.getRentals().elements();

        String result = "Rental Record for " + customer.getName() + ", ";

        while (rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();
            //determine amounts for each line

            thisAmount += each.getMovie().getMovieHandler().calculateAmount(each.getDaysRented());

            // add frequent renter points
            frequentRenterPoints += each.getMovie().getMovieHandler().getFrequentPoint(each.getDaysRented(), frequentRenterPoints);
            // add bonus for a two day new release rental

            //show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" +
                    String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }
        //add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) + ", and You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
        return result;
    }
}
