import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testInjector {
    private Car car;

    @BeforeEach
    void init() {
        Injector injector = Guice.createInjector(new InjectConfig());
        car = injector.getInstance(Car.class);
    }

    @Test
    void testInjector() {
        System.out.println(car.getWeight());
    }
}
