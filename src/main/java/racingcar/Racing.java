package racingcar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Racing {

    private List<Car> cars;
    private final RacingUI racingUi;

    Racing() {
        cars = new ArrayList<>();
        racingUi = new RacingUI();
    }

    public void makeCars(List<String> carNames) {
        for (String carName : carNames)
            this.cars.add(new Car(carName));
    }

    public int getCarNo() {
        return cars.size();
    }

    public void endTurn() {
        List<CarDTO> carDTOs = cars.stream().map(e -> e.toDTO()).collect(Collectors.toList());

        racingUi.displayPosition(carDTOs);
    }
}
