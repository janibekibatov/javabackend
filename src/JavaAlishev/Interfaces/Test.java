package JavaAlishev.Interfaces;

public class Test {
    public static void main(String[] args) {
//        Info info = new Animal(1);
//        Info info2 = new Person("Bob");
//        outputInfo(info);
//        outputInfo(info2);

        Animal animal = new Animal(1);
        Person person = new Person("Bob");
        outputInfo(animal);
        outputInfo(person);
    }

    public static void outputInfo(Info info) {
        info.showInfo();
    }
}
