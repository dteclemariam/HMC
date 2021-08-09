import java.util.Scanner;

public class UserInterface {
    private JokeManager jokeManager;
    private Scanner scanner;

    public UserInterface(JokeManager jokeManager, Scanner scanner){
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }

    public void start(){
        boolean running = true;
        while (running){
            System.out.println("Commands:\n" +
                    "1 - add a joke\n" +
                    "2 - draw a joke\n" +
                    "3 - list jokes\n" +
                    "X - stop");
            String command = scanner.nextLine();

            switch (command){
                case "1":
                    add();
                    break;
                case "2":
                    System.out.println(jokeManager.drawJoke());;
                    break;
                case "3":
                    jokeManager.printJokes();
                    break;
                case "X":
                    running = false;
                    break;
                default:
                    continue;
            }
        }
    }

    public void add(){
        System.out.println("Write joke to be added:");
        String joke = scanner.nextLine();
        jokeManager.addJoke(joke);
    }
}
