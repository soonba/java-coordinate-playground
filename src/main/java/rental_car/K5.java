package rental_car;

public class K5 extends Car {
    private final int travelDistance;
    private static final String name = "K5";
    private static final double DISTANCE_PER_LITER = 13;
    public K5(int travelDistance) {
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
