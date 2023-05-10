package practikum;
import org.junit.Test;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

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

}

