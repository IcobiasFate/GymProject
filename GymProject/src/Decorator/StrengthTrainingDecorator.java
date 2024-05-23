package Decorator;

public class StrengthTrainingDecorator extends TrainingProgramDecorator {
    public StrengthTrainingDecorator(TrainingProgram trainingProgram) {
        super(trainingProgram);
    }

    @Override
    public String getDescription() {
        return decoratedTrainingProgram.getDescription() + ", with Strength Training";
    }


}
