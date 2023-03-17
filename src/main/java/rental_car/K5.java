package rental_car;

public class K5 implements Car {
    private final int travelDistance;
    private static final String name = "K5";
    private static final double DISTANCE_PER_LITER = 13;
    public K5(int travelDistance) {
        this.travelDistance = travelDistance;
    }

    public double getDistancePerLiter() {
        return DISTANCE_PER_LITER;
    }

    public double getTripDistance() {
        return travelDistance;
    }

    public String getName() {
        return name;
    }
}
