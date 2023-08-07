package rentcar;

public class Avante extends AbstractCar {

    public static final int DISTANCE_PER_LITER = 15;
    private String name;

    public Avante(int distance){
        super(distance, DISTANCE_PER_LITER);
        this.name = "Avante";
    }
    @Override
    public String getName() {
        return this.name;
    }
}
