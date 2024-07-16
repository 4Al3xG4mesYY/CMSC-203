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

public class Plot {
    private int x;      // The x-coordinate of the lower-left corner
    private int y;      // The y-coordinate of the lower-left corner
    private int width;  // The width of the plot
    private int depth;  // The depth of the plot

    //Basic constructor with no @params
	public Plot() 
	{
		this.x = 1;
		this.y = 1;
	}
	
    /**
     * Constructor for Plot
     * 
     * @param x      The x-coordinate of the lower-left corner
     * @param y      The y-coordinate of the lower-left corner
     * @param width  The width of the plot
     * @param depth  The depth of the plot
     */
    public Plot(int x, int y, int width, int depth)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.depth = depth;
    }
    

    /**
     * Checks if this plot overlaps with another plot
     * 
     * @param other The other plot to check for overlap
     * @return true if the plots overlap, false otherwise
     */
    public boolean overlaps(Plot other)
    {
        return !(this.x + this.width <= other.x || 
                 other.x + other.width <= this.x ||
                 this.y + this.depth <= other.y || 
                 other.y + other.depth <= this.y);
    }
    
    /**
     * Checks if this plot encompasses another plot
     * 
     * @param other The other plot to check if it's encompassed
     * @return true if this plot encompasses the other plot, false otherwise
     */
    public boolean encompasses(Plot other) 
    {
        return this.x <= other.x &&
               this.y <= other.y &&
               (this.x + this.width) >= (other.x + other.width) &&
               (this.y + this.depth) >= (other.y + other.depth);
    }

    /**
     * Returns a string representation of the plot
     * 
     * @return A string in the format "x,y,width,depth"
     */
    @Override
    public String toString() {
        return String.format("%d,%d,%d,%d", x, y, width, depth);
    }

    // Getters
    public int getX() { return x; }
    public int getY() { return y; }
    public int getWidth() { return width; }
    public int getDepth() { return depth; }

    // Setters
    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }
    public void setWidth(int width) { this.width = width; }
    public void setDepth(int depth) { this.depth = depth; }
}
