import junit.framework.TestCase
import org.junit.Test

class TestSimpleClass extends TestCase {
    SimpleClass sc = new SimpleClass("Stefan", 23)

    @Test
    public void test1() {
        // check the name
        assertFalse(sc.name != "Stefan")

        // check the age
        assertFalse(sc.age != 23)

        // else
        assertTrue(true)
    }

}
