import java.util.Scanner;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class idwisewithhashmap_2 {

    public static void main(String[] args) {

        // Creating File object to access the text file
        File f1 = new File("E:\\Abiha\\SalesEVESession.txt");

        // Scanner object for reading file data
        Scanner inp;

        // Variable to store each line from file
        String dl;

        // HashMap to store:
        // Key   = Product Name
        // Value = Total Amount of that product
        HashMap<String, Double> hm = new HashMap<>();

        try {

            // Opening the file using Scanner
            inp = new Scanner(f1);

            // Reading first line (usually header line)
            dl = inp.nextLine();

            // Variables for quantity, amount and unit price
            double qty, amt, uPrice;

            // Loop runs until all lines are read
            while (inp.hasNextLine()) {

                // Read next line from file
                dl = inp.nextLine();

                // Skip empty lines
                if (dl.trim().length() == 0)
                    continue;

                // Split line data using tab delimiter
                String[] parts = dl.split("\t");

                // Extract product name
                String productName = parts[1];

                // Extract quantity
                qty = Double.parseDouble(parts[3]);

                // Extract unit price
                uPrice = Double.parseDouble(parts[2]);

                // Calculate amount
                amt = qty * uPrice;

                // If product already exists in HashMap,
                // add previous amount to current amount
                if (hm.containsKey(productName)) {
                    amt += hm.get(productName);
                }

                // Store updated amount in HashMap
                hm.put(productName, amt);
            }

        } catch (Exception e) {

            // Display error message if any exception occurs
            System.out.println("Error : " + e.getMessage());
        }

        // Display heading
        System.out.println("Product Wise Sum");

        // Traverse HashMap and display product with total amount
        for (Map.Entry<String, Double> me : hm.entrySet()) {

            System.out.println(me.getKey() + " --- " + me.getValue());
        }
    }
}
