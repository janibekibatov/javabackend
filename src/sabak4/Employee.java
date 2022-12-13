package sabak4;

public class Employee extends Person{
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.name = "Janibek";
        employee.age = 23;
        employee.gender = 'M';
        System.out.println(employee);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
