package pravs.tutorial.java;

/**
 * An interface is a contract: the guy writing the interface says,
 * "hey, I accept things looking that way", and the guy using the interface says
 * "OK, the class I write looks that way".
 * 
 * An interface is an empty shell, there are only the signatures (name / params
 * / return type) of the methods. The methods do not contain anything. The
 * interface can't do anything. It's just a pattern.
 * 
 * @author Pravs.mano
 * 
 */
interface MotarVehicle {
    void run();

    int getFule();
}

abstract class AbstractCar implements MotarVehicle {
    @Override
    public void run() {
        System.out.println("abstract car runs");
    }

    @Override
    public int getFule() {
        // TODO Auto-generated method stub
        return 0;
    }
}

class Car implements MotarVehicle {

    @Override
    public void run() {
        System.out.println("car runs");
    }

    @Override
    public int getFule() {
        // TODO Auto-generated method stub
        return 10;
    }

}

class Toyato extends AbstractCar {

}

public class InterfaceExample {
    public static void main(String args[]) {
        MotarVehicle honda = new Car();
        System.out.println(honda.getFule());
    }
}
