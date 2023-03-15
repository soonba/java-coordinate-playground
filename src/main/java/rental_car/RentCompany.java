package rental_car;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {
    List<Car> carList = new ArrayList<>();
    public static RentCompany create() {
        return new RentCompany();
    }

    public void addCar(Car car) {
        carList.add(car);
    }

    public String generateReport() {
        StringBuilder sb = new StringBuilder();
        carList.forEach(car -> {
            int chargeQuantity = (int) car.getChargeQuantity();

            sb.append(car.getName()).append(" : ").append(chargeQuantity).append("리터").append("\n");
        });
        return sb.toString();
    }
}
