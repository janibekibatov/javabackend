package JavaAlishev;

interface AbleToEat {
    public void eat();
}

public class AnonimClass {
    public static void main(String[] args) {
        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Someone is eating");
            }
        };
        ableToEat.eat();
    }
}
