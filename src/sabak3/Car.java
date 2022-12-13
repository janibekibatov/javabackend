package sabak3;

public class Car {
    int goodYear;

    public int getGoodYear() {
        return goodYear;
    }

    public void setGoodYear(int goodYear) {
        this.goodYear = goodYear;
    }

    static int countOfDoor = 5;

//    public int increment() {
//        return countOfDoor + 1;
//    }

    public void getStatic() {
        getCountOfDoor();

    }

    public static int getCountOfDoor() {
        return countOfDoor;
    }

    public static void main(String[] args) {
//          Car camry = new Car();
          Car.getCountOfDoor();
//          Car.countOfDoor;
//        System.out.println(camry.increment());
//        System.out.println(getCountOfDoor());
//
//        Car man = new Car();
//        System.out.println(man.increment());
//        System.out.println(getCountOfDoor());
    }
}
