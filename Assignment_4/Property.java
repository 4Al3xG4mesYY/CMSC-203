/*
 * Class: CMSC203 
 * Instructor: Farnaz Eivazi
 * Description: (This class gets the value of the property name, city, owner, rent amount, and plot points)
 * Due: 07/15/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Alexander Nguyen
*/

public class Property {
    private String propertyName;
    private String city;
    private String owner;
    private double rentAmount;
    private Plot plot;

    //Basic constructor with no @params
    public Property() 
    {
		this.plot = new Plot();
	}
    
    /**
     * Constructor for Property
     * 
     * @param propertyName The name of the property
     * @param city The city where the property is located
     * @param owner The owner of the property
     * @param rentAmount The rental amount for the property
     */
    
    public Property(String propertyName, String city, String owner, double rentAmount) 
    {
        this.propertyName = propertyName;
        this.city = city;
        this.owner = owner;
        this.rentAmount = rentAmount;
        this.plot = new Plot(0, 0, 1, 1); // Default plot as per the test case
    }
    
    /**
     * Get the property name
     * 
     * @return The property name
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * Set the property name
     * 
     * @param propertyName The new property name
     */
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    /**
     * Get the city
     * 
     * @return The city
     */
    public String getCity() {
        return city;
    }

    /**
     * Set the city
     * 
     * @param city The new city
     */
    public void setCity(String city) {
        this.city = city;
    }
    
    /**
     * Get the owner
     * 
     * @return The owner
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Set the owner
     * 
     * @param owner The new owner
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * Get the rent amount
     * 
     * @return The rent amount
     */
    public double getRentAmount() {
        return rentAmount;
    }

    /**
     * Set the rent amount
     * 
     * @param rentAmount The new rent amount
     */
    public void setRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
    }

    /**
     * Get the plot
     * 
     * @return The plot
     */
    public Plot getPlot() {
        return this.plot;
    }

    /**
     * Set the plot
     * 
     * @param plot The new plot
     */
    public void setPlot(Plot plot) {
        this.plot = plot;
    }

    /**
     * Returns a string representation of the property
     * 
     * @return A string in the format "propertyName,city,owner,rentAmount"
     */
    @Override
    public String toString() {
        return String.format("%s,%s,%s,%.1f", 
                             propertyName, city, owner, rentAmount);
    }
}
