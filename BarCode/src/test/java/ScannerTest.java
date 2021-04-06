import org.junit.Test;

import static org.junit.Assert.*;

public class ScannerTest
{
    @Test
    public void onGetScannedBarcode()
    {
        final Scanner scanner = new Scanner();
        assertEquals("123456789012", scanner.getBarcode());
    }

    @Test
    public void onGetProductBarcode()
    {
        final Product product = new Product();
        assertEquals("123456789012", product.getBarcode());
    }

    @Test
    public void onGetProductByBarcode()
    {
        final Inventory inventory = new Inventory();
        final Product product = new Product();
        inventory.addProduct(product);

        assertEquals("123456789012", inventory.getProductByBarcode("123456789012").getBarcode());
    }
}
