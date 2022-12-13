package sabak3;

public class Student {
    public static int age;
    public static String name;

    public Student() {
        setAge(0);
        setName("");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

//    public static void main(String[] args) {
//        Student daniyar = new Student();
//        Student test = new Student(age:18);
//
//        Student test2 = new Student(age:18, name: "Danik");
//        System.out.println(daniyar.getAge());
//        System.out.println(daniyar.getName());
//
//        System.out.println(test.getAge());
//        System.out.println(test2.getAge());
//        System.out.println(test2.getName());
//    }
}
