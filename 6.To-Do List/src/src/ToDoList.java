import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<Task> list;

    public ToDoList() {
        this.list = new ArrayList<>();
    }

    public void add(String name){
        Task task = new Task(name);
        list.add(task);
        System.out.println(task.getNume() + " a fost adaugat!");
    }

    public void remove(String name){
        boolean isFound = false;
        Task taskFound = new Task();
        for(var task : list){
            if(task.getNume().equalsIgnoreCase(name)){
                isFound = true;
                taskFound = task;
                break;
            }
        }

        if(isFound){
            list.remove(taskFound);
            System.out.println(taskFound.getNume() + " a fost inlaturat");
        }
        else {
            System.out.println("Taskul nu a fost gasit!");
        }
    }

    public void updateStatus(String name){
        boolean isFound = false;
        Task taskFound = new Task();
        for(var task : list){
            if(task.getNume().equalsIgnoreCase(name)){
                taskFound = task;
                isFound = true;
                break;
            }
        }

        if(isFound){
        if(taskFound.getStatus().equalsIgnoreCase("uncompleted")){
            taskFound.setStatus("completed");
        }else if(taskFound.getStatus().equalsIgnoreCase("completed")){
            taskFound.setStatus("uncompleted");
        }
        System.out.println(taskFound.getNume() + " a fost updatat");
        }
        else {
            System.out.println("Task not found!");
        }

    }

    public void showTasks(){
        for(var task : list){
            System.out.println(task.getNume() + " - " + "status: " + task.getStatus());
        }
    }

}
