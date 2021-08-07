import java.util.ArrayList;

public class Stack {

    ArrayList<String> stack = new ArrayList<>();

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public void add(String value){
        stack.add(value);
    }

    public ArrayList<String> values(){
        return stack;
    }

    public String take() {
        String currentObject = stack.get(stack.size() - 1);
        stack.remove(stack.get(stack.size() - 1));
        return currentObject;
    }
}
