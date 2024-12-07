import java.util.Scanner; // Import the Scanner class to read user input

public class PE_ComputeTax { // Define the class PE_ComputeTax
    public static void main(String[] args) { // Define the main method
        // Tax rates for different income levels
        double[] rates = {0.10,  0.15,  0.25,  0.28,  0.33,  0.35};

        // Tax brackets for different filing statuses
        int[][] brackets = {
            {8350,  33950,  82250,  171550,  372950},        // Single filer
            {16700,  67900,  137050,  208850,  372950},     // Married jointly or qualifying widow(er)
            {8350,  33950,  68525,  104425,  186475},       // Married separately
            {11950,  45500,  117450,  190200,  372950}     // Head of household
        };

        Scanner input = new Scanner(System.in); // Create a new Scanner object to read user input

        // Prompt the user to enter filing status
        System.out.println("(0-single filer,  1-married jointly or qualifying widow(er),");
        System.out.println("2-married separately,  3-head of household)");
        System.out.print("Enter the filing status:  ");
        int status = input.nextInt(); // Read the user's input for filing status

        // Validate the filing status
        if (status < 0 || status > 3) {
            System.out.println("Error: invalid status"); // Print an error message if the status is invalid
            System.exit(1); // Exit the program with an error code
        }

        // Prompt the user to enter taxable income
        System.out.print("Enter the taxable income:  ");
        double income = input.nextDouble(); // Read the user's input for taxable income

        // Compute tax based on the filing status and taxable income
        double tax = computeTax(brackets[status],  rates,  income);

        // Display the result with line breaks
        System.out.println("===== Tax Calculation Result =====");
        System.out.println("Filing Status: " + status);
        System.out.println("Taxable Income: " + income);
        System.out.println("Tax is: " + (int) (tax * 100) / 100.0); // Print the computed tax amount
    }

    /**
     * Compute the tax for given income based on brackets and rates
     */
    public static double computeTax(int[] brackets,  double[] rates,  double income) {
        double tax = 0; // Initialize the tax amount to 0
        int lastBracket = 0; // Initialize the last bracket to 0

        // Iterate over each bracket
        for (int i = 0; i < brackets.length; i++) {
            // If the income is less than or equal to the current bracket
            if (income <= brackets[i]) {
                // Add the tax for the income up to the current bracket
                tax += (income - lastBracket) * rates[i];
                return tax; // Return the computed tax amount
            } else {
                // Add the tax for the income in the current bracket
                tax += (brackets[i] - lastBracket) * rates[i];
                lastBracket = brackets[i]; // Update the last bracket to the current bracket
            }
        }

        // Add the remaining income exceeding the last bracket
        tax += (income - lastBracket) * rates[rates.length - 1];
        return tax; // Return the computed tax amount
    }
}