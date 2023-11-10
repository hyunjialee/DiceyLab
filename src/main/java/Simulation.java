import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;
import java.util.TreeMap;

public class Simulation {

// Constructor takes in arguement:
    // numberOfDies to throw numberOfTosses to trun
    // create a simulation of where two dies are thrown one million times
    // Keep track of all the results


    private int numberOfDies;
    private int numberOfTosses;
    private Bins bin;
    private Dice dices;
    // ACCESS - TYPE - NAME

    public Simulation(int numberOfDies, int numberOfTosses) {

        this.numberOfTosses = numberOfTosses;
        this.numberOfDies = numberOfDies;
        this.bin = new Bins(numberOfDies, numberOfDies * 6);
        this.dices = new Dice(numberOfDies);

        // In my class, I want to define TYPE Bin. Then my class instance variable uses numberOfDies, numberOfTosses
    }


    // Minimum is the number of dices since the lowest value they can roll is 1
    // Maximum is the number of dices since the high value they can roll is 6
    // Number of dices * 6

    public void runSimulation(){
        for (int i = 0; i < numberOfTosses; i++){
            // First toss -> get the result
            bin.incrementBin(dices.tossAndSum());
            // Roll the dice -> gives value back -> placing into the bin, the bin is like a tally mark
            // The tally mark increases with each individual roll
        }
    }

    public String printResults() {
        StringBuilder sb = new StringBuilder();

        BigDecimal x;
        sb.append("*** \n Simulation of " + numberOfDies + " dice tossed for " + numberOfTosses + " time.\n***");

        for (Map.Entry<Integer, Integer> entry : this.bin.getBins().entrySet()) {
            x = new BigDecimal((float) entry.getValue() / (float) numberOfTosses);

            sb.append("\n" + entry.getKey() + " " + entry.getValue() + " ");

            //\n%2d: %9d:",
            sb.append(x.setScale(2, RoundingMode.CEILING));

            // sb.append() need to create either a for loop || value of the X to number of *'s

        }
        return sb.toString();
    }
}