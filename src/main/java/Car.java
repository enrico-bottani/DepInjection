import com.google.inject.Inject;
import com.google.inject.Provides;

import java.util.Arrays;

public class Car implements IWeightable {
    @Inject
    private IEngine engine;
    @Inject
    private IBody body;
    @Inject
    private IFrame frame;
    @Inject
    private InterfaceInterior interior;
    @Inject
    private Wheel[] wheels;


    public double getWeight() {
        double weight = 0;
        for (Wheel wheel : wheels) {
            weight += wheel.getWeight();
        }
        return weight + engine.getWeight() + body.getWeight() + frame.getWeight() + interior.getWeight();
    }

    @Override
    public String toString() {
        return "Engine: " + engine.toString() + " Body: " + body.toString() + " Wheels: " + Arrays.toString(wheels);
    }
}