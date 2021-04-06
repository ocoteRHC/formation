import java.util.HashMap;
import java.util.Map;

public class Inventory
{
    private final Map<String, Product> _productByBarcode = new HashMap<>();

    public Inventory()
    {
        final Product product = new Product();
        final Product product2 = new Product("210987654321", 43.21);
        
        addProduct(product);
        addProduct(product2);
    }

    private void addProduct(final Product product)
    {
        _productByBarcode.put(product.getBarcode(), product);
    }

    public Product getProductByBarcode(final String barcode)
    {
        return _productByBarcode.get(barcode);
    }
}
