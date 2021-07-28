public class Counter {

    private int number;

    public Counter(){
        this.number = 0;
    }

    public Counter(int startNumber){
        this.number = startNumber;
    }

    public int value(){
        return number;
    }

    public void increase(){
        number++;
    }

    public void decrease(){
        number--;
    }

    public void increase(int value){
        if (value > 0){
            number += value;
        }
    }

    public void decrease(int value){
        if (value > 0) {
            number -= value;
        }
    }
}
