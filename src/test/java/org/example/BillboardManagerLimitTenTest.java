package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class BillboardManagerLimitTenTest {

    @Test
    public void shouldArrayLessThanTen() {

        BillboardManager billboard = new BillboardManager();
        billboard.addFilm("film1");
        billboard.addFilm("film2");
        billboard.addFilm("film3");
        billboard.addFilm("film4");
        billboard.addFilm("film5");
        billboard.addFilm("film6");
        billboard.addFilm("film7");
        billboard.addFilm("film8");
        billboard.addFilm("film9");

        String[] expected = {"film9", "film8", "film7", "film6", "film5", "film4", "film3", "film2", "film1"};
        String[] actual = billboard.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldArrayMoreThanTen() {

        BillboardManager billboard = new BillboardManager();
        billboard.addFilm("film1");
        billboard.addFilm("film2");
        billboard.addFilm("film3");
        billboard.addFilm("film4");
        billboard.addFilm("film5");
        billboard.addFilm("film6");
        billboard.addFilm("film7");
        billboard.addFilm("film8");
        billboard.addFilm("film9");
        billboard.addFilm("film10");
        billboard.addFilm("film11");

        String[] expected = {"film11", "film10", "film9", "film8", "film7", "film6", "film5", "film4", "film3", "film2"};
        String[] actual = billboard.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldArrayIsEqualToTen() {

        BillboardManager billboard = new BillboardManager();
        billboard.addFilm("film1");
        billboard.addFilm("film2");
        billboard.addFilm("film3");
        billboard.addFilm("film4");
        billboard.addFilm("film5");
        billboard.addFilm("film6");
        billboard.addFilm("film7");
        billboard.addFilm("film8");
        billboard.addFilm("film9");
        billboard.addFilm("film10");

        String[] expected = {"film10", "film9", "film8", "film7", "film6", "film5", "film4", "film3", "film2", "film1"};

        String[] actual = billboard.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
