import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Task> tasks = new ArrayList<>();


    // Add a new task
    public void addTask (String title, String description){
        Task newTask = new Task(title, description);
        tasks.add(newTask);
    }

    // Show Dem tasks
    public void viewTasks () {
        if (tasks.isEmpty()) {
            System.out.println("No task Yet.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println(i + 1 + ". " + tasks.get(i));
            }
        }
    }

    // Mark Task as Done
    public void completeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markCompleted();
            System.out.println("Task is mark as done");
        } else {
            System.out.println("Invalid Task Number");
        }
    }

    // Delete Task
    public void deleteTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            Task removed = tasks.remove(index);
            System.out.println("Deleted Task: " + removed.getTitle());
        } else {
            System.out.println("Invalid Task Number");
        }
    }

}
