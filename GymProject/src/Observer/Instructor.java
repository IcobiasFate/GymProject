package Observer;

import Strategy.TrainingMode;

public class Instructor {
    public void changeTrainingMode(TrainingRegimen trainingRegimen, TrainingMode mode) {
        trainingRegimen.setTrainingMode(mode);
    }
}

