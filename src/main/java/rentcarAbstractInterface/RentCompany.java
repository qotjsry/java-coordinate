package rentcarAbstractInterface;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {
    private static final String NEWLINE = System.getProperty("line.separator");
    private static RentCompany rentCompany = null;
    private List<Car> cars = new ArrayList<>();
    public static RentCompany create() {
        if(rentCompany == null)
            rentCompany = new RentCompany();
        return rentCompany;
    }
    public void addCar(Car car) {
        cars.add(car);
    }
    public String generateReport() {
        StringBuilder sb = new StringBuilder();
        for(Car car : cars) {
            sb.append(car.getName());
            sb.append(" : ");
            sb.append((int)car.getChargeQuantity());
            sb.append("리터");
            sb.append(NEWLINE);
        }
        return sb.toString();
    }
}
