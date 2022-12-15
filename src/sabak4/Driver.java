package sabak4;

public class Driver extends Person{
    public String title;

    public void setTitle(String title) {
        this.title = title;
    }

    public Driver(String name, int age, char gender, String title) {
        super(name, age, gender);
        setTitle(title);
    }

    public static void main(String[] args) {
        Driver driver = new Driver("Dauren",23,' ',"Driver");

//        driver.name = "Esengeldi";
//        driver.age = 36;
//        driver.gender = 'M';
//        driver.setName("Esengeldi");
//        driver.setAge(36);
//        driver.setGender('M');
//        driver.title = "driver";
        System.out.println(driver);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "title='" + title + '\'' +
                "name = " + getName() + " " +
                "age = " + getAge() + " " +
                "gender = " + getGender() +
                '}';
    }
}
