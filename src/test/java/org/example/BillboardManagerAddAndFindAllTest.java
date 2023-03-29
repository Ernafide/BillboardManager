package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class BillboardManagerAddAndFindAllTest {
    @Test
    public void shouldAddFilms() {

        BillboardManager billboard = new BillboardManager();

        billboard.addFilm("film1");
        billboard.addFilm("film2");
        billboard.addFilm("film3");
        billboard.addFilm("film4");
        billboard.addFilm("film5");

        String[] expectedBillboard = {"film1", "film2", "film3", "film4", "film5"};
        String[] actualBillboard = billboard.findAll();

        Assertions.assertArrayEquals(expectedBillboard, actualBillboard);
    }
}
