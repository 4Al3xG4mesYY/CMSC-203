public class holidayBonus {
    /**
     * Calculates holiday bonuses for each store based on sales data.
     *
     * @param salesData A two-dimensional ragged array of doubles representing sales.
     * @param highestBonus Bonus amount for the store with the highest sales.
     * @param lowestBonus Bonus amount for the store with the lowest sales.
     * @param otherBonus Bonus amount for all other stores.
     * @return An array of doubles representing the holiday bonuses for each store.
     */
    public static double[] calculateHolidayBonus(double[][] salesData, double highestBonus, double lowestBonus, double otherBonus) {
        double[] bonuses = new double[salesData.length];
        double[] totalSales = new double[salesData.length];

        // Calculate total sales for each store
        for (int i = 0; i < salesData.length; i++) {
            double storeTotal = 0;
            for (double sale : salesData[i]) {
                storeTotal += sale;
            }
            totalSales[i] = storeTotal;
        }

        // Determine highest and lowest sales
        double highestSales = Double.NEGATIVE_INFINITY;
        double lowestSales = Double.POSITIVE_INFINITY;
        int highestIndex = -1;
        int lowestIndex = -1;

        for (int i = 0; i < totalSales.length; i++) {
            if (totalSales[i] > highestSales) {
                highestSales = totalSales[i];
                highestIndex = i;
            }
            if (totalSales[i] < lowestSales) {
                lowestSales = totalSales[i];
                lowestIndex = i;
            }
        }

        // Calculate bonuses based on highest and lowest sales
        for (int i = 0; i < totalSales.length; i++) {
            if (i == highestIndex) {
                bonuses[i] = highestBonus;
            } else if (i == lowestIndex) {
                bonuses[i] = lowestBonus;
            } else {
                bonuses[i] = otherBonus;
            }
        }

        return bonuses;
    }

    /**
     * Calculates the total holiday bonuses for all stores in the district.
     *
     * @param salesData A two-dimensional ragged array of doubles representing sales.
     * @param highestBonus Bonus amount for the store with the highest sales.
     * @param lowestBonus Bonus amount for the store with the lowest sales.
     * @param otherBonus Bonus amount for all other stores.
     * @return The total of all holiday bonuses for the district.
     */
    public static double calculateTotalHolidayBonus(double[][] salesData, double highestBonus, double lowestBonus, double otherBonus) {
        double[] bonuses = calculateHolidayBonus(salesData, highestBonus, lowestBonus, otherBonus);
        double totalBonus = 0;

        for (double bonus : bonuses) {
            totalBonus += bonus;
        }

        return totalBonus;
    }
}
