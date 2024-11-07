public abstract class Task {
    protected String description;
    protected int priority;
    protected String displayTask;



    public Task(String description, int priority) {
        this.description = description;
        this.priority = priority;
    }
    public String displayTask() {
        return this.displayTask;
    }
}