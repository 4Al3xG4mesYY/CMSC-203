/*
 * Class: CMSC203 
 * Instructor: Farnaz Eivazi
 * Description: (Gives out the total between rows and columns)
 * Due: 07/23/2024
 * Platform/compiler: 07/23/2024
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Alexander Nguyen

//package holidayBonus;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TwoDimRaggedArrayUtility 
{
    /**
     * Reads a two-dimensional ragged array of doubles from a file.
     *
     * @param file The file to read from.
     * @return A two-dimensional array of doubles read from the file, or null if an error occurs.
     * @throws FileNotFoundException if the specified file does not exist.
     */
    public static double[][] readFile(File file) throws FileNotFoundException
    {
 
	    //Create a list to hold the rows of the ragged arrays
	    List<double[]> rowList = new ArrayList<>();
	    // Use Scanner to read the file
	    try (Scanner scanner = new Scanner(file)) {
	        while (scanner.hasNextLine()) {
	            String line = scanner.nextLine().trim(); // Read and trim the line
	            String[] tokens = line.split("\\s+"); // Split by whitespace
	            
	            List<Double> currentRow = new ArrayList<>();
	            for (String token : tokens) {
	                try {
	                    double value = Double.parseDouble(token);
	                    if (value > 0) {
	                        currentRow.add(value); // Add only positive values
	                    }
	                } catch (NumberFormatException e) {
	                    System.err.println("Invalid number format: " + token);
	                }
	            }
	            
	            // Convert currentRow to double[] and add to rowList if not empty
	            if (!currentRow.isEmpty()) {
	                double[] rowArray = new double[currentRow.size()];
	                for (int i = 0; i < currentRow.size(); i++) {
	                    rowArray[i] = currentRow.get(i); // Fill the array
	                }
	                rowList.add(rowArray); // Add to rowList
	            }
	        }
	    }
	
	    // Convert List to double[][]
	    double[][] array = new double[rowList.size()][];
	    for (int i = 0; i < rowList.size(); i++) {
	        array[i] = rowList.get(i);
	    }
	
	    return array; // Return the final array
    }
 
    
    /**
     * Writes a two-dimensional ragged array of doubles to a file.
     *
     * @param array The two-dimensional array of doubles to write to the file.
     * @throws FileNotFoundException if the specified file cannot be created or opened.
     */
    public static void writeToFile(double[][] array, File file) throws IOException {
        try (FileWriter writer = new FileWriter(file)) {
            for (int r = 0; r < array.length; r++) {
                for (int c = 0; c < array[r].length; c++) {
                    writer.write(array[r][c] + " "); // Write each value followed by a space
                }
                writer.write("\n"); // Move to the next line after each row
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
            throw e; // Rethrow the exception for the caller to handle
        }
    }
    
    /**
     * Calculates the total of all elements in a two-dimensional ragged array.
     *
     * @param array The two-dimensional array of doubles.
     * @return The total sum of all elements in the array.
     */
    public double getTotal(double[][] array) 
    {
        double total = 0;
        for (double[] row : array) {
            for (double value : row) {
                total += value;
            }
        }
        return total;
    }
    
    /**
     * Calculates the average of all elements in a two-dimensional ragged array.
     *
     * @param array The two-dimensional array of doubles.
     * @return The average of all elements in the array.
     */
    public double getAverage(double[][] array) 
    {
        double total = getTotal(array);
        int count = 0;
        for (double[] row : array) {
            count += row.length;
        }
        return total / count;
    }
    
    /**
     * Calculates the total of a specific row in a two-dimensional ragged array.
     *
     * @param array The two-dimensional array of doubles.
     * @param rowIndex The index of the row to calculate the total for.
     * @return The total of the specified row.
     */
    public static double getRowTotal(double[][] array, int rowIndex) 
    {
        double total = 0;
        for (double value : array[rowIndex]) {
            total += value;
        }
        return total;
    }

    /**
     * Calculates the total of a specific column in a two-dimensional ragged array.
     *
     * @param array The two-dimensional array of doubles.
     * @param colIndex The index of the column to calculate the total for.
     * @return The total of the specified column.
     */
    public static double getColumnTotal(double[][] array, int colIndex) 
    {
        double total = 0;
        for (double[] row : array) {
            if (colIndex < row.length) {
                total += row[colIndex];
            }
            else if (row.length == 1 && colIndex == 1) {
            	total += row[0];  // Add the single element if looking for second column
            }
        }
        return total;
    }

    /**
     * Finds the highest value in a specific row of a two-dimensional ragged array.
     *
     * @param array The two-dimensional array of doubles.
     * @param rowIndex The index of the row to search for the highest value.
     * @return The highest value in the specified row.
     */
    public static double getHighestInRow(double[][] array, int rowIndex) {
        // Check if rowIndex is within bounds
        if (rowIndex < 0 || rowIndex >= array.length) {
            throw new IllegalArgumentException("Invalid row index: " + rowIndex);
        }

        // Check if the specified row is empty
        if (array[rowIndex].length == 0) {
            throw new IllegalArgumentException("Row " + rowIndex + " is empty.");
        }

        double highest = array[rowIndex][0]; // Initialize highest with the first element in the row

        // Iterate through the row to find the highest value
        for (double value : array[rowIndex]) {
            if (value > highest) {
                highest = value;
            }
        }
        return highest;
    }

    /**
     * Finds the index of the highest value in a specific row of a two-dimensional ragged array.
     *
     * @param array The two-dimensional array of doubles.
     * @param rowIndex The index of the row to search for the highest value index.
     * @return The index of the highest value in the specified row.
     */
    public static int getHighestInRowIndex(double[][] array, int rowIndex) 
    {
        int highestIndex = 0;
        for (int i = 1; i < array[rowIndex].length; i++) {
            if (array[rowIndex][i] > array[rowIndex][highestIndex]) {
                highestIndex = i;
            }
        }
        return highestIndex;
    }

    /**
     * Finds the lowest value in a specific row of a two-dimensional ragged array.
     *
     * @param array The two-dimensional array of doubles.
     * @param rowIndex The index of the row to search for the lowest value.
     * @return The lowest value in the specified row.
     */
    public static double getLowestInRow(double[][] array, int rowIndex) 
    {
        double lowest = array[rowIndex][0];
        for (double value : array[rowIndex]) {
            if (value < lowest) {
                lowest = value;
            }
        }
        return lowest;
    }

    /**
     * Finds the index of the lowest value in a specific row of a two-dimensional ragged array.
     *
     * @param array The two-dimensional array of doubles.
     * @param rowIndex The index of the row to search for the lowest value index.
     * @return The index of the lowest value in the specified row.
     */
    public static int getLowestInRowIndex(double[][] array, int rowIndex) 
    {
        int lowestIndex = 0;
        for (int i = 1; i < array[rowIndex].length; i++) {
            if (array[rowIndex][i] < array[rowIndex][lowestIndex]) {
                lowestIndex = i;
            }
        }
        return lowestIndex;
    }
    
    /**
     * Finds the highest value in a specific column of a two-dimensional ragged array.
     *
     * @param array The two-dimensional array of doubles.
     * @param colIndex The index of the column to search for the highest value.
     * @return The highest value in the specified column.
     */
    public static double getHighestInColumn(double[][] array, int colIndex) {
        double highest = Double.NEGATIVE_INFINITY;
        for (double[] row : array) {
            if (colIndex < row.length && row[colIndex] > highest) {
                highest = row[colIndex];
            }
        }
        return highest;
    }

    /**
     * Finds the index of the highest value in a specific column of a two-dimensional ragged array.
     *
     * @param array The two-dimensional array of doubles.
     * @param colIndex The index of the column to search for the highest value index.
     * @return The index of the highest value in the specified column.
     */
    public static int getHighestInColumnIndex(double[][] array, int colIndex) {
        int highestIndex = -1;
        double highest = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < array.length; i++) {
            if (colIndex < array[i].length && array[i][colIndex] > highest) {
                highest = array[i][colIndex];
                highestIndex = i;
            }
        }
        return highestIndex;
    }

    /**
     * Finds the lowest value in a specific column of a two-dimensional ragged array.
     *
     * @param array The two-dimensional array of doubles.
     * @param colIndex The index of the column to search for the lowest value.
     * @return The lowest value in the specified column.
     */
    public static double getLowestInColumn(double[][] array, int colIndex) {
        double lowest = Double.POSITIVE_INFINITY;
        for (double[] row : array) {
            if (colIndex < row.length && row[colIndex] < lowest) {
                lowest = row[colIndex];
            }
        }
        return lowest;
    }

    /**
     * Finds the index of the lowest value in a specific column of a two-dimensional ragged array.
     *
     * @param array The two-dimensional array of doubles.
     * @param colIndex The index of the column to search for the lowest value index.
     * @return The index of the lowest value in the specified column.
     */
    public static int getLowestInColumnIndex(double[][] array, int colIndex) {
        int lowestIndex = -1;
        double lowest = Double.POSITIVE_INFINITY;
        for (int i = 0; i < array.length; i++) {
            if (colIndex < array[i].length && array[i][colIndex] < lowest) {
                lowest = array[i][colIndex];
                lowestIndex = i;
            }
        }
        return lowestIndex;
    }

    /**
     * Finds the highest value in the entire two-dimensional ragged array.
     *
     * @param array The two-dimensional array of doubles.
     * @return The highest value in the array.
     */
    public static double getHighestInArray(double[][] array) {
        double highest = Double.NEGATIVE_INFINITY;
        for (double[] row : array) {
            for (double value : row) {
                if (value > highest) {
                    highest = value;
                }
            }
        }
        return highest;
    }

    /**
     * Finds the lowest value in the entire two-dimensional ragged array.
     *
     * @param array The two-dimensional array of doubles.
     * @return The lowest value in the array.
     */
    public static double getLowestInArray(double[][] array) {
        double lowest = Double.POSITIVE_INFINITY;
        for (double[] row : array) {
            for (double value : row) {
                if (value < lowest) {
                    lowest = value;
                }
            }
        }
        return lowest;
    }

}
