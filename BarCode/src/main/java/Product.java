public class Product
{
    private final String _barcode;
    private final double _price;

    public Product()
    {
        this("123456789012", 12.34);
    }

    public Product(final String barcode, final double price)
    {
        _barcode = barcode;
        _price = price;
    }

    public String getBarcode()
    {
        return _barcode;
    }

    public double getPrice()
    {
        return _price;
    }
}
