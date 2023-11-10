import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

public class BinsTest {



    private Bins bin;
    @Before
    public void setUp() {
        this.bin = new Bins(2,12);
    }

    @Test
    public void testBinsConstructor(){
        int min = 2;
        int max = 12;

        Bins bins = new Bins(min, max);

        Assert.assertNotNull(bins);
    }

    @Test
    public void testGetBins() {

        int expected = bin.getBins(2);
        int actual = 0;

        Assert.assertEquals(expected, actual);


    }

    @Test
    public void testIncrementBin() {
        bin.incrementBin(3);
        int expected = bin.getBins(3);

        int actual = 1;

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testSetBins() {
        Map<Integer, Integer> bins2  = null;

        bin.setBins(bins2);

        Assert.assertNull(bin.getBins());
    }
}