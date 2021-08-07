import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items = new ArrayList<>();
    private final int maximumWeight;

    public Suitcase(int maximumWeight){
        this.maximumWeight = maximumWeight;
    }

    public void addItem(Item item){
        if (item.getWeight() + totalWeight() > maximumWeight){
            return;
        }
        items.add(item);
    }

    public void printItems(){
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public int totalWeight(){
        int totalWeight = 0;
        for (Item item : items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    public Item heaviestItem(){
        if (items.isEmpty()){
            return null;
        }

        Item heaviest = items.get(0);
        for (Item item : items) {
            heaviest = heaviest.getWeight() > item.getWeight()? heaviest : item;
        }
        return heaviest;
    }

    @Override
    public String toString(){
        if (items.isEmpty()){
            return "no items (" + totalWeight() + " kg)";
        }

        if (items.size() == 1){
            return items.size() + " item (" + items.get(0).getWeight() + " kg)";
        }
        return items.size() + " items (" + totalWeight() + " kg)";
    }
}
