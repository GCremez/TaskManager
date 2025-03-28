/* import java.time.LocalDate;

public class Task {

    // Instance field for Task

    protected String title;
    protected String description;
    protected boolean completed;
    private boolean delete;
    protected LocalDate dueDate;

    // Constructor

    public Task(String title, String description, LocalDate dueDate) {
        this.title = title;
        this.description = description;
        this.completed = false;
        this.delete = false;
        this.dueDate = dueDate;
    }

    public void markCompleted () {
        this.completed = true;
    }

    public boolean isCompleted() {
        return completed;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }
    public void deletedTask () {
        this.delete = true;
    }
    
    // Getters 
    public String getTitle() {
        return title;
    }
    
    public String getDescription() {
        return description;
    }
    

    public boolean isDelete() {
        return delete;
    }
    
    // to print task 
    @Override
    public String toString() {
        String printResult = "[ " + (completed ? "X" : " ") + " ] " +
                title + ": " + " (Due: " + dueDate + ")" + description;
        return printResult;
    }

}

 */
