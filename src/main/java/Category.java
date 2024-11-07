import java.util.ArrayList;
import java.util.Arrays;

public class Category {
   protected String name;
   protected ArrayList<Task> tasks;
   public void addTask(Task task){
       this.tasks.add(task);
   }
   public void removeTask(Task task){
       this.tasks.remove(task);
   }
   public void displayAllTasks(){
       for (int i=0;i<this.tasks.size();i++){
           System.out.println(this.tasks.get(i));
       }
   }
}
