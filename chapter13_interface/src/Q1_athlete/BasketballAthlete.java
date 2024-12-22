package Q1_athlete;

public class BasketballAthlete extends Athlete implements English {
    public BasketballAthlete() {
    }

    public BasketballAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println("Basketball athlete learned basketball");
    }

    @Override
    public void learningEnglish() {
        System.out.println("Basketball athlete learned english");
    }
}
