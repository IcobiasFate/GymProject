package Strategy;

public class StrengthTrainingMode implements TrainingMode {
    @Override
    public String getDescription() {
        return "Strength Training Mode";
    }

    @Override
    public void executeExerciseRoutine() {
        System.out.println("Executing a Strength Training exercise routine: Weightlifting, Push-ups, Squats.");
    }
}



