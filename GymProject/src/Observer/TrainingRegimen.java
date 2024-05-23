package Observer;

import Strategy.TrainingMode;

import java.util.ArrayList;
import java.util.List;



public class TrainingRegimen {
    private List<Exerciser> exercisers = new ArrayList<>();
    private TrainingMode trainingMode;

    public void setTrainingMode(TrainingMode mode) {
        this.trainingMode = mode;
        notifyExercisers();
    }

    public void addObserver(Exerciser exerciser) {
        exercisers.add(exerciser);
    }

    public void removeObserver(Exerciser exerciser) {
        exercisers.remove(exerciser);
    }

    private void notifyExercisers() {
        for (Exerciser exerciser : exercisers) {
            exerciser.update(trainingMode);
        }
    }

    public void executeCurrentRoutine() {
        if (trainingMode != null) {
            trainingMode.executeExerciseRoutine();  // Execute the current training mode's routine
        } else {
            System.out.println("No training mode set.");
        }
    }
}

