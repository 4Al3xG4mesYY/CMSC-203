import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ManagementCompanyTestStudent {
    private ManagementCompany managementCompany;

    @BeforeEach
    void setUp() throws Exception {
        managementCompany = new ManagementCompany("Railey", "555555555", 6);
    }

    @AfterEach
    void tearDown() throws Exception {
        managementCompany = null;
    }

    @Test
    void testAddProperty() {
        Property property = new Property("Sunsational", "Beckman", "BillyBob Wilson", 2613.0, new Plot(2, 5, 2, 2));
        assertEquals(managementCompany.addProperty(property), 0);
    }

    @Test
    void testAddPropertyOutsidePlot() {
        Property property = new Property("Sunsational", "Beckman", "BillyBob Wilson", 2613.0, new Plot(11, 11, 2, 2));
        assertEquals(managementCompany.addProperty(property), -3);
    }

    @Test
    void testAddPropertyOverlap() {
        Property property1 = new Property("Sunsational", "Beckman", "BillyBob Wilson", 2613.0, new Plot(2, 5, 2, 2));
        managementCompany.addProperty(property1);

        Property property2 = new Property("Ambiance", "Lakewood", "Tammy Taylor", 4114.0, new Plot(3, 6, 2, 2));
        assertEquals(managementCompany.addProperty(property2), -4);
    }

    @Test
    void testGetPropertiesCount() {
        Property property = new Property("Sunsational", "Beckman", "BillyBob Wilson", 2613.0, new Plot(2, 5, 2, 2));
        managementCompany.addProperty(property);
        assertEquals(managementCompany.getPropertiesCount(), 1);
    }

    @Test
    void testToString() {
        Property property = new Property("Sunsational", "Beckman", "BillyBob Wilson", 2613.0, new Plot(2, 5, 2, 2));
        managementCompany.addProperty(property);

        String expectedString = "List of the properties for Railey, taxID: 555555555\n"
                + "______________________________________________________\n"
                + "Sunsational,Beckman,BillyBob Wilson,2613.0\n"
                + "______________________________________________________\n"
                + "\n"
                + " total management Fee: 156.78";

        assertEquals(expectedString, managementCompany.toString());
    }
}
