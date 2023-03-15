package rental_car;

public class Avante extends Car {
    private final int travelDistance;
    private static final String name = "Avante";
    private static final double DISTANCE_PER_LITER = 15;
    public Avante(int travelDistance) {
        this.travelDistance = travelDistance;
    }

    @Override
    double getDistancePerLiter() {
        return DISTANCE_PER_LITER;
    }

    @Override
    double getTripDistance() {
        return travelDistance;
    }

    @Override
    String getName() {
        return name;
    }

}
