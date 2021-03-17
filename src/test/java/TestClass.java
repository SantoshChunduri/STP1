import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestClass {

    private static MainClass stp;

    @BeforeClass
    public static void setup() {
        stp =new MainClass();
    }

    @Test
    //test case by Santosh chunduri
    public void test_hcf_calculator() {
        assertEquals(1, stp.hcf_calculator(2,3));
    }

    @Test
    public void test_lcm_calculator() {
        assertEquals(20, stp.lcm_calculator(5,4));
    }


}
