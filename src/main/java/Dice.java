import java.util.Random;

public class Dice {

    //Creating a dice class that set of N-random of tosses
    // The dice can be landing on number 1-6

    private Integer numberOfDies;

    public Dice(int numberOfDies){
        this.numberOfDies = numberOfDies;
        // How many dices you are rolling
    }
    public Integer tossAndSum()   {

        Random numberRolled = new Random();

        int x = 0;

        for (int i = 0; i < this.numberOfDies; i++) {
            x += numberRolled.nextInt(6) + 1;
        } return x;
    }
    public Integer getNumberOfDies(){
        return this.numberOfDies;
    }
}
