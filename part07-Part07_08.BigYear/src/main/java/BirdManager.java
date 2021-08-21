import java.util.ArrayList;

public class BirdManager {
    ArrayList<Bird> birds = new ArrayList<>();

    public BirdManager(){}

    public void addBird(Bird bird){
        birds.add(bird);
    }

    public Bird getBird(String name){
        for (Bird bird : birds) {
            if (bird.getName().equals(name)){
                return bird;
            }
        }
        return null;
    }

    public ArrayList<Bird> getBirds() {
        return birds;
    }
}
