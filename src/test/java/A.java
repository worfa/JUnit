import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;

public class A {

    @Test
    public void a() {
        assertEquals(1,1);
    }

    @Category(SlowTests.class)
    @Test
    public void b() {
        assertEquals("test A.b",1,1);
    }
}
