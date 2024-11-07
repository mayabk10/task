
public  class UrgentTask extends Task{
    protected String DeadLine;

    public UrgentTask(String description, int priority, String deadLine) {
        super(description, priority);
        DeadLine = deadLine;
    }



    @Override
    public String toString() {
        return "UrgentTask{" +
                "DeadLine='" + DeadLine + '\'' +
                ", description='" + description + '\'' +
                ", priority=" + priority +
                ", displayTask='" + displayTask + '\'' +
                '}';
    }
}
