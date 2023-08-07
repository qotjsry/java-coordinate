package rentcarAbstract;

public class Sonata extends Car {
    public static final int DISTANCE_PER_LITER = 10;
    public static final String NAME = "Sonata";
    String name;
    double tripDistance;

    public Sonata(double tripDistance){
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
