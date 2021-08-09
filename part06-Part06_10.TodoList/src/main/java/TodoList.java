import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> list = new ArrayList<>();

    public TodoList(){

    }

    public void add(String task){
        if (list.contains(task)){
            return;
        }
        list.add(task);
    }

    public void print(){
        for (String task : list) {
            System.out.println((list.indexOf(task) + 1) + ": " + task);
        }
    }

    public void remove(int taskNr){
        int indexOfTask = taskNr - 1;

        if (indexOfTask < 0 || indexOfTask >= list.size() ){
            return;
        }
        list.remove(taskNr - 1);
    }
}
