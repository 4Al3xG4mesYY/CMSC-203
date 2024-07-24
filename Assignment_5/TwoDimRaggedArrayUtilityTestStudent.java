import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * This class represents GFA test cases for a TwoDimRaggedArrayUtility object.
 * 
 */
public class TwoDimRaggedArrayUtilityTestStudent {
	private double[][] dataSet1;

	@Before
	public void setUp() throws Exception {
		dataSet1 = new double[][]{{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
	}

	@After
	public void tearDown() throws Exception {
		dataSet1 = null;
	}

	/**
	 * Test getRowTotal method
	 * Returns the total of all the elements of row 1.
	 * Row 0 refers to the first row in the two dimensional array
	 */
	@Test
	public void testGetRowTotal() {
		assertEquals(9.0, TwoDimRaggedArrayUtility.getRowTotal(dataSet1, 1), .001);
	}

	/**
	 * Test getColumnTotal method
	 * Returns the total of all the elements of column 2.
	 * Column 0 refers to the first column in the two dimensional array
	 */
	@Test
	public void testGetColumnTotal() {
	    assertEquals(11.0, TwoDimRaggedArrayUtility.getColumnTotal(dataSet1, 2), .001);
	}

	/*
	public void testGetColumnTotal() {
		assertEquals(18.0, TwoDimRaggedArrayUtility.getColumnTotal(dataSet1, 2), .001);
	}
	*/
	
	/**
	 * Test getHighestInRow method
	 * Returns the highest value in row 2.
	 */
	@Test
	public void testGetHighestInRow() {
		assertEquals(9.0, TwoDimRaggedArrayUtility.getHighestInRow(dataSet1, 2), .001);
	}

	/**
	 * Test getHighestInRowIndex method
	 * Returns the index of the highest value in row 2.
	 */
	@Test
	public void testGetHighestInRowIndex() {
		assertEquals(3, TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet1, 2));
	}

	/**
	 * Test getLowestInRow method
	 * Returns the lowest value in row 2.
	 */
	@Test
	public void testGetLowestInRow() {
		assertEquals(6.0, TwoDimRaggedArrayUtility.getLowestInRow(dataSet1, 2), .001);
	}

	/**
	 * Test getLowestInRowIndex method
	 * Returns the index of the lowest value in row 2.
	 */
	@Test
	public void testGetLowestInRowIndex() {
		assertEquals(0, TwoDimRaggedArrayUtility.getLowestInRowIndex(dataSet1, 2));
	}

	/**
	 * Test getTotal method
	 * Returns the total of all the elements in the array.
	 */
	@Test
	public void testGetTotal() {
		TwoDimRaggedArrayUtility utility = new TwoDimRaggedArrayUtility();
		assertEquals(45.0, utility.getTotal(dataSet1), .001);
	}

	/**
	 * Test getAverage method
	 * Returns the average of all the elements in the array.
	 */
	@Test
	public void testGetAverage() {
		TwoDimRaggedArrayUtility utility = new TwoDimRaggedArrayUtility();
		assertEquals(5.0, utility.getAverage(dataSet1), .001);
	}

	/**
	 * Test readFile method
	 * Reads a two-dimensional array from a file and verifies its contents.
	 */
	@Test
	public void testReadFile() throws FileNotFoundException {
		/*File file = new File("testdata.txt");
		double[][] expected = {{1.0, 2.0, 3.0}, {4.0, 5.0}, {6.0, 7.0, 8.0, 9.0}};
		double[][] result = TwoDimRaggedArrayUtility.readFile(file);
		assertArrayEquals(expected, result);
		*/
		File file = new File("C:\\Users\\4lex_4\\Downloads\\holidayBonus\\src\\holidayBonus\\testdata");
		if (!file.exists()) {
			fail("File not found: " + file.getAbsolutePath());
		}
		double[][] expected = {{1.0, 2.0, 3.0}, {4.0, 5.0}, {6.0, 7.0, 8.0, 9.0}};
		double[][] result = TwoDimRaggedArrayUtility.readFile(file);
		assertArrayEquals(expected, result);
	}

	/**
	 * Test writeToFile method
	 * Writes a two-dimensional array to a file and reads it back to verify its contents.
	 */
	@Test
	public void testWriteToFile() throws IOException {
		File file = new File("outputdata.txt");
		TwoDimRaggedArrayUtility.writeToFile(dataSet1, file);
		double[][] result = TwoDimRaggedArrayUtility.readFile(file);
		assertArrayEquals(dataSet1, result);
	}

	/**
	 * Test getHighestInColumn method
	 * Returns the highest value in column 2.
	 */
	@Test
	public void testGetHighestInColumn() {
		assertEquals(8.0, TwoDimRaggedArrayUtility.getHighestInColumn(dataSet1, 2), .001);
	}

	/**
	 * Test getHighestInColumnIndex method
	 * Returns the index of the highest value in column 2.
	 */
	@Test
	public void testGetHighestInColumnIndex() {
		assertEquals(2, TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataSet1, 2));
	}

	/**
	 * Test getLowestInColumn method
	 * Returns the lowest value in column 2.
	 */
	@Test
	public void testGetLowestInColumn() {
		assertEquals(3.0, TwoDimRaggedArrayUtility.getLowestInColumn(dataSet1, 2), .001);
	}

	/**
	 * Test getLowestInColumnIndex method
	 * Returns the index of the lowest value in column 2.
	 */
	@Test
	public void testGetLowestInColumnIndex() {
		assertEquals(0, TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet1, 2));
	}

	/**
	 * Test getHighestInArray method
	 * Returns the highest value in the array.
	 */
	@Test
	public void testGetHighestInArray() {
		assertEquals(9.0, TwoDimRaggedArrayUtility.getHighestInArray(dataSet1), .001);
	}

	/**
	 * Test getLowestInArray method
	 * Returns the lowest value in the array.
	 */
	@Test
	public void testGetLowestInArray() {
		assertEquals(1.0, TwoDimRaggedArrayUtility.getLowestInArray(dataSet1), .001);
	}
}
