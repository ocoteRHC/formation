import org.junit.Test;

import static org.junit.Assert.*;

public class InventoryTest
{
    @Test
    public void onGetProductByBarcode()
    {
        final Inventory inventory = new Inventory();
        assertEquals("123456789012", inventory.getProductByBarcode("123456789012").getBarcode());
    }

    @Test
    public void onGetProductPriceFromBarcode()
    {
        final Inventory inventory = new Inventory();
        assertEquals(12.34, inventory.getProductByBarcode("123456789012").getPrice(), 0.001);
    }
}
