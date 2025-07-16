package L1;

public class ConstructorDemo {

    private String name;

    ConstructorDemo() {
        System.out.println("Constructor called");
        name = "AlgoCamp";
    }

    ConstructorDemo(String lang) {
        name = lang;
        System.out.println(name + " is a programming language");
    }

    public static void main(String[] args) {

        ConstructorDemo obj = new ConstructorDemo();
        System.out.println("The name is:"+ obj.name);

        ConstructorDemo obj1 = new ConstructorDemo("c++");
    }
}