public class Display
{
    private final Inventory _inventory = new Inventory();

    public String getDisplayPriceForBarcode(final String barcode)
    {
        final Product productByBarcode = _inventory.getProductByBarcode(barcode);
        if(productByBarcode == null)
            return "Product does not exist";

        return formatPrice(productByBarcode.getPrice());
    }

    private String formatPrice(final double price)
    {
        return "$" + price;
    }
}
