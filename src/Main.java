public class Main {
    public static void main(String[] args) {
        Car car, luxuryCar;

        car = new Car("a");
        luxuryCar = new Car("b");

        car.showCar();
        luxuryCar.showCar();

        if (car instanceof Car) {
            System.out.println("car 1");
        }

        if (luxuryCar instanceof Car) {
            System.out.println("log 2");
        }
    }
}
