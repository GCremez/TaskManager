/* import java.util.ArrayList;

public class TaskManager< T extend Task> {
    private List<T> tasks = new ArrayList<>();


    // Add a new task
    public void addTask (T task){
        tasks.add(task);
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
    public void deleteTask(int deleteIndex) {
        int index = 0;
        if (index < tasks.size()) {
            Task removed = tasks.remove(index);
            System.out.println("Deleted Task: " + removed.getTitle());
        } else {
            System.out.println("Invalid Task Number");
        }
    }

}

*/
