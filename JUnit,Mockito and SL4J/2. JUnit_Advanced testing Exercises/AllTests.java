import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ EvenCheckerTest.class, DummyTest.class })
public class AllTests {
    // This class remains empty, it's used only as a holder for the above annotations
}
