package org.example.main;

import org.example.main.MovieManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTestFindLast {

    @Test
    public void test() {

        String movie1 = "movie1";
        String movie2 = "movie2";
        String movie3 = "movie3";
        String movie4 = "movie4";
        String movie5 = "movie5";
        String movie6 = "movie6";
        String movie7 = "movie7";
        String movie8 = "movie8";
        String movie9 = "movie9";
        String movie10 = "movie10";
        String movie11 = "movie11";


MovieManager manager = new MovieManager(10);
manager.addMovie(movie1);
manager.addMovie(movie2);
manager.addMovie(movie3);
manager.addMovie(movie4);
manager.addMovie(movie5);
manager.addMovie(movie6);
manager.addMovie(movie7);
manager.addMovie(movie8);
manager.addMovie(movie9);
manager.addMovie(movie10);
manager.addMovie(movie11);
String[] expected = {movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2};
String[] actual = manager.findLast();
Assertions.assertArrayEquals(expected, actual);
    }
}
