import com.google.inject.Inject;

public class Wheel implements IWeightable {
    private final String label;
    @Inject
    private ITire tire;


    public Wheel(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return label;
    }

    public double getWeight() {
        return tire.getWeight();
    }
}
