package Q1_athlete;

public class TennisAthlete extends Athlete implements English {
    public TennisAthlete() {
    }

    public TennisAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println("TennisAthlete learn tennis");
    }

    @Override
    public void learningEnglish() {
        System.out.println("TennisAthlete learn english");
    }
}
