package org.example.main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void test() {
        String movie1 = "first";
        String movie2 = "second";
        String movie3 = "third";

        MovieManager manager = new MovieManager();
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);

        String[] actual = manager.findAll();
        String[] expected = {movie1, movie2, movie3};
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void test2() {

        MovieManager manager = new MovieManager();
        manager.findLast();


    }


}
