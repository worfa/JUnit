import org.junit.Test;

import static org.junit.Assert.*;

public class FirstDayAtSchoolTestPrepareMyBag {

    FirstDayAtSchool firstDayAtSchool = new FirstDayAtSchool();

    String[] bag = {"Books",  "Notebooks", "Pens"};

    @Test
    public void testPrepareMyBag() {

        System.out.println("Inside testPrepareMyBag()");
        assertArrayEquals(bag,firstDayAtSchool.prepareMyBag());
    }
}