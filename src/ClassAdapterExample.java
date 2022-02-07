interface CoffeeMachine {
    void brewCoffee();
}

class CoffeeMaker implements CoffeeMachine {
    public void brewCoffee() {
        System.out.println("CoffeeMaker: \"Here's a cup of coffee!\"");
    }
}

interface AdvancedCoffeeMachine {
    void brewLargeCupCoffee();
}

class AdvancedCoffeeMaker implements AdvancedCoffeeMachine {
    public void brewLargeCupCoffee() {
        System.out.println("AdvancedCoffeeMaker: \"Here's a LARGE cup of coffee!\"");
    }
}

class CoffeeMakerAdapter extends CoffeeMaker implements AdvancedCoffeeMachine {
    public void brewLargeCupCoffee() {
        for (int i = 0; i < 5; i++) {
            brewCoffee();
        }
    }
}

public class ClassAdapterExample {
    public static void main(String[] args) {
        CoffeeMachine concreteCoffeeMaker = new CoffeeMaker();
        AdvancedCoffeeMachine concreteAdvancedCoffeeMaker = new AdvancedCoffeeMaker();
        AdvancedCoffeeMachine adapterAdvancedCoffeeMaker = new CoffeeMakerAdapter();

        concreteCoffeeMaker.brewCoffee();
        concreteAdvancedCoffeeMaker.brewLargeCupCoffee();
        adapterAdvancedCoffeeMaker.brewLargeCupCoffee();
    }
}
