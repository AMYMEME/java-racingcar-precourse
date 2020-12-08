package racingcar;

public class Car {

    private final String name;
    private final int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
