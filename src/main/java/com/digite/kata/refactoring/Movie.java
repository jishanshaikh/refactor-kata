package com.digite.kata.refactoring;

public class Movie {
    private String _title;
    private int _priceCode;

    private MovieHandler _movieHandler;

    public Movie(String title, MovieHandler movieHandler) {
        _title = title;
        _movieHandler = movieHandler;
    }

    public String getTitle() {
        return _title;
    }

    public int getPriceCode() {
        return _priceCode;
    }

    public void setPriceCode(int priceCode) {
        _priceCode = priceCode;
    }

    public MovieHandler getMovieHandler() { return _movieHandler; }
}