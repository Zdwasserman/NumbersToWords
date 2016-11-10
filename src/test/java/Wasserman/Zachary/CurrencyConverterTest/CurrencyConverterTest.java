package Wasserman.Zachary.CurrencyConverterTest;


import Wasserman.Zachary.CurrencyConverter.App;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by zacharywasserman on 11/9/16.
 */
public class CurrencyConverterTest
{
    @Test
    public void converterTest()
    {
        App app = new App();
        String[] arr = new String[1];
        arr[0] = "1";
        String expected = "OneDollars";
        String actual = app.converter(arr);
        assertEquals(expected, actual);
    }
}
