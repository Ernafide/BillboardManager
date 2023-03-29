package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BillboardManagerAnyLimitTest {
    @Test
    public void shouldZeroFilmsAnyLimit() {

        BillboardManager billboard = new BillboardManager(5);

        String[] expected = {};
        String[] actual = billboard.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldAnyFilmsZeroLimit() {
        BillboardManager billboard = new BillboardManager(0);
        billboard.addFilm("film1");
        billboard.addFilm("film2");
        billboard.addFilm("film3");

        String[] expected = {};
        String[] actual = billboard.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldLimitIdenticallyFilms() {
        BillboardManager billboard = new BillboardManager(3);
        billboard.addFilm("film1");
        billboard.addFilm("film2");
        billboard.addFilm("film3");

        String[] expected = {"film3", "film2", "film1"};
        String[] actual = billboard.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFilmsOneLessForLimit() {
        BillboardManager billboard = new BillboardManager(6);
        billboard.addFilm("film1");
        billboard.addFilm("film2");
        billboard.addFilm("film3");
        billboard.addFilm("film4");
        billboard.addFilm("film5");

        String[] expected = {"film5", "film4", "film3", "film2", "film1"};
        String[] actual = billboard.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFilmsMuchLessThanLimit() {
        BillboardManager billboard = new BillboardManager(15);
        billboard.addFilm("film1");
        billboard.addFilm("film2");
        billboard.addFilm("film3");

        String[] expected = {"film3", "film2", "film1"};
        String[] actual = billboard.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFilmsMoreByOneThanLimit() {
        BillboardManager billboard = new BillboardManager(4);
        billboard.addFilm("film1");
        billboard.addFilm("film2");
        billboard.addFilm("film3");
        billboard.addFilm("film4");
        billboard.addFilm("film5");

        String[] expected = {"film5", "film4", "film3", "film2"};
        String[] actual = billboard.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFilmsMuchMoreLimit() {
        BillboardManager billboard = new BillboardManager(1);
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
        billboard.addFilm("film12");
        billboard.addFilm("film13");
        billboard.addFilm("film14");
        billboard.addFilm("film15");

        String[] expected = {"film15"};
        String[] actual = billboard.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
}
