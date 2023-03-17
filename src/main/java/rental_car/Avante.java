package rental_car;

public class Avante implements Car {
    private final int travelDistance;
    private static final String name = "Avante";
    private static final double DISTANCE_PER_LITER = 15;
    public Avante(int travelDistance) {
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
