import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;


@Category({SlowTests.class, FastTests.class})
public class B {
    @Test
    public void c(){
        assertEquals("test B.c", 1, 1);
    }
}