import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HolidayBonusTestStudent {

    private double[][] dataSet1 = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8 } };

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testCalculateHolidayBonusA() {
        try {
            // Define the bonus amounts
            double highestBonus = 15000.0;
            double lowestBonus = 3000.0;
            double otherBonus = 4000.0;

            // Call the method with the required parameters
            double[] result = holidayBonus.calculateHolidayBonus(dataSet1, highestBonus, lowestBonus, otherBonus);
            assertEquals(3000.0, result[0], .001); // Store 0
            assertEquals(4000.0, result[1], .001); // Store 1
            assertEquals(15000.0, result[2], .001); // Store 2
        } catch (Exception e) {
            fail("This should not have caused an Exception");
        }
    }

    @Test
    public void testCalculateTotalHolidayBonusA() {
        // Define the bonus amounts
        double highestBonus = 15000.0;
        double lowestBonus = 3000.0;
        double otherBonus = 4000.0;

        // Call the method with the required parameters
        assertEquals(22000.0, holidayBonus.calculateTotalHolidayBonus(dataSet1, highestBonus, lowestBonus, otherBonus), .001);
    }
}
