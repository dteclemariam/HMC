public class Bird {
    private String name;
    private String latinName;
    private int obsersvations = 0;

    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
    }

    public void addObservation(){
        obsersvations++;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getObsersvations() {
        return obsersvations;
    }

    @Override
    public String toString(){
        return name + " (" + latinName + "): " + obsersvations + " observations";
    }


}
