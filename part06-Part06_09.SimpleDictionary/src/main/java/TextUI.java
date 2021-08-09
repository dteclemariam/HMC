import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary sd;

    public TextUI(Scanner scanner, SimpleDictionary sd){
        this.scanner = scanner;
        this.sd = sd;
    }

    public void start(){
        boolean running = true;
        while (running){
            System.out.print("Command: ");
            String command = scanner.nextLine();

            switch (command){
                case "end":
                    end();
                    running = false;
                    break;
                case "add":
                    add();
                    break;
                case "search":
                    search();
                    break;
                default:
                    System.out.println("Unknown command");
            }
        }
    }

    public void add(){
        System.out.print("Word: ");
        String word = scanner.nextLine();
        System.out.print("Translation: ");
        String translation = scanner.nextLine();;
        sd.add(word, translation);
    }

    public void search(){
        System.out.print("To be translated: ");
        String word = scanner.nextLine();
        if (sd.translate(word) == null){
            System.out.println("Word " + word + " was not found");
        }else{
            System.out.println("Translation: " + sd.translate(word));
        }
    }

    public void end(){
        System.out.println("Bye bye!");
    }
}
