import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class InjectConfig extends AbstractModule {
    Wheel[] wheels;

    protected void configure() {
        bind(IBody.class).to(Body.class);
        bind(IEngine.class).to(Engine.class);
        bind(InterfaceInterior.class).to(Interior.class);
        bind(IFrame.class).to(Frame.class);
        bind(ITire.class).to(Summer.class);
        wheels = new Wheel[4];
        for (int i = 0; i < wheels.length; i++) {

            wheels[i] = new Wheel("" + i);
            requestInjection(wheels[i]);
            //wheels[i] = new Wheel("" + i, new Summer());
        }
    }

    @Provides
    Wheel[] provideWheels() {
        return wheels;

    }
}
