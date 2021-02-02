package com.digite.kata;

import com.digite.kata.refactoring.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JTestMovieManager {

    @Test
    public void testRentRegularMovieFor1DayWithoutInterest() {
        RegularMovie regularMovie = new RegularMovie();
        Movie movie = new Movie("", regularMovie);

        Rental rental = new Rental(movie, 1);

        Customer customer = new Customer("Jishan");
        customer.addRental(rental);

        MovieManager movieManager = new MovieManager();

        String actual = movieManager.calculateAmountAndPoint(customer);

        String expected = "Rental Record for Jishan, \t\t2.0\n" +
                "Amount owed is 2.0, and You earned 1 frequent renter points";

        assertEquals(expected, actual);
    }

    @Test
    public void testRentRegularMovieFor4DaysWithInterest() {
        RegularMovie regularMovie = new RegularMovie();
        Movie movie = new Movie("", regularMovie);

        Rental rental = new Rental(movie, 4);

        Customer customer = new Customer("Jishan");
        customer.addRental(rental);

        MovieManager movieManager = new MovieManager();

        String actual = movieManager.calculateAmountAndPoint(customer);

        String expected = "Rental Record for Jishan, \t\t5.0\n" +
                "Amount owed is 5.0, and You earned 1 frequent renter points";

        assertEquals(expected, actual);
    }

    @Test
    public void testRentNewReleaseMovieFor1DayWithoutFrquentBonus() {
        NewReleaseMovie newReleaseMovie = new NewReleaseMovie();
        Movie movie = new Movie("", newReleaseMovie);

        Rental rental = new Rental(movie, 1);

        Customer customer = new Customer("Jishan");
        customer.addRental(rental);

        MovieManager movieManager = new MovieManager();

        String actual = movieManager.calculateAmountAndPoint(customer);

        String expected = "Rental Record for Jishan, \t\t3.0\n" +
                "Amount owed is 3.0, and You earned 1 frequent renter points";

        assertEquals(expected, actual);
    }

    @Test
    public void testRentNewReleaseMovieFor4DaysWithFrequentBonus() {
        NewReleaseMovie newReleaseMovie = new NewReleaseMovie();
        Movie movie = new Movie("", newReleaseMovie);

        Rental rental = new Rental(movie, 4);

        Customer customer = new Customer("Jishan");
        customer.addRental(rental);

        MovieManager movieManager = new MovieManager();

        String actual = movieManager.calculateAmountAndPoint(customer);

        String expected = "Rental Record for Jishan, \t\t12.0\n" +
                "Amount owed is 12.0, and You earned 2 frequent renter points";

        assertEquals(expected, actual);
    }

    @Test
    public void testRentChildrenMovieFor1DayWithoutInterest() {
        ChildrenMovie childrenMovie = new ChildrenMovie();
        Movie movie = new Movie("", childrenMovie);

        Rental rental = new Rental(movie, 1);

        Customer customer = new Customer("Jishan");
        customer.addRental(rental);

        MovieManager movieManager = new MovieManager();

        String actual = movieManager.calculateAmountAndPoint(customer);

        String expected = "Rental Record for Jishan, \t\t1.5\n" +
                "Amount owed is 1.5, and You earned 1 frequent renter points";

        assertEquals(expected, actual);
    }

    @Test
    public void testRentChildrenMovieFor4DaysWithInterest() {
        ChildrenMovie childrenMovie = new ChildrenMovie();
        Movie movie = new Movie("", childrenMovie);

        Rental rental = new Rental(movie, 4);

        Customer customer = new Customer("Jishan");
        customer.addRental(rental);

        MovieManager movieManager = new MovieManager();

        String actual = movieManager.calculateAmountAndPoint(customer);

        String expected = "Rental Record for Jishan, \t\t3.0\n" +
                "Amount owed is 3.0, and You earned 1 frequent renter points";

        assertEquals(expected, actual);
    }
}
