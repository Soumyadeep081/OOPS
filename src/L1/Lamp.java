package L1;

public class Lamp {

    boolean isOn;

    void turnOn() {
        isOn = true;
        System.out.println("light is turned on");
    }

    void turnOff() {
        isOn = false;
        System.out.println("light is turned off");
    }

//create object
//    public static void main(String[] args) {
//
//        Lamp led = new Lamp();
//        Lamp halogen = new Lamp();
//
//        led.turnOn();
//
//        halogen.turnOff();

//    }
}