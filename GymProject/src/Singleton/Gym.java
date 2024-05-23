package Singleton;

import Observer.Instructor;
import Observer.TrainingRegimen;

public class Gym {
    private static Gym instance;
    private Instructor instructor;
    private TrainingRegimen trainingRegimen;

    private Gym() {
        instructor = new Instructor();
        trainingRegimen = new TrainingRegimen();
    }

    public static Gym getInstance() {
        if (instance == null) {
            instance = new Gym();
        }
        return instance;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public TrainingRegimen getTrainingRegimen() {
        return trainingRegimen;
    }
}
