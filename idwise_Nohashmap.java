import java.io.File;
import java.util.Scanner;

public class idwisewithouthashmap_2 {

    public static void main(String[] args) {

        try {

            // Creating file object
            File file = new File("E:\\inayah\\SalesEVESession.txt");

            // Scanner object to read file
            Scanner sc = new Scanner(file);

            // Skip first line (header)
            sc.nextLine();

            // Array to store IDs
            String[] ids = new String[1000];

            // Array to store total sums
            double[] sums = new double[1000];

            // Variable to track number of unique IDs
            int count = 0;

            // Read file line by line
            while (sc.hasNextLine()) {

                // Read one line
                String line = sc.nextLine();

                // Skip empty lines
                if (line.trim().length() == 0)
                    continue;

                // Split line using tab separator
                String[] data = line.split("\t");

                // Extract ID from column
                String id = data[5];

                // Extract unit price
                double unitPrice = Double.parseDouble(data[2]);

                // Extract quantity
                int qty = Integer.parseInt(data[3]);

                // Calculate total amount
                double total = unitPrice * qty;

                // Variable to check if ID already exists
                boolean found = false;

                // Search existing IDs
                for (int i = 0; i < count; i++) {

                    // If ID already exists
                    if (ids[i].equals(id)) {

                        // Add total to existing sum
                        sums[i] += total;

                        found = true;
                        break;
                    }
                }

                // If ID is new
                if (!found) {

                    // Store ID in array
                    ids[count] = id;

                    // Store total amount
                    sums[count] = total;

                    // Increase count
                    count++;
                }
            }

            // Display heading
            System.out.println("ID Wise Sum");

            // Display all IDs with their sums
            for (int i = 0; i < count; i++) {

                System.out.println(ids[i] + " = " + sums[i]);
            }

            // Close scanner
            sc.close();

        } catch (Exception e) {

            // Display error message
            System.out.println("Error : " + e.getMessage());
        }
    }
}
