import org.junit.Test;

import static org.junit.Assert.*;

public class DisplayTest
{
    @Test
    public void onBarCodeDisplayPrice()
    {
        final Display display = new Display();
        assertEquals("$12.34", display.getDisplayPriceForBarcode("123456789012"));
        assertEquals("$43.21", display.getDisplayPriceForBarcode("210987654321"));
    }

    @Test
    public void onBarCodeForInexistingProduct()
    {
        final Display display = new Display();
        assertEquals("Product does not exist", display.getDisplayPriceForBarcode("null"));
    }
}
