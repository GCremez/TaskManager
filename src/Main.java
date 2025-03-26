import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        // Choice is what the Variable that the user input is assign to.
        int choice;

        /* user need to tell the program what they what to do...
        SO, some conditional Statement with DO and SWITCH statements
         */

        do {
            System.out.println("\n==== Task Manager ====");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Complete Task");
            System.out.println("4. Delete Task");
            System.out.println("0. Exit");
            System.out.println("Choose An Option: ");

            choice = scanner.nextInt();

            // catch the next line
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Title: ");
                    String title = scanner.nextLine();
                    System.out.println("Description ");
                    String description = scanner.nextLine();
                    manager.addTask(title, description);
                    break;
                case 2:
                    manager.viewTasks();
                    break;
                case 3:
                    System.out.print("Enter task number to complete: ");
                    int index = scanner.nextInt() - 1;
                    manager.completeTask(index);
                    break;
                case 4:
                    manager.viewTasks();
                    System.out.print("Enter task number to complete: ");
                    int deleteIndex = scanner.nextInt() - 1;
                    manager.completeTask(deleteIndex);
                    break;
                case 0:
                    System.out.println("Exiting... Goodbye!");
                    break;
                default: System.out.println("Invalid option.");
            }

        } while (choice != 0);

        scanner.close();

    }
}
