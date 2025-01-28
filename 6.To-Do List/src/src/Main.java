import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Generarea unui ToDoList
        ToDoList lista = new ToDoList();
        boolean isRunning = true;

        //Initializarea aplicatiei
        while (isRunning) {
            System.out.println("Welcome to your ToDoList!");
            System.out.println("Pick an action from the menu below...");
            System.out.println("Meniu");
            System.out.println("1. Add a task");
            System.out.println("2. Update status");
            System.out.println("3. Remove a task");
            System.out.println("4. Show the entire ToDo list!");
            System.out.println("5. Exit...");
            System.out.println("Introdu numarul corespunzator operatiunii...");

            Scanner scanner = new Scanner(System.in);
            int choice = 0;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Only digits!");
            }

            switch (choice) {
                case 1 -> {
                    System.out.println("What is the name of the task?");
                    String name = scanner.next();
                    lista.add(name);
                }
                case 2 -> {
                    System.out.println("What task do you want to update?");
                    String name = scanner.next();
                    lista.updateStatus(name);
                }
                case 3 -> {
                    System.out.println("What task do you want to remove?");
                    String name = scanner.next();
                    lista.remove(name);
                }
                case 4 -> {
                    System.out.println("Show the entire ToDo list");
                    lista.showTasks();
                }
                case 5 -> {
                    System.out.println("Bye bye!");
                    isRunning = false;
                }
                default -> System.out.println("Optiunea nu este valida!");
            }
        }
    }
}