package web.dao;
import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class DaoCarImpl implements DaoCar {
    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Reno", 1, "red"));
        cars.add(new Car("BMV", 2, "black"));
        cars.add(new Car("Lada", 3, "silver"));
        cars.add(new Car("MAZ", 4, "white"));
        cars.add(new Car("KIA", 5, "gold"));
    }

    @Override
    public List<Car> countCars(int count) {
        if (count == 0) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}