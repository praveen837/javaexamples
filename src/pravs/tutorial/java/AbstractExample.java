package pravs.tutorial.java;

/**
 * Abstract classes are classes that contain one or more abstract methods. An
 * abstract method is a method that is declared, but contains no implementation.\
 * 
 * Abstract classes may not be instantiated, and require subclasses to provide
 * implementations for the abstract methods. Let's look at an example of an
 * abstract class, and an abstract method.
 * 
 * @author Pravs.mano
 * 
 */
abstract class AbstractClass {
    String me = "I am abstract class";

    public void printMe() {
        System.out.println(me);
    }

    public abstract void printMeAbstract();
}

class ConcreteClass extends AbstractClass {
    @Override
    public void printMeAbstract() {
        System.out.println("I am extended mentod in concrete class");
    }
}

public class AbstractExample {
    public static void main(String args[]) {
        AbstractClass ac = new AbstractClass() {
            @Override
            public void printMeAbstract() {
                // TODO Auto-generated method stub
                System.out.println("with in the anoynomys method");
            }
        };
        ac.printMeAbstract();
        ConcreteClass cc = new ConcreteClass();
        System.out.println(cc.me + " String defined");
        cc.printMe();
        cc.printMeAbstract();
    }
}
