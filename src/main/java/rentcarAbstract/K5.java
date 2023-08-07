package rentcarAbstract;

public class K5 extends Car{
    public static final int DISTANCE_PER_LITER = 13;
    public static final String NAME = "K5";
    String name;
    double tripDistance;
    public K5(double tripDistance){
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
