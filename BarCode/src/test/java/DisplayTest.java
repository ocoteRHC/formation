import org.junit.Test;

import static org.junit.Assert.*;

public class DisplayTest
{
    @Test
    public void onBarCodeDisplayPrice()
    {
        final Display display = new Display();
        assertEquals("$12.34", display.getDisplayPriceForBarcode("123456789012"));
    }
}
