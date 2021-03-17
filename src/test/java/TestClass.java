import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestClass {

    private static MainClass uc;

    @BeforeClass
    public static void setup() {
        uc =new MainClass();
    }

    @Test
    //test case by SatyadevaNaidu
    public void test_distance_conveter() {
        assertEquals(30, uc.distace_converter(2));
    }

    @Test
    //test case by Jeevan Sai Koushik
    public void test_weight_conveter() {
        assertEquals(10,uc.weight_converter(5));
    }

    @Test
    //test case written by Aravind
    public void test_temperature_conveter() {
        assertEquals(60,uc.temperature_converter(20));
    }

    @Test
    //case of testing by syam kumar
    public void test_volume_conveter() {
        assertEquals(10,uc.volume_converter(4));
    }
}
