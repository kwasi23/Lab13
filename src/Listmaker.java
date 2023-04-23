
import java.util.*;

public class Listmaker {
    // Declare a private static ArrayList of strings to store the items in the list
    private static List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        // Declare a String variable to store the file name
        String fileName = "";
        // Create an infinite loop to display the menu and read user input
        while (true) {
            // Display the menu options
            System.out.println("\n***MENU***");//prints out the title of the menu
            System.out.println("Select an option:");//the line prompts the user to select an option from the menu
            System.out.println("A - Add an item to the list");//this line displays the option to add an item to the list
            System.out.println("D - Delete an item from the list");//this line displays the option to delete an item from the list
            System.out.println("V - View the list");//this line displays the option to view the current list
            System.out.println("O - Open a list file from disk");//this displays the option to open a list file from disk
            System.out.println("S - Save the current list file to disk");//displays the option to save the current list to disk
            System.out.println("C - Clear the list");//displays the option to clear the current list
            System.out.println("Q - Quit the program");//displays the option to quit the program
            System.out.print("\nEnter your choice: ");//prompts the user to enter their choice from the menu

            // Read the user's input and convert it to uppercase
            String option = scanner.nextLine().toUpperCase();
            // Use a switch statement to perform the appropriate action based on the user's input
            switch (option) {
                // If the user chooses "A", prompt them to enter an item to add to the list and add it to the ArrayList
                case "A"://checks if the user slelected the a option
                    System.out.print("Enter an item to add: ");//prompts the user to enter an item to add to the list
                    String newItem = scanner.nextLine();//reads the users input for the new item and stores it in a string vriable called new item
                    list.add(newItem);//dd the new item to the list
                    break;//exits the switch stastement and returns control bck to the while loop to display the menu again
                // If the user chooses "D", prompt them to enter the index of the item to delete and remove it from the ArrayList
                case "D":
                    System.out.print("Enter the index of the item to delete: ");//prints a message to the console asking the user to enter the index of the item they want to delete
                    int index = Integer.parseInt(scanner.nextLine());//reads the users input from the console as a string, converts it to an integer using interger method and results  to the index variable
                    if (index < 0 || index >= list.size()) {//checks if the user input is a valid index for the list. if the input is less than 0 or greater than or equal to the size of the list code insde curly braces excuted
                        System.out.println("Invalid index!");//prints eroor
                    } else {//if input is a valid index the code inside the curly braces will be ran
                        list.remove(index);//removes the item at the specified index from the list
                    }
                    break;//exits the switch statement and continues execution after the switch block
                // If the user chooses "V", call the viewList method to display the contents of the ArrayList
                case "V":
                    viewList();
                    break;
                // If the user chooses "O", prompt them to enter a file name and call the openListFile method to read the list items from the file
                case "O":
                    System.out.print("Enter the file name to open: ");
                    fileName = scanner.nextLine();
                    openListFile(fileName);
                    break;
                // If the user chooses "S", call the saveListFile method to write the list items to the file
                case "S":
                    if (!fileName.equals("")) {
                        saveListFile(fileName);
                    } else {
                        System.out.println("No file is open to save!");
                    }
                    break;
                // If the user chooses "C", clear the contents of the ArrayList
                case "C":
                    list.clear();
                    break;
                // If the user chooses "Q", exit the program
                case "Q":
                    System.exit(0);
                    // If the user enters an invalid option, display an error message
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }
    }

    private static void openListFile(String fileName) {//read the contents of a file with the given file name and add them to the list
    }
    private static void saveListFile(String fileName) {//write the contents of the list to a file with the given file name
    }
    // Define a private static method to display the contents of the ArrayList
    private static void viewList() {//declares a private method
        System.out.println("Current list:");//prints a message indicating that the current list is about to be displayed
        for (int i = 0; i < list.size(); i++) {//starts a for loop that will iterate through each item in the list
            System.out.println(i + ": " + list.get(i));//prints the index of the current item in the list followed by the item itself.
        }
    }}

// Define a private static method to read
