package sabak4;

public class Driver extends Person{
    public static void main(String[] args) {
        Driver driver = new Driver();

        driver.name = "Esengeldi";
        driver.age = 36;
        driver.gender = 'M';
        System.out.println(driver);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
