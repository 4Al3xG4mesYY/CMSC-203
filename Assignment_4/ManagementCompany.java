//import java.util.Arrays;

/*
 * Class: CMSC203 
 * Instructor: Farnaz Eivazi
 * Description: (Get the plot of a rectangle and also checking for overlaps)
 * Due: 07/15/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Alexander Nguyen
*/

public class ManagementCompany {
	//Constant variables
	private final int MAX_PROPERTY = 5;
	private final int MGMT_WIDTH = 10;
	private final int MGMT_DEPTH = 10;
	
	//Class variables
	private String name;
	private String taxID;
	private double mgmFeePer;
	private Property[] properties;
    private Plot plot;
    private int numberOfProperties;

    /**
     * Constructs a `ManagementCompany` with default values.
     */
    public ManagementCompany() {
        this("", "", 0);
    }

    /**
     * Constructs a `ManagementCompany` with the specified name and tax ID.
     *
     * @param name  the name of the management company
     * @param taxID the tax ID of the management company
     */
    public ManagementCompany(String name, String taxID) {
        this(name, taxID, 0);
    }

    /**
     * Constructs a `ManagementCompany` with the specified name, tax ID, and management fee percentage.
     *
     * @param name       the name of the management company
     * @param taxID      the tax ID of the management company
     * @param mgmFeePer  the management fee percentage
     */
    public ManagementCompany(String name, String taxID, double mgmFeePer) {
        this.name = name;
        this.taxID = taxID;
        this.mgmFeePer = mgmFeePer;
        this.properties = new Property[MAX_PROPERTY];
        this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
        this.numberOfProperties = 0;
    }

    /**
     * Adds a property to the management company.
     *
     * @param property the property to be added
     * @return the index of the added property, or -1 if the array is full,
     *         -2 if the property is null, -3 if the plot is not encompassed by the management company plot,
     *         or -4 if the plot overlaps any other property's plot
     */
    public int addProperty(Property property) {
        if (numberOfProperties >= MAX_PROPERTY) {
            return -1;
        }
        if (property == null) {
            return -2;
        }
        if (!plot.encompasses(property.getPlot())) {
            return -3;
        }
        for (int i = 0; i < numberOfProperties; i++) {
            if (properties[i].getPlot().overlaps(property.getPlot())) {
                return -4;
            }
        }
        properties[numberOfProperties++] = property;
        return numberOfProperties - 1;
    }

    /**
     * Adds a property to the management company with the specified parameters.
     *
     * @param name      the name of the property
     * @param city      the city where the property is located
     * @param rent      the rent amount of the property
     * @param owner     the owner of the property
     * @param x         the x-coordinate of the property's plot
     * @param y         the y-coordinate of the property's plot
     * @param width     the width of the property's plot
     * @param depth     the depth of the property's plot
     * @return the index of the added property, or -1 if the array is full,
     *         -2 if the property is null, -3 if the plot is not encompassed by the management company plot,
     *         or -4 if the plot overlaps any other property's plot
     */
    public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth) {
        return addProperty(new Property(name, city, owner, rent, new Plot(x, y, width, depth)));
    }


    /**
     * Returns the total rent of all properties managed by the management company.
     *
     * @return the total rent
     */
    public double getTotalRent() {
        double totalRent = 0;
        for (int i = 0; i < numberOfProperties; i++) {
            totalRent += properties[i].getRentAmount();
        }
        return totalRent;
    }

    /**
     * Returns the property with the highest rent amount.
     *
     * @return the property with the highest rent amount, or null if there are no properties
     */
    public Property getHighestRentProperty() {
        if (numberOfProperties == 0) {
            return null;
        }
        Property highestRentProperty = properties[0];
        for (int i = 1; i < numberOfProperties; i++) {
            if (properties[i].getRentAmount() > highestRentProperty.getRentAmount()) {
                highestRentProperty = properties[i];
            }
        }
        return highestRentProperty;
    }

    /**
     * Removes the last property from the properties array.
     */
    public void removeLastProperty() {
        if (numberOfProperties > 0) {
            properties[numberOfProperties - 1] = null;
            numberOfProperties--;
        }
    }

    /**
     * Checks if the properties array has reached the maximum capacity.
     *
     * @return true if the array is full, false otherwise
     */
    public boolean isPropertiesFull() {
        return numberOfProperties >= MAX_PROPERTY;
    }

    /**
     * Returns the number of existing properties in the array.
     *
     * @return the number of properties
     */
    public int getPropertiesCount() {
        return numberOfProperties;
    }

    /**
     * Checks if the management fee percentage is valid (between 0 and 100).
     *
     * @return true if the management fee percentage is valid, false otherwise
     */
    public boolean isMangementFeeValid() {
        return mgmFeePer >= 0 && mgmFeePer <= 100;
    }

    /**
     * Returns the total management fee based on the total rent and the management fee percentage.
     *
     * @return the total management fee
     */
    public double getTotalManagementFee() {
        return getTotalRent() * mgmFeePer / 100;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("List of the properties for ").append(name).append(", taxID: ").append(taxID).append("\n");
        sb.append("______________________________________________________\n");
        for (int i = 0; i < numberOfProperties; i++) {
            sb.append(properties[i].toString()).append("\n");
        }
        sb.append("______________________________________________________\n");
        sb.append("\n");
        sb.append(" total management Fee: ").append(String.format("%.2f", getTotalManagementFee()));
        return sb.toString();
    }
}

