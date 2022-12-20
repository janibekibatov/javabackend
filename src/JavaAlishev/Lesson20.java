package JavaAlishev;

public class Lesson20 {
    public static void main(String[] args) {
        Humano h1 = new Humano("Bob", 40);
        Humano h2 = new Humano("Jony", 23);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
    }
}

class Humano{


    private String name;
    private int age;
    private static int countPeople;
    public Humano(String name, int age) {
        System.out.println("Hello from third constructor");
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void printNumberOfPeople() {
        System.out.println("Number of workers " + countPeople);
    }
}
