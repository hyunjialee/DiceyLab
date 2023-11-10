import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinsTest {


    @Test
    public void BinsConstructor(){
        int min = 2;
        int max = 12;

        Bins bins = new Bins(min, max);

        Assert.assertNotNull(bins);
    }

}