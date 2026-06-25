import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MathUtilsTest {
    @Test
    public void testMultiply() {
        MathUtils utils = new MathUtils();
        assertEquals(10, utils.multiply(2, 5));
    }

    @Test
    public void testDivide() {
        MathUtils utils = new MathUtils();
        assertEquals(2, utils.divide(10, 5));
    }
}
