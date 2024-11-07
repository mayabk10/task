public class TaskManager {

    public static void main(String[] args) {
        RegularTask Amir = new RegularTask("sdds",1);
        Category Dvash = new Category();
        Dvash.addTask(Amir);
        UrgentTask Chips = new UrgentTask("aaa",2,"gggg");
        Dvash.addTask(Chips);
        Dvash.displayAllTasks();

    }
}
