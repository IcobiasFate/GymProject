package Decorator;

public class CardioDecorator extends TrainingProgramDecorator {
    public CardioDecorator(TrainingProgram trainingProgram) {
        super(trainingProgram);
    }

    @Override
    public String getDescription() {
        return decoratedTrainingProgram.getDescription() + ", with Cardio";
    }


}
