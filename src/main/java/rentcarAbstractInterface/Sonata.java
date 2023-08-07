package rentcarAbstractInterface;

public class Sonata extends AbstractCar {

    public static final int DISTANCE_PER_LITER = 10;
    private String name;

    public Sonata(int distance) {
        super(distance, DISTANCE_PER_LITER);
        this.name = "Sonata";
    }
    @Override
    public String getName() {
        return this.name;
    }
}
