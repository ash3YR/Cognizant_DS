import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTests {

    @Test
    @Order(1)
    public void testFirst() {
        System.out.println("This is executed first");
    }

    @Test
    @Order(2)
    public void testSecond() {
        System.out.println("This is executed second");
    }

    @Test
    @Order(3)
    public void testThird() {
        System.out.println("This is executed third");
    }
}
