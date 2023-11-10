import org.junit.Test;
import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

public class DiceTest {


    @Test
    public void testTossAndSum() {
        int numberOfDice = 2;

        int maxNumber = numberOfDice * 6;

        Dice dice1 = new Dice(numberOfDice);

        int actual = dice1.tossAndSum();

        Assert.assertTrue(actual <= maxNumber);
        Assert.assertTrue(actual >= numberOfDice);

    } // How to test a random class...

    @Test
    public void testGetNumberOfDies(){
        int numberOfDice = 2;

        Dice dice1 = new Dice(numberOfDice);

    }

}