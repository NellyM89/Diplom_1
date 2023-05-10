package practikum;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import praktikum.Ingredient;
import static org.junit.Assert.assertEquals;
import static praktikum.IngredientType.SAUCE;

public class IngredientTypeTest {
    @Mock
    Ingredient ingredient;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetPriceTest() {
        Mockito.when(ingredient.getPrice()).thenReturn(100F);
        assertEquals(ingredient.getPrice(), 100F, 0F);
    }

    @Test
    public void testGetNameTest() {
        Mockito.when(ingredient.getName()).thenReturn("chili sauce");
        assertEquals(ingredient.getName(), "chili sauce");
    }

    @Test
    public void testGetTypeTest() {
        Mockito.when(ingredient.getType()).thenReturn(SAUCE);
        assertEquals(ingredient.getType(), SAUCE);
    }
}
