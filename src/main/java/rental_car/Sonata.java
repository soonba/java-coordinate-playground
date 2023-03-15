package rental_car;

public class Sonata extends Car {
    private final int travelDistance;
    private static final String name = "Sonata";
    private static final double DISTANCE_PER_LITER = 10;
    public Sonata(int travelDistance) {
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
