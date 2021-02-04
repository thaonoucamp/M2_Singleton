public class Test {
    public static void main(String[] args) {
        CarMgr carMgr1 = CarMgr.getInstance();

        CarMgr.add(new Car("a"));
        CarMgr.add(new Car("b"));
        CarMgr.add(new Car("c"));

        CarMgr.getInstance().add(new LuxuryCar("1"));
        CarMgr.getInstance().add(new LuxuryCar("2"));
        CarMgr.getInstance().add(new LuxuryCar("3"));

        CarMgr.getInstance().showAll();
      // CarMgr carMgr2 = new CarMgr();
      //  CarMgr carMgr3 = new CarMgr();
    }
}
