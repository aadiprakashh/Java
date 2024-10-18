import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ipl {
    public static void main(String[] args) {
        List<Object[]> rows = new ArrayList<>(); // List to hold rows of data

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter data (first value as string, followed by 6 integers)");
        System.out.println("Enter 'exit' to stop & display the table.");

        while (true) {
            System.out.print("\nEnter Team Name Or 'exit' to EXIT: ");
            String firstValue = scanner.next();

            if (firstValue.equalsIgnoreCase("exit")) {
                break;
            }

            // Create a new array to hold the row of data
            Object[] rowData = new Object[7];
            rowData[0] = firstValue; // Store the string value
            String[] array = {"team_name","Points","Played_match","Score","Overs_Faced","Runs_Conceded","Overs_Bowled"};
            // Read 6 integer values
            
            for (int i = 1; i <= 6; i++) {
                System.out.print("Enter integer " + array[i] + ": ");
                rowData[i] = scanner.nextInt();
            }

            // Display the current row of data in table format
            displayRow(rowData);

            // Add the row of data to the list
            rows.add(rowData);
        }

        scanner.close();

        // Display the final table after all data has been entered
        displayTable(rows);
    }

    // Method to display a single row of data in table format
    private static void displayRow(Object[] rowData) {
        System.out.println("--------------------------------------------------------------------");
        System.out.printf("%-12s%-10s%-10s%-10s%-10s%-10s%-10s%n",
                "Team", "Points","MP", "Score", "Faced", "Run", "Bowled");
        System.out.println("---------------------------------------------------------------------");
        System.out.printf("%-12s%-10d%-10d%-10d%-10d%-10d%-10d%n",
                rowData[0], rowData[1], rowData[2], rowData[3], rowData[4], rowData[5], rowData[6]);
        System.out.println("--------------------------------------------------------------------");
    }

    // Method to display the entire table of data
    private static void displayTable(List<Object[]> rows) {
        System.out.println("\nTable:");
        for (Object[] rowData : rows) {
            System.out.println("--------------------------------------------------------------------");
            System.out.printf("%-12s%-10d%-10d%-10d%-10d%-10d%-10d%n",
                    rowData[0], rowData[1], rowData[2], rowData[3], rowData[4], rowData[5], rowData[6]);
        }
        System.out.println("--------------------------------------------------------------------");
        
    }
}
