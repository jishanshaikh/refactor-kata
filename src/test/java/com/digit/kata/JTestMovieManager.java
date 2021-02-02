package com.digite.kata;

import com.digite.kata.refactoring.Customer;
import com.digite.kata.refactoring.Movie;
import com.digite.kata.refactoring.MovieManager;
import com.digite.kata.refactoring.Rental;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JTestMovieManager {

    @Test
    public void testRentRegularMovieFor1DayWithoutInterest() {
        Movie movie = new Movie("Justice League", Movie.CHILDRENS);
        Rental rental = new Rental(movie, 1);

        Customer customer = new Customer("Jishan");
        customer.addRental(rental);

        MovieManager movieManager = new MovieManager();

        String actual = movieManager.calculateAmountAndPoint(customer);

        String expected = "Amount owed is 2, and You earned 1 frequent renter points";

        assertEquals(expected, actual);
    }

    @Test
    public void testRentRegularMovieFor4DaysWithInterest() {
        Movie movie = new Movie("Justice League", Movie.CHILDRENS);
        Rental rental = new Rental(movie, 4);

        Customer customer = new Customer("Jishan");
        customer.addRental(rental);

        MovieManager movieManager = new MovieManager();

        String actual = movieManager.calculateAmountAndPoint(customer);

        String expected = "Amount owed is 5, and You earned 1 frequent renter points";

        assertEquals(expected, actual);
    }

    @Test
    public void testRentNewReleaseMovieFor1DayWithoutFrquentBonus() {
        Movie movie = new Movie("Justice League", Movie.NEW_RELEASE);
        Rental rental = new Rental(movie, 1);

        Customer customer = new Customer("Jishan");
        customer.addRental(rental);

        MovieManager movieManager = new MovieManager();

        String actual = movieManager.calculateAmountAndPoint(customer);

        String expected = "Amount owed is 3, and You earned 1 frequent renter points";

        assertEquals(expected, actual);
    }

    @Test
    public void testRentNewReleaseMovieFor4DaysWithFrequentBonus() {
        Movie movie = new Movie("Justice League", Movie.NEW_RELEASE);
        Rental rental = new Rental(movie, 4);

        Customer customer = new Customer("Jishan");
        customer.addRental(rental);

        MovieManager movieManager = new MovieManager();

        String actual = movieManager.calculateAmountAndPoint(customer);

        String expected = "Amount owed is 3, and You earned 2 frequent renter points";

        assertEquals(expected, actual);
    }

    @Test
    public void testRentChildrenMovieFor1DayWithoutInterest() {
        Movie movie = new Movie("Justice League", Movie.CHILDRENS);
        Rental rental = new Rental(movie, 1);

        Customer customer = new Customer("Jishan");
        customer.addRental(rental);

        MovieManager movieManager = new MovieManager();

        String actual = movieManager.calculateAmountAndPoint(customer);

        String expected = "Amount owed is 1.5, and You earned 1 frequent renter points";

        assertEquals(expected, actual);
    }

    @Test
    public void testRentChildrenMovieFor4DaysWithInterest() {
        Movie movie = new Movie("Justice League", Movie.CHILDRENS);
        Rental rental = new Rental(movie, 4);

        Customer customer = new Customer("Jishan");
        customer.addRental(rental);

        MovieManager movieManager = new MovieManager();

        String actual = movieManager.calculateAmountAndPoint(customer);

        String expected = "Amount owed is 3, and You earned 1 frequent renter points";

        assertEquals(expected, actual);
    }
}
