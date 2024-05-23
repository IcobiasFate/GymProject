package Main;

import Decorator.BasicTrainingProgram;
import Decorator.CardioDecorator;
import Decorator.StrengthTrainingDecorator;
import Decorator.TrainingProgram;
import Observer.GymMember;
import Observer.Instructor;
import Observer.TrainingRegimen;
import Singleton.Gym;
import Strategy.CardioMode;
import Strategy.StrengthTrainingMode;

public class GymSystem {
    public static void main(String[] args) {
        // Singleton instance of Gym
        Gym gym = Gym.getInstance();

        // Get instructor and training regimen
        Instructor instructor = gym.getInstructor();
        TrainingRegimen trainingRegimen = gym.getTrainingRegimen();

        // Create exercisers and add them to the observer list
        GymMember member1 = new GymMember("Alice");
        GymMember member2 = new GymMember("Bob");
        GymMember member3 = new GymMember("Hristo");

        trainingRegimen.addObserver(member1);
        trainingRegimen.addObserver(member2);
        trainingRegimen.addObserver(member3);

        //Uncomment instructor and regimen to switch

        // Change training mode to Cardio
        instructor.changeTrainingMode(trainingRegimen, new CardioMode());
        trainingRegimen.executeCurrentRoutine();  // Execute the routine for Cardio mode

        // Change training mode to Strength Training
        //instructor.changeTrainingMode(trainingRegimen, new StrengthTrainingMode());
       //trainingRegimen.executeCurrentRoutine();  // Execute the routine for Strength Training mode

        // Create a basic training program and decorate it with additional exercises
        TrainingProgram basicProgram = new BasicTrainingProgram();
        TrainingProgram cardioProgram = new CardioDecorator(basicProgram);
        TrainingProgram fullProgram = new StrengthTrainingDecorator(cardioProgram);

        // Display the final training program description and cost
        System.out.println("Final Training Program: " + basicProgram.getDescription());

    }
}

