package rentcarAbstractInterface;

public class K5 extends AbstractCar {

    public static final int DISTANCE_PER_LITER = 13;
    String name;

    public K5(int tripDistance) {
        super(tripDistance, DISTANCE_PER_LITER);
        this.name = "K5";
    }
    @Override
    public String getName() {
        return this.name;
    }
}
