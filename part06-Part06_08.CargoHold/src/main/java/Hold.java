import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcases = new ArrayList<>();
    private int maximumWeight;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Suitcase suitcase : suitcases) {
            totalWeight += suitcase.totalWeight();
        }
        return totalWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() + totalWeight() > maximumWeight) {
            return;
        }
        suitcases.add(suitcase);
    }

    public void printItems(){
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }

    @Override
    public String toString() {
        if (suitcases.isEmpty()) {
            return "no items (" + totalWeight() + " kg)";
        }

        if (suitcases.size() == 1) {
            return suitcases.size() + " suitcase (" + suitcases.get(0).totalWeight() + " kg)";
        }
        return suitcases.size() + " suitcases (" + totalWeight() + " kg)";
    }
}

