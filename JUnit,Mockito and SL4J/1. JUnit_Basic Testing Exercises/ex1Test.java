import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ex1Test {
    @Test
    public void testAdd() {
        ex1 obj = new ex1();
        int result = obj.add(2, 3);
        assertEquals(5, result);
    }
}
