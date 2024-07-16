import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class PlotTestStudent {
    private Plot plot1, plot2, plot3, plot4, plot5;

    @BeforeEach
    public void setUp() throws Exception {
        plot1 = new Plot(2, 2, 6, 6);
        plot2 = new Plot(3, 4, 4, 3);
        plot3 = new Plot(1, 1, 2, 2);
        plot4 = new Plot(8, 8, 2, 2);
        plot5 = new Plot(2, 2, 6, 6);
    }

    @AfterEach
    public void tearDown() throws Exception {
        plot1 = plot2 = plot3 = plot4 = plot5 = null;
    }

    @Test
    public void testOverlaps() {
        assertTrue(plot1.overlaps(plot2), "plot2 is entirely inside plot1");
        assertTrue(plot2.overlaps(plot1), "plot1 contains plot2");
        assertTrue(plot1.overlaps(plot3), "plot3 overlaps with plot1");
        assertFalse(plot1.overlaps(plot4), "plot4 does not overlap with plot1");
    }

    @Test
    public void testEncompasses() {
        assertTrue(plot1.encompasses(plot2), "plot1 encompasses plot2");
        assertFalse(plot2.encompasses(plot1), "plot2 does not encompass plot1");
        assertFalse(plot1.encompasses(plot3), "plot1 does not encompass plot3");
        assertTrue(plot1.encompasses(plot5), "plot1 encompasses plot5 (same dimensions)");
    }

    @Test
    public void testToString() {
        assertEquals("2,2,6,6", plot1.toString(), "plot1 toString");
        assertEquals("3,4,4,3", plot2.toString(), "plot2 toString");
    }

    @Test
    public void testGetters() {
        assertEquals(2, plot1.getX(), "plot1 getX");
        assertEquals(2, plot1.getY(), "plot1 getY");
        assertEquals(6, plot1.getWidth(), "plot1 getWidth");
        assertEquals(6, plot1.getDepth(), "plot1 getDepth");
    }

    @Test
    public void testSetters() {
        plot1.setX(1);
        plot1.setY(1);
        plot1.setWidth(5);
        plot1.setDepth(5);
        assertEquals("1,1,5,5", plot1.toString(), "plot1 after setters");
    }
}
