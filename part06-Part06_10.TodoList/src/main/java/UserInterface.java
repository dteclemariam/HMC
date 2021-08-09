import java.util.Scanner;

public class UserInterface {

    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner){
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start(){

        boolean running = true;
        while (running){
            System.out.print("Command: ");
            String command = scanner.nextLine();

            switch (command){
                case "add":
                    add();
                    break;
                case "list":
                    list();
                    break;
                case "remove":
                    remove();
                    break;
                case "stop":
                    running = false;
                    break;
                default:
                    System.out.println("Unknown command!");

            }
        }
    }

    public void add(){
        System.out.print("To add: ");
        String listItem = scanner.nextLine();
        todoList.add(listItem);
    }

    public void list(){
        todoList.print();
    }

    public void remove(){
        System.out.print("Which one is removed? ");
        int numberToBeRemoved = Integer.valueOf(scanner.nextLine());
        todoList.remove(numberToBeRemoved);
    }
}
