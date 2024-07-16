import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyTestStudent {
    Property propertyOne;

    @BeforeEach
    void setUp() throws Exception {
        propertyOne = new Property("Property ABC", "Rockville", "Wells Fargo Bank", 2450.00);
    }

    @AfterEach
    void tearDown() throws Exception {
        propertyOne = null;
    }

    @Test
    void testGetPropertyName() {
        assertEquals("Property ABC", propertyOne.getPropertyName());
    }

    @Test
    void testSetPropertyName() {
        propertyOne.setPropertyName("New Property XYZ");
        assertEquals("New Property XYZ", propertyOne.getPropertyName());
    }

    @Test
    void testGetCity() {
        assertEquals("Rockville", propertyOne.getCity());
    }

    @Test
    void testSetCity() {
        propertyOne.setCity("Baltimore");
        assertEquals("Baltimore", propertyOne.getCity());
    }

    @Test
    void testGetOwner() {
        assertEquals("Wells Fargo Bank", propertyOne.getOwner());
    }

    @Test
    void testSetOwner() {
        propertyOne.setOwner("Bank of America");
        assertEquals("Bank of America", propertyOne.getOwner());
    }

    @Test
    void testGetRentAmount() {
        assertEquals(2450.00, propertyOne.getRentAmount());
    }

    @Test
    void testSetRentAmount() {
        propertyOne.setRentAmount(3000.00);
        assertEquals(3000.00, propertyOne.getRentAmount());
    }

    @Test
    void testGetPlot() {
        Plot plot = propertyOne.getPlot();
        assertNotNull(plot);
        assertEquals(0, plot.getX()); // x
        assertEquals(0, plot.getY()); // y
        assertEquals(1, plot.getWidth()); // width
        assertEquals(1, plot.getDepth()); // Depth
    }


    @Test
    void testSetPlot() {
        Plot newPlot = new Plot(1, 1, 2, 2);
        propertyOne.setPlot(newPlot);
        assertEquals(newPlot, propertyOne.getPlot());
    }

    @Test
    void testToString() {
        assertEquals("Property ABC,Rockville,Wells Fargo Bank,2450.0", propertyOne.toString());
    }
}
