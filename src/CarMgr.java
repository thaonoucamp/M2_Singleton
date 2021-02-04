import java.util.ArrayList;
import java.util.List;

public class CarMgr {
    private static CarMgr carMgr;
    static List<Car> listCar = new ArrayList<>();
    private static CarMgr instance = null;
    
    private CarMgr() {}
    
    // singleton 
    public static CarMgr getInstance() {
        if (instance == null) {
            instance = new CarMgr();
        }
        return instance;
    }
    
    public static void add(Car car) {
        listCar.add(car);
    }
    
    public void showAll() {
        for (Car car : listCar) {
            car.showCar();
        }
    }
    
    
}
