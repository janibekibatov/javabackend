package JavaAlishev;

public class ClassObjectAndToString {
    public static void main(String[] args) {
        Adam adam1 = new Adam("Bob", 45);
        System.out.println(adam1);
    }
}

class Adam {
    private String name;
    private int age;

    public Adam(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + ", "+age;
    }
}