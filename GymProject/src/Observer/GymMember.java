package Observer;

import Strategy.TrainingMode;

public class GymMember implements Exerciser {
    private String name;

    public GymMember(String name) {
        this.name = name;
    }

    @Override
    public void update(TrainingMode trainingMode) {
        System.out.println(name + " received update: " + trainingMode.getDescription());
    }
}
