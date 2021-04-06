import org.junit.Test;

import static org.junit.Assert.*;

public class ScannerTest
{
    @Test
    public void onScannerPass()
    {
        assertTrue(true);
    }

    @Test
    public void onScannerFail()
    {
        fail();
    }
}
