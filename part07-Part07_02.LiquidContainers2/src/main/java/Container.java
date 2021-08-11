public class Container {

    private int amountOfLiquid = 0;
    private final int min = 0;
    private final int max = 100;

    public Container() {
    }

    public int contains() {
        return amountOfLiquid;
    }

    public void add(int amount) {
        if (amount <= 0) {
            return;
        }

        if ((amountOfLiquid + amount) > max) {
            amountOfLiquid = max;
        } else {
            amountOfLiquid += amount;
        }
    }

    public void remove(int amount) {
        if (amount <= 0) {
            return;
        }

        if ((amountOfLiquid - amount) < min) {
            amountOfLiquid = min;
        } else {
            amountOfLiquid -= amount;
        }
    }

    @Override
    public String toString() {
        return amountOfLiquid + "/" + max;
    }
}
