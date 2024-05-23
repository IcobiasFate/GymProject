package Strategy;

public class CardioMode implements TrainingMode {
    @Override
    public String getDescription() {
        return "Cardio Training Mode";
    }

    @Override
    public void executeExerciseRoutine() {
        System.out.println("Executing a Cardio exercise routine: Running, Jumping Jacks, Cycling.");
    }
}

