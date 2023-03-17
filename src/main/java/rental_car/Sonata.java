package rental_car;

public class Sonata implements Car {
    private final int travelDistance;
    private static final String name = "Sonata";
    private static final double DISTANCE_PER_LITER = 10;
    public Sonata(int travelDistance) {
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
