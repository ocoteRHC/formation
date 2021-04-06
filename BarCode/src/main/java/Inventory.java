import java.util.HashMap;
import java.util.Map;

public class Inventory
{
    private final Map<String, Product> _productByBarcode = new HashMap<>();

    public Inventory()
    {
        final Product product = new Product();
        addProduct(product);
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
