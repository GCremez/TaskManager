public class Task {

    // Instance field for Task

    private String title;
    private String description;
    private boolean completed;
    private boolean delete;

    // Constructor

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.completed = false;
        this.delete = false;
    }

    public void markCompleted () {
        this.completed = true;
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
    
    public boolean isCompleted() {
        return completed;
    }

    public boolean isDelete() {
        return delete;
    }
    
    // to print task 
    
    public String toString() {
        String printResult = "[ " + (completed ? "X" : " ") + " ] " +
                title + ": " + description;
        return printResult;
    }

}
