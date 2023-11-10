public class Main {

    public static void main (String[] args){



        Simulation one = new Simulation(3,1000000);

        one.runSimulation();

        System.out.print(one.printResults());
    }
}
