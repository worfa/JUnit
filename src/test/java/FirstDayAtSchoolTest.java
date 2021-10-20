import org.junit.Test;

import static org.junit.Assert.*;

public class FirstDayAtSchoolTest {

    FirstDayAtSchool firstDayAtSchool = new FirstDayAtSchool();

    String[] bag = {"Books",  "Notebooks", "Pens", "Pencils"};

    @Test
    public void addPencils() {
            System.out.println("Inside testPrepareMyBag()");
            assertArrayEquals(bag,firstDayAtSchool.addPencils());
    }
}