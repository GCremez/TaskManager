import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;


abstract class Task {
    protected String title;
    protected boolean completed;
    protected LocalDate dueDate;

    public Task(String title, LocalDate dueDate) {
        this.title = title;
        this.completed = false;
        this.dueDate = dueDate;
    }

    public void markCompleted() {
        this.completed = true;
    }

    public boolean isCompleted() {
        return completed;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "[ " + (completed ? "X" : " ") + " ] " + title + " (Due: " + dueDate + ")";
    }
}

class WorkTask extends Task {
    private String projectName;

    public WorkTask(String title, LocalDate dueDate, String projectName) {
        super(title, dueDate);
        this.projectName = projectName;
    }

    @Override
    public String toString() {
        return super.toString() + " [Work - Project: " + projectName + "]";
    }
}

class PersonalTask extends Task {
    private String category;

    public PersonalTask(String title, LocalDate dueDate, String category) {
        super(title, dueDate);
        this.category = category;
    }

    @Override
    public String toString() {
        return super.toString() + " [Personal - Category: " + category + "]";
    }
}

class TaskManager<T extends Task> {
    private List<T> tasks = new ArrayList<>();

    public void addTask(T task) {
        tasks.add(task);
    }

    public void removeTask(T task) {
        tasks.remove(task);
    }

    public void displayTasks() {
        for (T task : tasks) {
            System.out.println(task);
        }
    }

    public List<T> getTasks() {
        return tasks;
    }

    public void sortByDueDate() {
        tasks.sort(Comparator.comparing(Task::getDueDate));
    }

    public void sortByTitle() {
        tasks.sort(Comparator.comparing(Task::getTitle));
    }

    public List<T> filterByCompletion(boolean completed) {
        return tasks.stream()
                .filter(task -> task.isCompleted() == completed)
                .collect(Collectors.toList());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager<Task> manager = new TaskManager<>();

        while (true) {
            System.out.println("\nTask Manager - Choose an option:");
            System.out.println("1. Add Work Task");
            System.out.println("2. Add Personal Task");
            System.out.println("3. View All Tasks");
            System.out.println("4. Sort by Due Date");
            System.out.println("5. Sort by Title");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task title: ");
                    String workTitle = scanner.nextLine();
                    System.out.print("Enter due date (YYYY-MM-DD): ");
                    LocalDate workDueDate = LocalDate.parse(scanner.nextLine());
                    System.out.print("Enter project name: ");
                    String projectName = scanner.nextLine();
                    manager.addTask(new WorkTask(workTitle, workDueDate, projectName));
                    break;
                case 2:
                    System.out.print("Enter task title: ");
                    String personalTitle = scanner.nextLine();
                    System.out.print("Enter due date (YYYY-MM-DD): ");
                    LocalDate personalDueDate = LocalDate.parse(scanner.nextLine());
                    System.out.print("Enter category: ");
                    String category = scanner.nextLine();
                    manager.addTask(new PersonalTask(personalTitle, personalDueDate, category));
                    break;
                case 3:
                    System.out.println("\nAll Tasks:");
                    manager.displayTasks();
                    break;
                case 4:
                    manager.sortByDueDate();
                    System.out.println("\nTasks Sorted by Due Date:");
                    manager.displayTasks();
                    break;
                case 5:
                    manager.sortByTitle();
                    System.out.println("\nTasks Sorted by Title:");
                    manager.displayTasks();
                    break;
                case 6:
                    System.out.println("Exiting Task Manager.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
