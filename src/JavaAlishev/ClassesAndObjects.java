package JavaAlishev;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Abylai");
        person1.setAge(12);
        System.out.println("My name is " + person1.getName());
        System.out.println("I am " + person1.getAge() + " years old");
        //person1.speak();
        //person1.sayHello();


    }
}

class Person {
    private String name;
    private int age;

    public void setName(String username) {
        if(username.isEmpty()) {
            System.out.println("You entered empty name");
        } else {
            name = username;
        }

    }
    public String getName() {
        return name;
    }

    public void setAge(int userage) {
        if(userage < 0) {
            System.out.println("Wrong number");
        } else {
            age = userage;
        }

    }

    public int getAge() {
        return age;
    }


    int calculateYearsToRetirement() {
        int years = 65 - age;
        return years;
    }

    /*void speak() {
        for(int i = 0; i < 3; i++) {
            System.out.println("My name is " + name + ", and I am " + age + " years old");
        }
    }*/

    void sayHello() {
        System.out.println("Hello");
    }
}

