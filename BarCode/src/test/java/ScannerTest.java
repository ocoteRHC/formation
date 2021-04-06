import org.junit.Test;

import static org.junit.Assert.*;

public class ScannerTest
{
    @Test
    public void onBarcodeScanned()
    {
        final Scanner scanner = new Scanner();
        assertEquals("123456789012", scanner.getBarcode());
    }
}
