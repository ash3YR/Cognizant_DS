import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AAATest {

    private List<String> list;

    @Before
    public void setUp() {
        // Setup method
        list = new ArrayList<>();
        System.out.println("Setup executed");
    }

    @After
    public void tearDown() {
        // Teardown method
        list.clear();
        System.out.println("Teardown executed");
    }

    @Test
    public void testListAddWithAAA() {
        // Arrange
        String item = "JUnit";

        // Act
        list.add(item);

        // Assert
        assertEquals(1, list.size());
        assertTrue(list.contains("JUnit"));
    }
}
