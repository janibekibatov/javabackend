package sabak2;

public class Person {
    // 1)variable
    private int age;

    // 2) constructor
    Person() {
        age = 0;
    }

    // 3) method
    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Person danok = new Person();
        Person daulet = new Person();

        System.out.println("Danok age is " + danok.age);
        danok.setAge(23);
        System.out.println("Danok age is " + danok.age);
        boolean result = danok.checkAge(23);
        System.out.println("result " + result);

        daulet.setAge(32);
        System.out.println("Daulet age is " + daulet.age);
    }

    public boolean checkAge(int age) {
        if(age > 18) return true;
        else
            return false;
    }

    public int max(int age1, int age2) {
        if(age1 > age2) return age1;
        else return age2;
    }
}
