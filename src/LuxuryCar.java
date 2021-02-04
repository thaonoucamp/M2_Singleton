public class LuxuryCar extends Car{

    public LuxuryCar(String name) {
        super(name);
    }

    @Override
    public void showCar() {
        System.out.println("Luxury Car: " + name);
    }

    public void showAll() {
        System.out.println("Show All Info");
    }
}
