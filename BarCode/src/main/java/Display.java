public class Display
{
    private final Inventory _inventory = new Inventory();

    public String getDisplayPriceForBarcode(final String barcode)
    {
        return formatPrice(_inventory.getProductByBarcode(barcode).getPrice());
    }

    private String formatPrice(final double price)
    {
        return "$" + price;
    }
}
