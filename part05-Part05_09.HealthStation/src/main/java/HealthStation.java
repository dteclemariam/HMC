
public class HealthStation {

    private int totalWeighings;


    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        totalWeighings++;
        return person.getWeight();

    }

    public void feed(Person p){
        p.setWeight(p.getWeight() + 1);
    }

    public int weighings(){
        return totalWeighings;
    }

}
