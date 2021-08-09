import java.util.ArrayList;

public class ExerciseManagement {

    private ArrayList<Exercise> exercises;

    public ExerciseManagement(){
        this.exercises = new ArrayList<>();
    }

    public ArrayList<String> exerciseList(){
        ArrayList<String> list = new ArrayList<>();
        for (Exercise exercise : exercises) {
            list.add(exercise.getName());
        }
        return list;
    }

    public void add(String exercise){
        exercises.add(new Exercise(exercise));
    }

    public void markAsCompleted(String exercise){
        for (Exercise currentExercise : exercises) {
            if (currentExercise.getName().equals(exercise)){
                currentExercise.setCompleted(true);
            }
        }

    }

    public boolean isCompleted(String exercise){
        for (Exercise currentExercise : exercises) {
            if (currentExercise.getName().equals(exercise)){
                return currentExercise.isCompleted();
            }
        }
        return false;
    }

}
