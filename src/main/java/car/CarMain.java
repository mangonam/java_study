package car;

public class CarMain {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color="빨강";
        myCar.speed=100;
        myCar.drive();
        Car yourCar = new Car();
        yourCar.color="노랑";
        yourCar.speed=140;
        yourCar.stop();
    }
}
