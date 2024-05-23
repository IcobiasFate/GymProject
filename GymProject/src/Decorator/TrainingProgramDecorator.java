package Decorator;

public abstract class TrainingProgramDecorator implements TrainingProgram {
    protected TrainingProgram decoratedTrainingProgram;

    public TrainingProgramDecorator(TrainingProgram trainingProgram) {
        this.decoratedTrainingProgram = trainingProgram;
    }

    @Override
    public String getDescription() {
        return decoratedTrainingProgram.getDescription();
    }


}
