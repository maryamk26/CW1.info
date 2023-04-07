package machine;
import java.util.ArrayList;
import java.util.List;

public class LIST {
    private List<CARS> cars;

    public LIST() {
        this.cars = new ArrayList<>();
    }

    public void addCar(CARS car) {
        cars.add(car);
    }

    public List<CARS> getCars() {
        return cars;
    }

    public List<CARS> searchlist(SPECS carSpecs) {
        List<CARS> matchingCars = new ArrayList<>();

        for (CARS car : cars) {
            if (car.getSpecs().matches(carSpecs)) {
                matchingCars.add(car);
            }
        }

        return matchingCars;
    }
}



