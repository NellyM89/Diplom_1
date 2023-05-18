package practikum;
import org.junit.Test;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BunTest {

        private final String name = "white bun";
        private final float price = 200;
        Bun bun = new Bun(name, price);

        @Test
        public void getNameTest() {
                assertEquals("white bun", bun.getName());
        }

        @Test
        public void getPriceTest() {
                assertEquals(200.0, bun.getPrice(), 0);
        }

        @Test
        public void getNameEmptyStringTest() {
                Bun bunEmptyName = new Bun("", price);
                assertEquals("", bunEmptyName.getName());
        }

        @Test
        public void getNameNullTest() {
                Bun bunNullName = new Bun(null, price);
                assertEquals(null, bunNullName.getName());
        }

        @Test
        public void getNameLongStringTest() {
                String longName = "This is a very long name for a bun that should not be accepted as valid";
                Bun bunLongName = new Bun(longName, price);
                assertEquals(longName, bunLongName.getName());
        }

        @Test
        public void getNameSpecialCharactersTest() {
                String specialCharactersName = "Bun %#*@§";
                Bun bunSpecialCharacters = new Bun(specialCharactersName, price);
                assertEquals(specialCharactersName, bunSpecialCharacters.getName());
        }

        @Test
        public void getPriceNegativeTest() {
                float negativePrice = -100;
                Bun bunNegativePrice = new Bun(name, negativePrice);
                assertEquals(negativePrice, bunNegativePrice.getPrice(), 0);
        }

        @Test
        public void getPriceZeroTest() {
                float zeroPrice = 0;
                Bun bunZeroPrice = new Bun(name, zeroPrice);
                assertEquals(zeroPrice, bunZeroPrice.getPrice(), 0);
        }

        @Test
        public void getPriceMinimumPositiveTest() {
                float minimumPositivePrice = 0.01f;
                Bun bunMinimumPositivePrice = new Bun(name, minimumPositivePrice);
                assertEquals(minimumPositivePrice, bunMinimumPositivePrice.getPrice(), 0);
        }

        @Test
        public void getPriceMaximumPositiveTest() {
                float maximumPositivePrice = Float.MAX_VALUE;
                Bun bunMaximumPositivePrice = new Bun(name, maximumPositivePrice);
                assertEquals(maximumPositivePrice, bunMaximumPositivePrice.getPrice(), 0);
        }

}

