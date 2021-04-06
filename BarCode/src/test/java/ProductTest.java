import org.junit.Test;

import static org.junit.Assert.*;

public class ProductTest
{
    @Test
    public void onGetProductBarcode()
    {
        final Product product = new Product();
        assertEquals("123456789012", product.getBarcode());
    }

    @Test
    public void onGetProductPrice()
    {
        final Product product = new Product();
        assertEquals(12.34, product.getPrice(), 0.001);
    }
}
