/**
 * ObjectArray Class
 *asfsagfsagfasgsag
 * This program demonstrates an Object array in Java that can store both numbers and strings.
 * The user specifies the array size and inputs elements. The program then:
 * 
 * 1. Displays elements in reverse order.
 * 2. Filters and sorts numeric elements, displaying them in ascending order.
 * 
 * The main method drives user interaction, data input, and output display.
 */
import java.util.*;

public class ObjectArray {
sdfdsffdgmj
    private Object[] array;  // Array to hold objects (numbers or strings)

    // Constructor that initializes the array with the specified size
    public ObjectArray(int size) {
        array = new Object[size];
    }

    // Method to populate the array with elements entered by the user
    public void populateArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + array.length + " elements (numbers and strings):");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextLine();
        }
    }

    // Method to display the array elements in reverse order
    public void displayReverseOrder() {
        System.out.println("Reverse Order:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Method to filter numeric elements, sort them, and display them along with their string pairs in ascending order
    public void displayAscendingOrder() {
        // List to store numeric elements with their associated strings
        List<String> numericElements = new ArrayList<>();

        for (Object obj : array) {
            String element = obj.toString();
            if (element.matches(".*\\d.*")) {  // Check if the string contains any digits
                numericElements.add(element);
            }
        }

        // Sort the numeric elements by extracting the numeric value
        numericElements.sort(Comparator.comparingInt(e -> Integer.parseInt(e.replaceAll("\\D", ""))));

        System.out.println("Ascending Order:");
        for (String elem : numericElements) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    // Main method for user interaction
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter size of the array: ");
        int size = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        // Create an instance of ObjectArray
        ObjectArray objArray = new ObjectArray(size);

        // Populate the array with user input
        objArray.populateArray();

        // Display the array elements in reverse order
        objArray.displayReverseOrder();

        // Display the numeric elements along with their associated strings in ascending order
        objArray.displayAscendingOrder();
    }
}
