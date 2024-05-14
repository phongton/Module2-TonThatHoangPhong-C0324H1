package AccessModifierStatic;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCars;
    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }


}
class Main{
    public static void main(String[] args) {
        Car car = new Car("mazda3", "3");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("mazda2", "2");
        System.out.println(Car.numberOfCars);
    }
}
