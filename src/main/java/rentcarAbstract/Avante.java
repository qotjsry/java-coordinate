package rentcarAbstract;

public class Avante extends Car {
    public static final int DISTANCE_PER_LITER = 15;
    public static final String NAME = "Avante";
    String name;
    double tripDistance;
    public Avante(double tripDistance){
        this.tripDistance = tripDistance;
        this.name = NAME;
    }
    @Override
    double getDistancePerLiter() {
        return DISTANCE_PER_LITER;
    }
    @Override
    double getTripDistance() {
        return this.tripDistance;
    }
    @Override
    String getName() {
        return this.name;
    }
}
