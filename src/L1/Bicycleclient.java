package L1;

public class Bicycleclient {
    public static void main(String[] args) {

        //create object
        Bicycle sportsBicycle = new Bicycle();

        System.out.println(sportsBicycle.gear);
        sportsBicycle.braking();

        //create object
        Bicycle touringBicycle = new Bicycle();

        System.out.println(touringBicycle.gear);
        touringBicycle.braking();

    }
}