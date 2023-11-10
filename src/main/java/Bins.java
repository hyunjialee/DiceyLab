import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Bins {
    // is a tracking class that is used to track the results of the dice rolled
    // keeping track of results

    //  create  contstructor int min and max


    Map<Integer, Integer> bins;
    // Abstract class -> later initiated as a TreeMap

    public Bins(int min, int max) {


        this.bins = new TreeMap<>();
        for (int i = min; i <= max; i++) {

            this.bins.put(i, 0);

        }
    }
    public int getBins(int binNumber){
        return this.bins.get(binNumber);
    }

    public void incrementBin (int binNumber) {
        int x = getBins(binNumber) + 1;
        // Adding value by one to increase the bin number

        this.bins.put(binNumber, x);
        //
    }

    public Map<Integer, Integer> getBins() {
        return bins;
    }

    public void setBins(Map<Integer, Integer> bins) {
        this.bins = bins;
    }
}