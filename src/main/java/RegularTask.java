import java.util.Date;
public  class RegularTask extends Task{

    public RegularTask(String description, int priority) {
        super(description, priority);
    }

    @Override
    public String toString() {
        return "RegularTask{" +
                "priority=" + priority +
                ", description='" + description + '\'' +
                ", displayTask='" + displayTask + '\'' +
                '}';
    }
}